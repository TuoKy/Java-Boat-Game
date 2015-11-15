/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testing.character;


import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import org.junit.Test;
import game.character.Boat;
import org.junit.Before;

/**
 *
 * @author Cadrei
 */
public class CharacterTest {
    
    private Boat boat;
    
    @Before
public void setUp(){
    boat = new Boat();
}    
    
    @Test
public void testpinAngle() {
    //will fail, suck that
    assertThat(boat.pinAngle(12.8), is(7.6));
}


  
      

   
      
}

