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
    
    PlayerTest () {
        // null constructor
        // playerName = "?"
        this ("?");
    }
    
    PlayerTest (String name) {
        playerName = name;
    }

    public void setPlayerName(String name) {
        if (name.length()> 24) {
            playerName = name.substring(0,24);
        }
        else
            playerName = name;
    }
    
    public String getPlayerName() {
        return playerName;
    }

  }

