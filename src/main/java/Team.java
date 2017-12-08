import java.util.ArrayList;

public class Team {

    private ArrayList<Player> players;

    Team(ArrayList<Player> players) {
        this.players = players;
    }

    public ArrayList<Player> getPlayers() {
        return this.players;
    }

    public int calculatePoints() {

        return players.stream()
                .mapToInt(player -> player.getRunsScored() + ((player.getRunsScored() / 15) - 1) * 5)
                .sum();
    }
}
