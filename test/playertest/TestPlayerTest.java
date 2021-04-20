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
public class TestPlayerTest {
    
    public TestPlayerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    
    /*
     * Requirements
     *   Unlimited” number of players
     *   Name limited to 24 characters, additional characters truncated
     *   If no name entered, default name is ?
     *   Names - Spaces allowed
     *   Names – Other non-printables okay, but expect newlines to be removed prior to calling
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
    //   Create Bob again
    //   Create 2nd instance initialized to Nancy, retrieve & verify Nancy returned
    @Test
    public void playerTesterInitializedConstructor() {
        playerTester();
        
        PlayerTest player2 = new PlayerTest("Nancy");
        System.out.println("Test: 2nd instance created, Nancy initialized & retrieved, as well as Bob\n");
        assertEquals("Nancy NOT returned", "Nancy", player2.getPlayerName());
    }
    
    // Next test names limited to 24 characters
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
        // 
        
    }
    
    // Test default name is '?'
    @Test
    public void playerTesterDefault() {
        PlayerTest player = new PlayerTest();
        assertEquals("Default plyaer name is not = ?", "?", player.getPlayerName());
    }
}
