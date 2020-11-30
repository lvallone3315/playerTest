/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playertest;

/**
 *
 * @author Lee
 */
public class PlayerTest {
    
    String playerName;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    PlayerTest() {}
    
    PlayerTest(String name) {
        playerName = name;
    }
    
    public void setPlayerName(String name) {
        playerName = name;
    }
    
    public String getPlayerName() {
        return playerName;
    }
    
}
