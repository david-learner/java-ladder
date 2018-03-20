package domain;

public class Point {
    private final int index; // 포인트의 위치(칸)
    private final Direction direction; // 포인트가 가지는 단방향(O), 양방향(X)

    public Point(int index, Direction direction) {
        this.index = index;
        this.direction = direction;
    }

    public Direction getDirection() {
        return direction;
    }

    public int move() {
//        System.out.println("is left? " + direction.isLeft());
//        System.out.println("is Right? " + direction.isRight());

        if (direction.isRight()) {
            return index + 1;
        }

        if(direction.isLeft()) {
            return index - 1;
        }

        return this.index;
    }

    // 다음 포인트 생성
    public Point next() {
        return new Point(this.index + 1, direction.next());
    }

    public Point next(Boolean right) {
        return new Point(index + 1, direction.next(right));
    }

    public Point last() {
        return new Point(index + 1, direction.last());
    }

    public static Point first(Boolean right) {
        return new Point(0, Direction.first(right));
    }

    @Override
    public String toString() {
        return "Point{" + "index=" + index + ", direction=" + direction + '}';
    }
}
