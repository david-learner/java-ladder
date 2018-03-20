package domain;

import java.util.ArrayList;

public class LadderGame {
    private ArrayList<Player> players;
    private ArrayList<LadderLine> ladderLines;

    public LadderGame(String[] names, int height) {
        this.players = makePlayers(names);
        this.ladderLines = makeLadderLines(names, height);
    }

    public ArrayList<Player> makePlayers(String[] names) {
        ArrayList<Player> players = new ArrayList<>();
        Location location;
        for (int i = 0; i < names.length; i++) {
            location = new Location(0, i);
            players.add(new Player(names[i], location));
        }
        return players;
    }

    public ArrayList<LadderLine> makeLadderLines(String[] names, int height) {
        ArrayList<LadderLine> ladderLines = new ArrayList<>();
        for (int i = 0; i < height; i++) {
            ladderLines.add(LadderLine.init(names.length));
        }
        return ladderLines;
    }

    public ArrayList<LadderLine> getLadderLines() {
        return this.ladderLines;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setupReward() {
        PlayerReward.init();
        for (Player player : players) {
            new PlayerReward(player);
        }
    }
}