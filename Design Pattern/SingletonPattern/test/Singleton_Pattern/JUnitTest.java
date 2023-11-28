/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Singleton_Pattern;

import static org.junit.Assert.*;
import org.junit.Test;
import Singleton_Pattern.SingleObject;
/**
 *
 * @author zaheeruddin
 */
public class JUnitTest {
    
    public JUnitTest() {
    }
    

   
  
@Test
    public void getInstanceTest(){
        
        
        SingleObject so = SingleObject.getInstance();
        assertEquals(so, SingleObject.getInstance());
        
        
        try{
            SingleObject so1 = new SingleObject();
        } catch (RuntimeException e){
            
            assertTrue(true);
        }
        
    }

   
}
