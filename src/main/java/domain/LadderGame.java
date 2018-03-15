package domain;

public class LadderGame {
    private LadderLine[] ladderLine;
    private String[] namesOfPersons;
    private Player[] players;

    LadderGame(String[] namesOfPersons, int height) {
        int countOfPersons = namesOfPersons.length;

        this.ladderLine = new LadderLine[height];
        this.namesOfPersons = namesOfPersons;
        getLines(countOfPersons, height);
    }

    public Player[] getPlayers() {
        return this.players;
    }

    private void makePlayers(String[] namesOfPersons) {
        for (int i = 0; i < namesOfPersons.length; i++) {
            players[i] = new Player(namesOfPersons[i]);
        }
    }

    public String[] getNamesOfPersons() {
        return this.namesOfPersons;
    }

    private void getLines(int countOfPersons, int height) {
        for (int i = 0; i < height; i++) {
            this.ladderLine[i] = new LadderLine(countOfPersons);
        }
    }

    public LadderLine[] getLadderLine() {
        return this.ladderLine;
    }
}