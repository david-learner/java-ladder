package domain;

public class LadderGame {
    private LadderLine[] ladderLine;
    private Player[] players;

    LadderGame(String[] namesOfPersons, int height) {
        int countOfPersons = namesOfPersons.length;
        this.ladderLine = new LadderLine[height];
        makePlayers(namesOfPersons);
        getLines(countOfPersons, height);
        startMatch(this.players, this.ladderLine);
    }

    public Player[] getPlayers() {
        return this.players;
    }

    private void makePlayers(String[] namesOfPersons) {
        this.players = new Player[namesOfPersons.length];
        for (int i = 0; i < namesOfPersons.length; i++) {
            Coordinates point = new Coordinates(0, i);
            this.players[i] = new Player(namesOfPersons[i], point);
        }
    }

    private void getLines(int countOfPersons, int height) {
        for (int i = 0; i < height; i++) {
            this.ladderLine[i] = new LadderLine(countOfPersons);
        }
    }

    public LadderLine[] getLadderLine() {
        return this.ladderLine;
    }

    private void startMatch(Player[] players, LadderLine[] ladderLines) {
        LadderMatch ladderMatch = new LadderMatch(players, ladderLines);
    }
}