package view;

import domain.LadderGame;
import domain.LadderGameDTO;
import domain.LadderLine;
import domain.Player;

import java.util.ArrayList;
import java.util.Arrays;

public class ResultView {
    private static final String dashLine = "-----";
    private static final String spaceLine = "     ";
    private static final String pipe = "|";

    public static void printResult(LadderGame ladderGame, LadderGameDTO dto) {
        LadderLine[] ladderLine = ladderGame.getLadderLine();

        System.out.println("사다리 결과");
        printNames(ladderGame);
        for (LadderLine line : ladderLine) {
            printLine(line);
        }
        printRewards(dto);
    }

    private static void printRewards(LadderGameDTO dto) {
        String[] rewards = dto.getRewards();
        for (String reward: rewards) {
            System.out.print(String.format("%-5s", reward));
        }
        System.out.println("\n");
    }

    public static void printAllRewards(LadderGameDTO dto) {
        Player[] players = dto.getPlayers();
        for (Player player : players) {
            System.out.println(player.getName() + " : " + player.getReward());
        }
    }

    public static void printTarget(String target, LadderGameDTO dto) {
        System.out.println();
        System.out.println("실행결과");
        Player[] players = dto.getPlayers();
        for (Player player : players) {
            if (player.getName().equals(target)) {
                System.out.println(player.getReward());
            }
        }
        System.out.println();
    }

    static void printNames(LadderGame ladderGame) {
        Player[] players = ladderGame.getPlayers();

        for (int i = 0; i < players.length; i++) {
            String name = players[i].getName();
            System.out.print(String.format("%-6s", name));
        }
        System.out.println();
    }

    static void printLine(LadderLine line) {
        ArrayList<Boolean> points;
        points = line.getLine();
        int width = points.size() + (points.size() + 1);

        for (int i = 0; i < width; i++) {
            printElements(points, i);
        }
        System.out.println();
    }

    private static void printElements(ArrayList<Boolean> points, int i) {
        if (i % 2 == 1) {
            int portion = i / 2;
            printBridge(points.get(portion));
        }
        if (i % 2 == 0) {
            printPipe();
        }
    }

    private static void printPipe() {
        System.out.print(pipe);
    }

    private static void printBridge(Boolean bridge) {
        if (bridge) {
            System.out.print(dashLine);
            return;
        }
        System.out.print(spaceLine);
    }
}
