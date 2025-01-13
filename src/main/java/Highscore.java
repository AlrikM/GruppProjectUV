import java.util.*;

// skapar en TreeMap som passar bra för en lista med namn och resultat
public class Highscore {
    public TreeMap<Integer, String> scores;
// ändrar så att största talet är först
    public Highscore() {
        scores = new TreeMap<>((Collections.reverseOrder()));

    }
    // metod som lägger in i TreeMap:en
    public void addScore(String name, int score) {
        scores.put(score, name);
    }

    // loopar fem gånger så vi får topp fem resultat och skriver ut
    public void displayTopScores() {
        System.out.println("Top 5 Scores:");
        int count = 0;
        for (Map.Entry<Integer, String> entry : scores.entrySet()) {
            System.out.println((++count) + ". " + entry.getValue() + " - " + entry.getKey());
            if (count >= 5) break;
        }
    }
}