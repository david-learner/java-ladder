package domain;

public class LadderGame {
    private LadderLine[] ladderLine;
    private Player[] players;

    LadderGame(LadderGameDTO dto) {
        int countOfPersons = dto.getNamesOfPersons().length;
        this.ladderLine = new LadderLine[dto.getHeight()];
        makePlayers(dto.getNamesOfPersons());
        dto.setPlayers(this.getPlayers());
        getLines(countOfPersons, dto.getHeight());
        startMatch(this.players, this.ladderLine);
        giveRewards(dto.getRewards());
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

    private void giveRewards(String[] rewards) {
        for (int i = 0; i < this.players.length; i++) {
            Player player = this.players[i];
            player.receiveMyReward(rewards);
        }
    }
}