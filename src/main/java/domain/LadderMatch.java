package domain;

import java.util.ArrayList;

public class LadderMatch {
    Player[] players;
    LadderLine[] ladderLines;
    ArrayList<Boolean> points;

    LadderMatch(Player[] players, LadderGame ladderGame) {
        this.ladderLines = ladderGame.getLadderLine();
        this.players = players;
        findPath();
    }

    private void findPath() {
        for (int i = 0; i < this.players.length; i++) {
            navigate(players[i]);
        }
    }

    private void navigate(Player player) {
        // Todo Coordinates로 ladderLine의 point도 통합할 방법 찾기
        Coordinates playerPoint = player.getPoint();
        for (int i = 0; i < ladderLines.length; i++) {
            int currentLineNumber = i;
            points = ladderLines[i].getLine();

            System.out.println("시작지점 : " + playerPoint.getRow() + ", " + playerPoint.getColumn());
            if(playerPoint.getRow() == currentLineNumber) {
                System.out.println("현재 라인 : " + currentLineNumber);
                for (int j = 0; j < points.size(); j++) {
                    if(points.get(j)) {
                        playerPoint.moveColumn(playerPoint.getColumn(), j);
                    }
                    playerPoint.moveRow();
                    System.out.println("이동 : " + playerPoint.getRow() + ", " + playerPoint.getColumn());
                }
            }
        }
    }
}
