import org.junit.Assert;
import org.junit.Test;

public class PlayerSpecs {
    @Test
    public void shouldHaveAName(){
        Player playerOne = new Player("Sachin");
        Assert.assertEquals("Sachin",playerOne.getPlayerName());
    }
}
