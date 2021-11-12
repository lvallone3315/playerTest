/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playertest;

import junit.framework.TestCase;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author User
 */
public class TestDefaultName {
    

    @Test
    public void testDefaultPlayerName() {
        
        PlayerTest defaultPlayerName = new PlayerTest();
        
        System.out.println("Test: Create player without name specified in constructor - expect default name applied\n");
        assertEquals("Default name not equal to ?", "?", defaultPlayerName.getPlayerName());
    }
}
