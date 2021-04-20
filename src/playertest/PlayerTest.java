/*
 * Demonstration of Test Driven Development
 */
package playertest;

/**
 *
 * @author Lee
 */

  public class PlayerTest {
      
    String playerName;
      
    public static void main(String[] args) {
        ; // no need for any code here - run from JUnit tests
    }
    

    
    PlayerTest(String s) {
        playerName = s;
    }
    
    PlayerTest() {
        this("?");// null constructor
    }
    
 
    public String getPlayerName() {
        return(playerName);
    }
    
    public void setPlayerName(String s) {
        if (s.length()> 24) {
            playerName = s.substring(0,24);
        }
        else
            playerName = s;
    }
  }

