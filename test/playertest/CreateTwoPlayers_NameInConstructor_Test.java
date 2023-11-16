/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
 * @author User
 */
public class CreateTwoPlayers_NameInConstructor_Test {

    // TODO add test methods here. The name must begin with 'test'. For example:
    // public void testHello() {}
        
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
    
    // test creating multiple instances & initializing via constructor
    //   Create Bob again (reuse playerTester() )
    //   Create 2nd instance initialized to Nancy, retrieve & verify Nancy returned
    @Test
    public void playerTesterInitializedConstructor() {
        playerTester();
        
        PlayerTest player2 = new PlayerTest("Nancy");
        
        System.out.println("Test: 2nd instance created, Nancy initialized & retrieved, as well as Bob\n");
        assertEquals("Nancy NOT returned", "Nancy", player2.getPlayerName());
    }
}
