package view;

import domain.LadderGame;
import domain.LadderLine;

import static view.ResultViewUtils.printLine;
import static view.ResultViewUtils.printNames;

public class ResultView {
    public static void printResult(LadderGame ladderGame) {
        LadderLine[] ladderLine = ladderGame.getLadderLine();

        printNames(ladderGame);
        for (LadderLine line : ladderLine) {
            printLine(line);
        }
    }
}
