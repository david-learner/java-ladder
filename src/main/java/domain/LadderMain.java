package domain;

import view.InputView;
import view.ResultView;

import java.util.Arrays;

public class LadderMain {
    public static void main(String[] args) {
        LadderGameDTO dto = new LadderGameDTO();
        dto.setNamesOfPersons(InputView.getNamesOfPersons());
        dto.setRewards(InputView.getRewardsOfPersons());
        dto.setHeight(InputView.getHeight());
        LadderGame ladderGame = new LadderGame(dto);
        ResultView.printResult(ladderGame, dto);
        inputOutputTarget(dto);
        ResultView.printAllRewards(dto);
    }

    private static void inputOutputTarget(LadderGameDTO dto) {
        String target = "";
        while(!target.equals("all")) {
            target = InputView.getTarget();
            ResultView.printTarget(target, dto);
        }
    }
}
