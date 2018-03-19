package domain;

public class Location {
    private int row;
    private int column;

    Location(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public int getColumn() {
        return this.column;
    }
}
