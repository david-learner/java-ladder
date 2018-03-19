package domain;

import java.util.ArrayList;

public class PlayerReward {
    public static ArrayList<PlayerReward> playerRewards;
    private Player player;
    private String reward;

    public PlayerReward(Player player) {
        this.player = player;
        Location location = player.getLocation();
        this.reward = Reward.hasReward(location.getColumn());
        System.out.println(this.toString());
    }

    public static void addPlayerReward(Player player) {
        playerRewards.add(new PlayerReward(player));
    }

    public static ArrayList<PlayerReward> getPlayerRewards() {
        return playerRewards;
    }

    @Override
    public String toString() {
        return "Player : " + this.player.getName() + " Reward : " + this.reward;
    }
}
