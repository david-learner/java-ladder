public class ResultView {
    static void printResult(LadderGame ladderGame) {
        String[] ladderLines = ladderGame.getLadderLines();
        for (String line : ladderLines) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(line);
        }
    }
}
