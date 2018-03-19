package domain;

public class Player {
    private String name;
    private Location location;
    private String reward;

//    public Player(String name) {
//        Location location = new Location(0,0);
//        this(name, location)
//    }

    public Player(String name, Location location) {
        this.name = name;
        this.location = location;
    }

    public Player next(String name) {
        Location location = new Location(0, this.location.getColumn() + 1);
        return new Player(name, location);
    }

    public Location getLocation() {
        return this.location;
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
