package domain;

import java.util.ArrayList;

public class Rewards {
    private ArrayList<String> rewards;

    private Rewards(ArrayList<String> rewards) {
        this.rewards = rewards;
    }


    public static Rewards of(ArrayList<String> rewards) {
        // static 변수의 경우 this를 이용하여 참조하지 못하는데
        // static의 변수명과 매개변수의 변수명이 같은 경우 어떻게 하는가?
//        this.rewards = rewards;
        return new Rewards(rewards);
    }

    public String hasReward(int index) {
        return this.rewards.get(index);
    }
}
