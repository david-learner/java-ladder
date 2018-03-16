package domain;

public class Coordinates {
    private int row;
    private int column;

    Coordinates(int row, int column) {
        this.row = row;
        this.column = column;
    }

    // 사다리 게임에서는 오직 down
    public void moveRow() {
        this.row++;
    }

    public int getColumn() {
        return this.column;
    }

    public int getRow() {
        return this.row;
    }

    public void moveColumn(int playerColumn, int bridgeColumn) {
        if(playerColumn == bridgeColumn) {
            moveRight();
        }
        if(playerColumn > 0 && playerColumn > bridgeColumn) {
            moveLeft();
        }
    }

    private void moveRight() {
        this.column++;
    }

    private void moveLeft() {
        this.column--;
    }
}
