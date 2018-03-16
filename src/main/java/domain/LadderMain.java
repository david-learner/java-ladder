package domain;

import view.InputView;
import view.ResultView;

import java.util.Arrays;

public class LadderMain {
    public static void main(String[] args) {
        LadderGameDTO dto = new LadderGameDTO();

        String[] namesOfPersons = InputView.getNamesOfPersons();
        dto.setRewards(InputView.getRewardsOfPersons());
        int height = InputView.getHeight();

        LadderGame ladderGame = new LadderGame(namesOfPersons, height);
//        for (Player player : ladderGame.getPlayers()) {
//            Coordinates point = player.getPoint();
//            System.out.println("p name : " + player.getName() + " " + point.getRow() + " "+ point.getColumn());
//        }
        ResultView.printResult(ladderGame);
    }
}
