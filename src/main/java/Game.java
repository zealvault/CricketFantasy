import java.util.ArrayList;
import java.util.Optional;

public class Game {

    private final ArrayList<Team> teams;

    public Game(ArrayList<Team> teams) {
        this.teams = teams;
    }

    public ArrayList<Team> getTeams() {
        return teams;
    }

    public Optional<Team> getWinnerTeam() {
        return teams.stream().max((t1, t2) -> {
            if (t1.calculatePoints() > t2.calculatePoints()) {
                return 1;
            } else if (t1.calculatePoints() == t2.calculatePoints()) {
                return 0;
            } else
                return -1;
        });
    }
}
