package domain;

import view.InputView;
import view.ResultView;

public class LadderMain {
    public static void main(String[] args) {
        String[] names = InputView.getNamesOfPersons();
        Reward.init(InputView.getRewardsOfPersons());
        int height = InputView.getHeight();
        LadderGame ladderGame = new LadderGame(names, height);
        LadderMatch ladderMatch = new LadderMatch(ladderGame);
        ResultView.printResult(ladderGame);
        InputView.iterateGetTarget(ladderGame);
    }
}
