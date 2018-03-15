package domain;

import domain.LadderLine;
import org.junit.Before;
import org.junit.Test;
import view.InputViewUtils;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class LadderLineTest {
    LadderLine line;

    @Before
    public void setup() {
        line = new LadderLine(3);
    }

    @Test
    public void addBridgePass() {
        Boolean prevBridge = false; // 이전 브릿지가 없다.
        int randomValue = 1; // 랜덤 값이 1이어야 생성 최소 조건 만족.
        assertTrue(line.addBridge(randomValue, prevBridge));
    }

    @Test
    public void addBridgeFail() {
        Boolean prevBridge = true; // 이전 브릿지가 있다.
        int randomValue = 1;

        // 랜덤 값은 1이라서 생성 최소 조건은 만족하지만, 이전 브릿지가 존재하므로 생성 불가.
        assertFalse(line.addBridge(randomValue, prevBridge));
    }
}