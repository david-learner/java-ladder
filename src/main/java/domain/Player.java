package domain;

public class Player {
    private String name;
    private Location location;

    public Player(String name, Location location) {
        this.name = name;
        this.location = location;
    }

    public Player next(String name) {
        Location location = new Location(0, this.location.getColumn() + 1);
        return new Player(name, location);
    }

    public Location getLocation() {
        return this.location;
    }

    public String getName() {
        return this.name;
    }
}
