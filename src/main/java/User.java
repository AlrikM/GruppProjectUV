public class User {
    private int score;
    private String name;

    public User() {
        this.score = 0;
        this.name = null;
    }

    public int correct() {
        return score++;
    }

    public String setName(String name) {
        return this.name = name;
    }
}
