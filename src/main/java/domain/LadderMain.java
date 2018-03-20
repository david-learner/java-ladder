package domain;

import view.InputView;
import view.ResultView;

public class LadderMain {
    public static void main(String[] args) {
        LadderGame ladderGame = new LadderGame(InputView.getNames(), InputView.getRewards(), InputView.getHeight());
        LadderMatch ladderMatch = new LadderMatch(ladderGame);
        // Todo 플레이어 인덱스가지고 리워드 가져오기
        ladderGame.getPlayerRewards();
        ResultView.printResult(ladderGame);
        InputView.iterateGetTarget(ladderGame);
    }
}
