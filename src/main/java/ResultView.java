public class ResultView {
    static void printResult(LadderGame ladderGame) {
        LadderLine[] ladderLine = ladderGame.getLadderLine();

        for (String name : ladderGame.getNamesOfPersons()) {
            System.out.printf(name + " ");
        }

        System.out.println();

        for (LadderLine line : ladderLine) {
            System.out.println(line.getLine());
        }
    }
}
