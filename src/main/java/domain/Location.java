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
    public int getRow() {
        return this.row;
    }

    public void move(int index) {
        if(index > this.column) {
            moveRight();
        }

        if(index < this.column) {
            moveLeft();
        }
    }

    public int moveRight() {
        return ++this.column;
    }

    public int moveLeft() {
        return --this.column;
    }

    public void nextRow(int countOfLines) {
        if(countOfLines != this.row) {
            ++this.row;
        }
    }

    @Override
    public String toString() {
        return "row : " + this.row + " col : " + this.column;
    }
}
