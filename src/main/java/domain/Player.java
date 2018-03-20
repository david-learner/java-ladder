package domain;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        return this.name.equals(o);
    }

    // hashCode는 여기서 어떤 역할을 하는가?
    @Override
    public int hashCode() {
        return Objects.hash(this.name);
    }
}
