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
public class CreatePlayersWith24and25Chars_Test {
    
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
      
    // Test names limited to 24 characters
    //   verify 24 characters good, 25 characters truncated to 24
    @Test
    public void playerTester24Char() {
        String playerName25Char = "123456789x123456789y12345";
        String playerName24Char = "123456789x123456789y1234";
        
        PlayerTest player = new PlayerTest();  
        player.setPlayerName(playerName24Char);
        
        System.out.println("\nTest: Verifying 24 char names accepted");
        assertEquals("24 character name NOT accepted", playerName24Char, player.getPlayerName());
        
        
        player.setPlayerName(playerName25Char);
        
        System.out.println("Test: Verifying 25 char names truncated\n");
        assertNotEquals("25 character name accepted (should truncate to 24", playerName25Char, player.getPlayerName());
        assertEquals("name different, but not truncated", playerName24Char, player.getPlayerName());
        
    }
    
    // Test default name is '?'
    
    // Test spaces allowed between non-whitespace characters
}