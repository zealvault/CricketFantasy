import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class TeamSpecs {
    @Test
    public void eachTeamShouldContainFourPlayers() {
        ArrayList<Player> players = new ArrayList<>();
        players.add(new Player("Rohit Sharma"));
        players.add(new Player("Ravindra Jadeja"));
        players.add(new Player("Steven Smith"));
        players.add(new Player("David Warner"));
        Team teamOne = new Team(players);
        Assert.assertEquals(4, teamOne.getPlayers().size());
    }

    @Test
    public void eachTeamShouldBeAbleToCalculateItsPoints() {
        ArrayList<Player> players = new ArrayList<>();
        Player player1 = new Player("Rohit Sharma");
        player1.setRunsScored(98);
        Player player2 = new Player("Ravindra Jadeja");
        player2.setRunsScored(21);
        Player player3 = new Player("Steven Smith");
        player3.setRunsScored(44);
        Player player4 = new Player("David Warner");
        player4.setRunsScored(33);
        players.add(player1);
        players.add(player2);
        players.add(player3);
        players.add(player4);

        Team teamOne = new Team(players);

        Assert.assertEquals(231, teamOne.calculatePoints());
    }
}
