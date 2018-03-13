public class LadderGame {
    private String[] ladderLines;
    private LadderLine ladderLine;

    public LadderGame(int peopleCount, int height) {
        ladderLines = new String[height];
        ladderLine = new LadderLine(peopleCount);
        getLines(height);
    }

    public void getLines(int height) {
        for (int i = 0; i < height; i++) {
            this.ladderLines[i] = ladderLine.getLine();
        }
    }

    public String[] getLadderLines() {
        return this.ladderLines;
    }
}