package domain;

public class LadderGameDTO {
    // DTO의 getMethod에서는 매개변수를 지원하면 안 되는가?
    private String[] rewards;
    private String[] namesOfPersons;
    private Player[] players;
    private int height;

    public void setRewards(String[] rewards) {
        this.rewards = rewards;
    }

    public String[] getRewards() {
        return this.rewards;
    }

    public String[] getNamesOfPersons() {
        return namesOfPersons;
    }

    public void setNamesOfPersons(String[] namesOfPersons) {
        this.namesOfPersons = namesOfPersons;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }


    public Player[] getPlayers() {
        return players;
    }

    public void setPlayers(Player[] players) {
        this.players = players;
    }
}
