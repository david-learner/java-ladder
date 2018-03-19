package domain;

import java.util.concurrent.ThreadLocalRandom;

public class LadderPointGenerator {
    public static boolean generatePoint() {
        // 숫자 생성 범위 알기
        if(ThreadLocalRandom.current().nextInt(4) > 1) {
            return true;
        }
        return false;
    }
}
