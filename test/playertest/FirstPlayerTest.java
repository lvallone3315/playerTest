/*
 * Test Driven Development Demo for a basic player class
 */
package playertest;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lee
 */
public class FirstPlayerTest {
    
    /*
     *                    Player Class
     * Requirements
     *   Unlimited” number of players
     *   Name limited to 24 characters, additional characters truncated
     *   If no name entered, default name is ?
     *   Names - Spaces allowed
     *
     * Design
     *   Player class
     *   PlayerTest()  - constructor uninitialized
     *   PlayerTest(String) - constructor initialized
     *   Void setPlayerName(string) - sets player name
     *   String getPlayerName() - returns player name
    */
    
    // First test creating multiple instances & setting & retrieving names
    //   Create instance, store Bob in 1st instance, retrieve & verify Bob returned
    //   Create 2nd instance, store Nancy, retrieve & verify Nancy returned
    @Test
    public void playerTester() {
        String playerName = "Bob";
        
        PlayerTest player = new PlayerTest();  
        player.setPlayerName(playerName);
        
        System.out.println("Test: instance created, Bob set & retrieved");
        assertEquals("Bob NOT returned", playerName, player.getPlayerName());
    }
}
