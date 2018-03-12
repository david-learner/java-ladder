import java.util.Random;

public class LadderGame {
    private char[][] ladderBase;

    public LadderGame(int peopleCount, int height) {
        // peopleCount가 2이상일 때
        this.ladderBase = new char[peopleCount + 2][height];
    }

    public void inputLadderLine() {
        int columnCount = getColumns();
        for (int i = 1; i < columnCount; i += 2) {
            // System.out.println(i);
            inputDash(i);
        }

        for (int i = 0; i < columnCount; i += 2) {
            inputPipe(i);
        }
    }

    public char[][] getLadderBase() {
        return this.ladderBase;
    }

    public void inputDash(int colIndex) {
        int rowCount = getRows();
        for (int j = 0; j < rowCount; j++) {
            ladderBase[j][colIndex] = getDash(j, colIndex);
        }
    }

    public void inputPipe(int colIndex) {
        int rowCount = getRows();
        for (int j = 0; j < rowCount; j++) {
            ladderBase[j][colIndex] = '|';
        }
    }

    public boolean isOverlap(int rowIndex, int colIndex) {
        if( colIndex >= 3 && ladderBase[rowIndex][colIndex-2] != '-') {
            return false;
        }

        if( colIndex == 1 ) {
            return false;
        }
        return true;
    }

    public char getDash(int rowIndex, int colIndex) {
        if ( !isOverlap(rowIndex, colIndex) && getRandomNo() == 1) {
            return '-';
        }
        return ' ';
    }

    public int getRandomNo() {
        Random random = new Random();
        return random.nextInt(2);
    }

    public int getColumns() {
        return ladderBase[0].length;
    }

    public int getRows() {
        return ladderBase.length;
    }
}
