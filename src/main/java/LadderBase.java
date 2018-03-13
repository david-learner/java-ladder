import java.util.Random;

public class LadderBase {
    private String[] ladderLines;
    private int height;
    private int width;

    LadderBase(int peopleCount, int height) {
        this.width = peopleCount + (peopleCount - 1);
        this.height = height;
        ladderLines = new String[height];
        drawLadder();
    }

    public String[] getLadderLines() {
        return this.ladderLines;
    }

    public void drawLadder() {
        for (int i = 0; i < height; i++) {
            ladderLines[i] = getLine();
        }
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
