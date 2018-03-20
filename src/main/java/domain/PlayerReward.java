package domain;

import java.util.ArrayList;

public class PlayerReward {
//    public static ArrayList<PlayerReward> playerRewards;
    public ArrayList<PlayerReward> playerRewards;
    private Player player;
    private String reward;

    public PlayerReward(Player player, String reward) {
        this.player = player;
        this.reward = reward;
    }

//    public static void init() {
//        playerRewards = new ArrayList<>();
//    }
//
//    public static ArrayList<PlayerReward> getPlayerReward(Player player) {
//        playerRewards.clear();
//        PlayerReward playerReward = new PlayerReward(player);
//        playerRewards.add(playerReward);
//        return playerRewards;
//    }
//
//    public static ArrayList<PlayerReward> getPlayerReward(ArrayList<Player> players) {
//        playerRewards.clear();
//        for (Player player : players) {
//            PlayerReward playerReward = new PlayerReward(player);
//            playerRewards.add(playerReward);
//        }
//        return playerRewards;
//    }

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
