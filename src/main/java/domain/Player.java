package domain;

public class Player {
    private String name;
    private Coordinates point;

    public Player (String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
