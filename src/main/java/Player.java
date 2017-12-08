public class Player {
    private String playerName;
    private int runsScored;

    public Player(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setRunsScored(int runsScored) {
        this.runsScored = runsScored;
    }

    public int getRunsScored() {
        return runsScored;
    }

}
