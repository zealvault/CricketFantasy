import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class GameSpecs {
    @Test
    public void shouldDecideTheWinnerTeam() {
        ArrayList<Player> teamOnePlayers = new ArrayList<>();
        Player player1 = new Player("Rohit Sharma");
        player1.setRunsScored(98);
        Player player2 = new Player("Ravindra Jadeja");
        player2.setRunsScored(21);
        Player player3 = new Player("Steven Smith");
        player3.setRunsScored(44);
        Player player4 = new Player("David Warner");
        player4.setRunsScored(33);
        teamOnePlayers.add(player1);
        teamOnePlayers.add(player2);
        teamOnePlayers.add(player3);
        teamOnePlayers.add(player4);

        Team teamOne = new Team(teamOnePlayers);

        ArrayList<Player> teamTwoPlayers = new ArrayList<>();
        Player playerOne = new Player("Virat Kohli");
        player1.setRunsScored(41);
        Player playerTwo = new Player("Steven Smith");
        player2.setRunsScored(44);
        Player playerThree = new Player("David Warner");
        player3.setRunsScored(33);
        Player playerFour = new Player("Shane Watson");
        player4.setRunsScored(2);
        teamTwoPlayers.add(playerOne);
        teamTwoPlayers.add(playerTwo);
        teamTwoPlayers.add(playerThree);
        teamTwoPlayers.add(playerFour);

        Team teamTwo = new Team(teamTwoPlayers);

        ArrayList<Team> teams = new ArrayList<>();
        teams.add(teamOne);
        teams.add(teamTwo);

        Game game = new Game(teams);
        Assert.assertEquals(teamOne, game.getWinnerTeam().get());
    }
}
