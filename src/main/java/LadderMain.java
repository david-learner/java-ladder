public class LadderMain {
    public static void main(String[] args) {
//        int peopleCount = InputView.getPeopleCount();
        String[] namesOfPersons = InputView.getNamesOfPersons();
//        int countOfPersons = namesOfPersons.length;
        int height = InputView.getHeight();

        LadderGame ladderGame = new LadderGame(namesOfPersons, height);
        ResultView.printResult(ladderGame);
    }
}
