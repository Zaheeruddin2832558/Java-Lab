/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package FacadePatternTest;

import FacadePattern.Circle;
import FacadePattern.FacadPatternDemo;
import FacadePattern.Rectangle;
import FacadePattern.Shape;
import FacadePattern.ShapeMaker;
import FacadePattern.Square;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 *
 * @author zaheeruddin
 */
public class ShapeMakerTest {
    
    public ShapeMakerTest() {
    }
    
     @Test
    public void drawCircleTest(){
        ShapeMaker shapeMakerFacade = new ShapeMaker();
        Circle circle = new Circle();
       
        assertEquals(circle.draw(), shapeMakerFacade.drawCircle());
        assertEquals("Draw Circle", shapeMakerFacade.drawCircle());
        assertNotEquals("Draw Circle", shapeMakerFacade.drawRectangle());
        assertNotEquals("Draw Circle", shapeMakerFacade.drawSquare());
    }
    
    @Test
    public void drawRectangleTest(){
        ShapeMaker shapeMakerFacade = new ShapeMaker();
        Rectangle rectangle = new Rectangle();
        
        
        assertEquals(rectangle.draw(), shapeMakerFacade.drawRectangle());
        assertEquals("Draw Rectangle", shapeMakerFacade.drawRectangle());
        assertNotEquals("Draw Rectangle", shapeMakerFacade.drawCircle());
        assertNotEquals("Draw Rectangle", shapeMakerFacade.drawSquare());
        
    }
    
    @Test
    public void drawSquareTest(){
        ShapeMaker shapeMakerFacade = new ShapeMaker();
        Square square = new Square();
        
       
        assertEquals(square.draw(), shapeMakerFacade.drawSquare());
        assertEquals("Draw Square", shapeMakerFacade.drawSquare());
        assertNotEquals("Draw Square", shapeMakerFacade.drawCircle());
        assertNotEquals("Draw Square", shapeMakerFacade.drawRectangle());
    }
}

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    
