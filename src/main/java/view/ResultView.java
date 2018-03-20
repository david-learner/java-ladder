package view;

import domain.*;

import java.util.ArrayList;
import java.util.List;

public class ResultView {
    private static final String dashLine = "-----";
    private static final String spaceLine = "     ";
    private static final String pipe = "|";
    private static ArrayList<Player> players;

    public static void printResult(LadderGame ladderGame) {
        ArrayList<LadderLine> ladderLines = ladderGame.getLadderLines();
        players = ladderGame.getPlayers();

        printNames();
        for (int i = 0; i < ladderLines.size(); i++) {
            printLine(ladderLines.get(i));
        }
        printRewards(Reward.getRewards());
    }

    private static void printRewards(ArrayList<String> rewards) {
        for (String reward : rewards) {
            System.out.print(String.format("%-5s", reward));
        }
    }

    public static void printTarget(String target) {
        System.out.println('\n' + "실행결과");
        ArrayList<PlayerReward> playerRewards = PlayerReward.getPlayerRewards();
        if (!target.equals("all")) {
            printPerson(target, playerRewards);
        }

        if (target.equals("all")) {
            printAll(playerRewards);
        }
    }

    private static void printAll(ArrayList<PlayerReward> playerRewards) {
        for (PlayerReward playerReward : playerRewards) {
            System.out.println(playerReward.toString());
        }
        System.exit(0);
    }

    private static void printPerson(String target, ArrayList<PlayerReward> playerRewards) {
        for (PlayerReward playerReward : playerRewards) {
            printReward(playerReward, target);
        }
    }

    private static void printReward(PlayerReward playerReward, String target) {
        String name = playerReward.getPlayer().getName();
        if (name.equals(target)) {
            System.out.println(playerReward.getReward());
        }
        System.out.println();
    }


    private static void printNames() {
        for (Player player : players) {
            System.out.print(String.format("%-6s", player.getName()));
        }
        System.out.println();
    }

    private static void printLine(LadderLine ladderLine) {
        List<Point> points = ladderLine.getPoints();
        Point point;
        for (int i = 0; i < points.size(); i++) {
            point = points.get(i);
            classify(point, i);
        }
        System.out.println();
    }

    private static void classify(Point point, int index) {
        System.out.print(printPipe());
        System.out.print(printBridge(point));
    }

    private static String printPipe() {
        return pipe;
    }

    private static String printBridge(Point point) {
        Direction direction = point.getDirection();
        if (direction.isRight()) {
            return dashLine;
        }
        return spaceLine;
    }
}
