package domain;

import java.util.ArrayList;
import java.util.Objects;

public class PlayerReward {
    public static ArrayList<PlayerReward> playerRewards;
    private Player player;
    private String reward;

    public PlayerReward(Player player) {
        this.player = player;
        Location location = player.getLocation();
        this.reward = Reward.hasReward(location.getColumn());
        playerRewards.add(this);
    }

    public static void init() {
        playerRewards = new ArrayList<>();
    }

//    public static void addPlayerReward(Player player) {
//        playerRewards.add(new PlayerReward(player));
//    }

    public static ArrayList<PlayerReward> getPlayerRewards() {
        return playerRewards;
    }

    public Player getPlayer() {
        return this.player;
    }

    public String getReward() {
        return this.reward;
    }

    @Override
    public String toString() {
        return this.player.getName() + " : " + this.reward;
    }
}
