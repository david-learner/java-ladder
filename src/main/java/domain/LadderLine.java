package domain;

import java.util.ArrayList;
import java.util.List;

import static domain.LadderPointGenerator.generatePoint;

public class LadderLine {
    private final List<Point> points;

    public LadderLine(List<Point> points) {
        this.points = points;

    }

    // 생성자내에 초기화 로직을 쓰면 의미전달이 명확하지 않게 된다.
    // static init()메서드로 초기화와 동시에 객체 생성.
    public static LadderLine init(int countOfPersons) {
        List<Point> points = new ArrayList<>();
        Point point = initFirst(points); // 첫 포인트는 왼쪽이 막힘
        point = initBody(countOfPersons, points, point); // 양쪽 모두 열린 포인트들 생성
        initLast(points, point); // 끝 포인트는 오른쪽이 막힘
        return new LadderLine(points);
    }

    private static void initLast(List<Point> points, Point point) {
        point = point.last();
        points.add(point);
    }

    private static Point initBody(int countOfPersons, List<Point> points, Point point) {
        // 이전에 생성된 포인트를 가지고 생성되기 때문에 이전 포인트의 index + 1이 생성된다.
        for (int i = 0; i < countOfPersons - 1; i++) {
            point = point.next();
            points.add(point);
        }
        return point;
    }

    private static Point initFirst(List<Point> points) {
        Point point = Point.first(generatePoint());
        points.add(point);
        return point;
    }

    public int move(int position) {
        return points.get(position).move();
    }

    @Override
    public String toString() {
        return "LadderLine{" + "points = " + points + '}';
    }
}