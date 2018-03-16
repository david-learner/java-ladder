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

    public void getMyReward(String[] reward) {
        int rewardNo = this.point.getColumn();
        this.reward = reward[rewardNo];
    }
}
