package domain;

import jdk.internal.util.xml.impl.Input;
import view.InputView;
import view.ResultView;

public class LadderMain {
    public static void main(String[] args) {
       String[] names = InputView.getNamesOfPersons();
       Reward.init(InputView.getRewardsOfPersons());
       int height = InputView.getHeight();
       LadderGame ladderGame = new LadderGame(names, height);
       LadderMatch ladderMatch = new LadderMatch(ladderGame);
       ladderGame.setupReward();
       ResultView.printResult(ladderGame);
       InputView.iterateGetTarget();
    }
}
