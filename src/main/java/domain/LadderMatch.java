package domain;

import java.util.ArrayList;

public class LadderMatch {
    Player[] players;
    LadderLine[] ladderLines;
    ArrayList<Boolean> points;
    Coordinates point;

    LadderMatch(Player[] players, LadderLine[] ladderLines) {
        this.players = players;
        this.ladderLines = ladderLines;
        startMatch();
    }

    void startMatch() {
        for (int i = 0; i < this.players.length; i++) {
            Player player = players[i];
            scanRow(player);
        }
    }

    void scanRow(Player player) {
        int rows = ladderLines.length;
        for (int i = 0; i < rows; i++) {
            // checkRow(player, i);
            setPoints(ladderLines[i]);
            scanColumn(player, i);
        }
    }

    private void setPoints(LadderLine ladderLine) {
        this.points = ladderLine.getLine();
    }

    // 라인의 칸(한 줄)을 탐색한다.
    void scanColumn(Player player, int index) {

        int lineWidth = players.length - 1;
        point = player.getPoint();

        for (int i = 0; i < lineWidth; i++) {
            if (checkRow(point.getRow(), index)) {
                moveColumn(point.getColumn(), i);
                point.moveRow();
            }
        }

    }

    // 현재 라인의 위치와 플레이어의 row위치가 일치해야 탐색을 할 수 있다.
    Boolean checkRow(int playerRow, int index) {
        if (playerRow == index) {
            return true;
        }
        return false;
    }

    private void moveColumn(int playerColumn, int lineColumn) {
        // 라인의 칸 안에 값이 True. 즉, bridge가 있으면 이동한다.
        if (isValidColumnValue(lineColumn)) {
            point.moveColumn(playerColumn, lineColumn);
        }
    }

    // line의 칸 안에 들어있는 T/F 값을 확인한다.
    private Boolean isValidColumnValue(int lineColumn) {
        return points.get(lineColumn);
    }
}
