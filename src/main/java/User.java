public class User {
    private int score;
    private String name;

    public User() {
        this.score = 0;
        this.name = null;
    }

    public int setScore(int score) {
        return this.score = score;
    }

    public  int getScore() { return score;}

    public String setName(String name) {
        return this.name = name;
    }

    public String getName() { return name;}
}
