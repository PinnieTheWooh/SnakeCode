package SNek.Participants;

public class Participant {
    private String naam;
    private int score;

    public Participant(String naam, int score) {
        this.naam = naam;
        this.score = score;
    }

    public String getNaam() {
        return naam;
    }

    public int getScore() {
        return score;
    }
}
