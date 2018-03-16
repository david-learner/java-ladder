package view;

import java.util.Scanner;

public class InputView {
    private static Scanner scanner = new Scanner(System.in);

    public static String[] getNamesOfPersons() {
        System.out.println("참여할 사람 이름을 입력하세요. (이름은 쉼표(,)로 구분하세요)");
        String[] namesOfPersons = scanner.nextLine().split(",");
        return checkNames(namesOfPersons);
    }

    public static String[] getRewardsOfPersons() {
        System.out.println("실행 결과를 입력하세요. (결과는 쉼표(,)로 구분하세요)");
        String[] rewardsOfPersons = scanner.nextLine().split(",");
        return checkNames(rewardsOfPersons);
    }

    public static int getHeight() {
        System.out.println("최대 사다리 높이는 몇 개 인가요?");
        return scanner.nextInt();
    }

    public static String getTarget() {
        System.out.println("결과를 보고 싶은 사람은?");
        return scanner.next();
    }

    private static String[] checkNames(String[] namesOfPersons) {
        for (int i = 0; i < namesOfPersons.length; i++) {
            String name = namesOfPersons[i];
            name = checkValidation(name);
            namesOfPersons[i] = name;
        }
        return namesOfPersons;
    }

    private static String checkValidation(String name) {
        if (isValid(name)) {
            return name;
        }
        return convert(name);
    }

    private static String convert(String name) {
        return name.substring(0, 5);
    }

    static Boolean isValid(String name) {
        if (name.length() <= 5) {
            return true;
        }
        return false;
    }
}
