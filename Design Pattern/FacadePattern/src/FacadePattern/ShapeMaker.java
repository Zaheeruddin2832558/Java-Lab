/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 * Represents a ShapeMaker class that acts as a facade for drawing different shapes.
 * It contains instances of Circle, Rectangle, and Square and provides methods to draw each shape.
 *
 * @author zaheeruddin
 * @version 1.0
 */
package FacadePattern;
public class ShapeMaker {
    private Shape circle;
    private Shape rectangle;
    private Shape square;
        
    /**
     * Constructs a ShapeMaker object, initializing instances of Circle, Rectangle, and Square.
     */

    public ShapeMaker(){
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }
    /**
     * Draws a circle using the Circle object.
     */
     public String drawCircle(){
         circle.draw();
         return "Draw Circle";
     } 
     /**
     * Draws a rectangle using the Rectangle object.
     */
      public String drawRectangle(){
         rectangle.draw();
         return "Draw Rectangle";
     } 
       /**
     * Draws a square using the Square object.
     */
       public String drawSquare(){
         square.draw();
         return "Draw Square";
     } 
}
