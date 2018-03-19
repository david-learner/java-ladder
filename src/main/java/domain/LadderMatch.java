package domain;

import java.util.ArrayList;

public class LadderMatch {
    public LadderMatch(LadderGame ladderGame) {
        ArrayList<Player> players = ladderGame.getPlayers();
        ArrayList<LadderLine> ladderLines = ladderGame.getLadderLines();

        for (int i = 0; i < players.size(); i++) {
            Player player = players.get(i);
            navigatePath(player, ladderLines);
            System.out.println(player.getLocation().toString());
        }
    }

    private void navigatePath(Player player, ArrayList<LadderLine> ladderLines) {
        Location location = player.getLocation();
        for (LadderLine ladderLine : ladderLines) {
            int index = ladderLine.move(location.getColumn());
            location.move(index);
            location.nextRow(ladderLines.size());
        }
    }
}
