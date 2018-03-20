package domain;

import java.util.ArrayList;

public class LadderGame {
    private ArrayList<Player> players;
    private ArrayList<LadderLine> ladderLines;
    private ArrayList<PlayerReward> playerRewards;

    public LadderGame(String[] names, int height) {
        this.players = makePlayers(names);
        this.ladderLines = makeLadderLines(names, height);
    }

    public ArrayList<Player> makePlayers(String[] names) {
        ArrayList<Player> players = new ArrayList<>();
        for (int i = 0; i < names.length; i++) {
            players.add(new Player(names[i], i));
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

    public ArrayList<PlayerReward> play(String name) {
        if (name.equals("all")) {
            PlayerReward.init();
            return PlayerReward.getPlayerReward(players);
        }
        if (!name.equals("all")) {
            PlayerReward.init();
            Player player = getPlayer(name);
            return PlayerReward.getPlayerReward(player);
        }
        return null;
    }

    public Player getPlayer(String name) {
        Player result = new Player(name, 0);
        for ( Player player : players) {
            if(player.equals(result)) {
                return player;
            }
        }
        return  null;
    }
}