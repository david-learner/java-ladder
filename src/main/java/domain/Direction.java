package domain;

import java.util.Objects;

import static domain.LadderPointGenerator.generatePoint;
import static java.lang.Boolean.FALSE;

public class Direction {
    private final boolean left;
    private final boolean right;

    // 왜 wrapper타입 Boolean이 아니라 primitive타입 boolean인가?
    private Direction(boolean left, boolean right) {
        if (left && right) {
            throw new IllegalStateException();
        }

        this.left = left;
        this.right = right;
    }

    public boolean isRight() {
        return this.right;
    }

    public boolean isLeft() {
        return this.left;
    }

    public Direction next(boolean nextRight) {
        return of(this.right, nextRight);
    }

    public Direction next() {
        if (this.right) {
            return next(FALSE);
        }
        return next(generatePoint());
    }

    //  of는 getInstance를 대체.
    public static Direction of(boolean first, boolean second) {
        return new Direction(first, second);
    }

    public static Direction first(boolean right) {
        return of(FALSE, right);
    }

    // 왜 first는 static이며 last는 아닌가
    public Direction last() {
        return of(this.right, FALSE);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        // direction만 같으면 같은 객체라고 판단
        Direction pair = (Direction) o;
        return left == pair.left && right == pair.right;
    }

    // hashCode는 여기서 어떤 역할을 하는가?
    @Override
    public int hashCode() {
        return Objects.hash(left, right);
    }

    @Override
    public String toString() {
        return "Direction{" + "left=" + left + ", right=" + right + '}';
    }
}
