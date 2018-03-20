package domain;

import java.util.Objects;

public class Player {
    private String name;
    //    private Location location;
    private int index;

    public Player(String name, int index) {
        this.name = name;
        this.index = index;
    }

    public Player next(String name) {
        return new Player(name, index + 1);
    }

    public int getIndex() {
        return this.index;
    }

    public String getName() {
        return this.name;
    }

    public void move(int resultIndex) {
        if (index < resultIndex) {
            moveRight();
        }
        if (index > resultIndex) {
            moveLeft();
        }
    }

    public int moveRight() {
        return ++index;
    }

    public int moveLeft() {
        return --index;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player pair = (Player)o;
        return this.getName().equals(pair.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name);
    }
}
