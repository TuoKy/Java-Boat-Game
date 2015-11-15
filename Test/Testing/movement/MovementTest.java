/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testing.movement;


import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import org.junit.Test;
import org.junit.Before;

import game.movement.Movement;
import game.movement.Location; 



/**
 *
 * @author Cadrei
 */
public class MovementTest {
    
private Movement movement;
private Location location;
    
    @Before
public void setUp(){
    movement = new Movement();
    location = new Location(2,1);
}    
    
    @Test
public void testpinAngle() {
    assertThat(movement.go(location), is(location));
}

    @Test
public void testSetLocation() {
   location.setLocation(12, 21);
   testpinAngle();
}
}
