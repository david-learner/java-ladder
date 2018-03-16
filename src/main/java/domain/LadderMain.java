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
        LadderMatch ladderMatch = new LadderMatch(ladderGame.getPlayers(), ladderGame);
        for (Player player : ladderGame.getPlayers()) {
            // System.out.println(player.getPoint().getColumn());
            // get.get 해결방안 포비 강의 참고
        }



        ResultView.printResult(ladderGame);
    }
}
