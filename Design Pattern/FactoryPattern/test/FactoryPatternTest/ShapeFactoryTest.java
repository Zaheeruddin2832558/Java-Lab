/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package FactoryPatternTest;

import FactoryPatternDemo.*;
import static org.junit.Assert.*;
import org.junit.Test;


/**
 *
 * @author zaheeruddin
 */
public class ShapeFactoryTest {
    
    public ShapeFactoryTest() {
    }
    
    @Test
    public void getShapeTest(){
        ShapeFactory shapeFactory = new ShapeFactory();
        
        
        Circle circle = new Circle();
        
        assertEquals(circle.getClass(), shapeFactory.getShape("CIRCLE").getClass());
         
        
        assertNull(shapeFactory.getShape("One Circle Please"));
        
        assertNotEquals(circle.getClass(), shapeFactory.getShape("SQUARE").getClass());
        
        Rectangle rectangle = new Rectangle();
        
        assertEquals(rectangle.getClass(), shapeFactory.getShape("RECTANGLE").getClass());
        
        
        assertNotEquals(rectangle.getClass(), shapeFactory.getShape("SQUARE").getClass());
        
        Square square = new Square();
        assertEquals(square.getClass(), shapeFactory.getShape("SqUaRE").getClass());
        
        
        assertNotEquals(square.getClass(), shapeFactory.getShape("CIRCLE").getClass());
        assertNull(shapeFactory.getShape(""));
    }

   
}

  

