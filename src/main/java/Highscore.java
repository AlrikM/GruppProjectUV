import java.util.*;

public class Highscore {
    public TreeMap<Integer, String> scores;

    public Highscore() {
        scores = new TreeMap<>((Collections.reverseOrder()));

    }
    public void addScore(String name, int score) {
        scores.put(score, name);
    }


    public void displayTopScores() {
        System.out.println("Top 5 Scores:");
        int count = 0;
        for (Map.Entry<Integer, String> entry : scores.entrySet()) {
            System.out.println((++count) + ". " + entry.getValue() + " - " + entry.getKey());
            if (count >= 5) break;
        }
    }
}