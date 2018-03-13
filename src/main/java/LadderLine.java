import java.util.Random;

public class LadderLine {
    private int width;

    LadderLine(int peopleCount) {
        this.width = peopleCount + (peopleCount - 1);
    }

    public String getLine() {
        StringBuilder line = new StringBuilder();
        String prevBridge = " ";
        int printCount = (width - 1) / 2;

        line.append(addPipe());
        for (int i = 0; i < printCount; i++) {
            // prevBridge 말고 더 이해가 잘 되는 이름 없나?
            prevBridge = addBridge(prevBridge);
            line.append(prevBridge);
            line.append(addPipe());
        }

        return line.toString();
    }

    public String addPipe() {
        return "|";
    }

    public String addBridge(String prevBridge) {
        if ((makeRandomValue() == 1) && prevBridge == " ") {
            return "-";
        }
        return " ";
    }

    public int makeRandomValue() {
        Random random = new Random();
        return random.nextInt(2);
    }
}
