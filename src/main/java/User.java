public class User {
    private int score;
    private String name;

    public User() {
        this.score = 0;
        this.name = null;
    }

    /**
     *
     * set a new score for priavate int score in object User
     */
    public int setScore(int score) {
        return this.score = score;
    }

    /**
     *get score from object User
     */
    public  int getScore() { return score;}

    /**
     *
     * set variable Name from param name
     */
    public String setName(String name) {
        return this.name = name;
    }

    /**
     *
     * get name from object
     */
    public String getName() { return name;}
}
