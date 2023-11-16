/*
 * Demonstration of Test Driven Development
 */
package playertest;

/**
 *
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
 * @author Lee
 */

  public class PlayerTest {
      
   String playerName;
    
    public static void main(String[] args) {
        System.out.println ("Hello World"); // no need for any code here - run from JUnit tests
    }
    
    PlayerTest () {
        // null constructor
        // playerName = "?"
        // this ("?");
    }
    
    PlayerTest (String name) {
       // playerName = name;
    }

    /*
    public void setPlayerName(String name) {
       // if (name.length()> 24) {
       //    playerName = name.substring(0,24);
       // }
       // else
            playerName = name;
    }
*/
    
   /*
    public String getPlayerName() {
        return playerName;
    }
*/

  }

