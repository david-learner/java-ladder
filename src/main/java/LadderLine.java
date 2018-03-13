import java.util.ArrayList;
import java.util.Random;

public class LadderLine {
    private ArrayList<Boolean> points = new ArrayList<>();
    // 1. LadderLine 클래스는 ladderLine에 대한 정보를 가지고 있어야 한다.
    // 기존에는 LadderLine으로부터 line을 메서드 반환값으로 얻어오는 형태였다.
    // 2. width도 가지고 있을 필요가 없다. 오직 line에 대한 정보만 가지고 있으면 된다.
    // 3. UI로직이 포함되어 있는지 아닌지 확인하자. ( 특히 sysout들 )

    LadderLine(int width) {
        this.getLine(width);
    }

    public ArrayList<Boolean> getLine() {
        return this.points;
    }

    private void getLine(int width) {
        int printCount = (width - 1) / 2;
        Boolean prevBridge = false;

        points.add(addPipe());
        for (int i = 0; i < printCount; i++) {
            prevBridge = addBridge(prevBridge);
            points.add(prevBridge);
            points.add(addPipe());
        }
    }

    public Boolean addPipe() {
        return false;
    }

    public Boolean addBridge(Boolean prevBridge) {
        if ((makeRandomValue() == 1) && prevBridge == false) {
            return true;
        }
        return false;
    }

    public int makeRandomValue() {
        Random random = new Random();
        return random.nextInt(2);
    }
}
