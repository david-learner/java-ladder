package domain;

public class LadderGameDTO {
    // DTO의 getMethod에서는 매개변수를 지원하면 안 되는가?
    private String[] rewards;
    private String reward;

    public void setRewards(String[] rewards) {
        this.rewards = rewards;
    }

    public String[] getRewards() {
        return this.rewards;
    }

    public String getReward() {
        return reward;
    }

    public void setReward(String reward) {
        this.reward = reward;
    }
}
