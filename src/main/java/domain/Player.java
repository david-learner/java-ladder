package domain;

public class Player {
    private String name;
    private Coordinates point;
    private String reward;

    public Player(String name, Coordinates point) {
        this.point = point;
        this.name = name;
    }

    public Coordinates getPoint() {
        return this.point;
    }

    public String getName() {
        return this.name;
    }

    public String getReward() {
        return this.reward;
    }

    public void receiveMyReward(String[] rewards) {
        int rewardNo = this.point.getColumn();
        this.reward = rewards[rewardNo];
    }
}
