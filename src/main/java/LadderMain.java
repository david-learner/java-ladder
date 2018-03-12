import jdk.internal.util.xml.impl.Input;

import javax.xml.transform.Result;

public class LadderMain {
    public static void main(String[] args) {
        int peopleCount = InputView.getPeopleCount();
        int height = InputView.getHeight();

        LadderGame ladderGame = new LadderGame(peopleCount, height);
        ladderGame.inputLadderLine();
        ResultView.printResult(ladderGame);
    }
}
