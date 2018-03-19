package domain;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class LadderGameTest {
    LadderGame ladderGame;
    String[] newNames = {"kbs", "sbs", "mbc"};

    @Before
    public void setup() {
        String[] oldNames = {"kbs", "sbs"};
        ladderGame = new LadderGame(oldNames);
    }

    @Test
    public void countOfPlayers() {
        ArrayList<Player> players = ladderGame.makePlayers(newNames);
        assertThat(3, is(players.size()));
    }

    @Test
    public void countOfLadderLines() {
        ArrayList<LadderLine> ladderLines = ladderGame.makeLadderLines(newNames);
        assertThat(3, is(ladderLines.size()));
    }
}
