public class LadderMain {
    public static void main(String[] args) {
        int peopleCount = InputView.getPeopleCount();
        System.out.println(peopleCount);
        int height = InputView.getHeight();
        LadderGame ladderGame = new LadderGame(peopleCount, height);
        ResultView.printResult(ladderGame);
    }
}
