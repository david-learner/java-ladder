package domain;

import java.util.ArrayList;
import java.util.Arrays;

public class LadderGame {
    private ArrayList<Player> players;
    private ArrayList<PlayerReward> playerRewards;
    private ArrayList<String> rewards;

    public LadderGame(String[] names, String[] rewards, int height) {
        this.players = makePlayers(names);
        Ladder.makeLadderLines(names, height);
        this.rewards = new ArrayList<>(Arrays.asList(rewards));
    }

    public ArrayList<Player> makePlayers(String[] names) {
        ArrayList<Player> players = new ArrayList<>();
        for (int i = 0; i < names.length; i++) {
            players.add(new Player(names[i], i));
        }
        return players;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public ArrayList<String> getRewards() {
        return rewards;
    }

    // 이동이 끝난 플레이어의 인덱스 가지고 플레이어 리워드 ArrayList 생성
    // 목적 : all 요청시, 해당 ArrayList 리턴해주면 됨.
    public ArrayList<PlayerReward> getPlayerRewards() {
        playerRewards = new ArrayList<>();
        for (Player player : players) {
            String reward = rewards.get(player.getIndex());
            PlayerReward playerReward = new PlayerReward(player, reward);
            playerRewards.add(playerReward);
        }
        return this.playerRewards;
    }

    // TODO 들어온 이름으로 PlayerReward를 생성해주기.
    public ArrayList<PlayerReward> play(String name) {
        if (name.equals("all")) {
            return this.playerRewards;
        }
        if (!name.equals("all")) {
            Player player = getMatchedPlayer(name);
            PlayerReward playerReward = new PlayerReward(player, rewards.get(player.getIndex()));
            ArrayList<PlayerReward> playerRewards = new ArrayList<>(); // this.playerRewards에 덮어쓰지 않으려고.
            playerRewards.add(playerReward);
            return playerRewards;
        }
        return null;
    }

    // TODO 더 나은 방법이 없는지 고민하기
    public Player getMatchedPlayer(String name) {
        Player result = new Player(name, 0);
        for (Player player : players) {
            if (player.equals(result)) {
                return player;
            }
        }
        return null;
    }
}