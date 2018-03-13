import java.util.ArrayList;

public class ResultView {
    static void printResult(LadderGame ladderGame) {
        LadderLine[] ladderLine = ladderGame.getLadderLine();

        printNames(ladderGame);
        System.out.println();

        for (LadderLine line : ladderLine) {
            printLine(line);
            System.out.println();
        }
    }

    static void printNames(LadderGame ladderGame) {
        for (String name : ladderGame.getNamesOfPersons()) {
            System.out.printf(name + " ");
        }
    }
    static void printLine(LadderLine line) {
        ArrayList<Boolean> points;
        points = line.getLine();
        for (int i = 0; i < points.size(); i++) {
            if ( i%2 == 1 ) {
                printBridge(points.get(i));
            }

            if ( i%2 == 0 ) {
                printPipe();
            }
        }
    }

    static void printPipe() {
        System.out.print("|");
    }

    static void printBridge(Boolean bridge) {
        if (bridge) {
            System.out.print("-");
            return;
        }
        System.out.print(" ");
    }
}
