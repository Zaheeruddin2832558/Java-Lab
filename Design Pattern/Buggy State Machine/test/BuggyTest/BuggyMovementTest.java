/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package BuggyTest;

import BuggyMachine.*;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author zaheeruddin
 */
public class BuggyControlTest {
    
    public BuggyControlTest() {
    }
    
     @Test
    public void testBasicTransitions() {
        BuggyControl buggy = new BuggyControl();
        assertEquals("REST", buggy.getCurrentState());

        buggy.leftPedalPressed();
        assertEquals("ACCELERATING_FORWARD", buggy.getCurrentState());



        buggy.leftPedalHeld();
        assertEquals("CONSTANT_FORWARD_SPEED", buggy.getCurrentState());

        buggy.rightPedalHeld();
        assertEquals("CONSTANT_FORWARD_SPEED", buggy.getCurrentState());
    }

}
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

