/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 * Represents a demo class to demonstrate the usage of the Facade Pattern with ShapeMaker.
 * It creates a ShapeMaker object and calls its methods to draw different shapes.
 *
 * @author zaheeruddin
 * @version 1.0
 */
package FacadePattern;
public class FacadPatternDemo {

    /**
     * Start of Application
     * @param args the command line arguments
     */
    public static void main(String args[]) {
         ShapeMaker shapemaker = new ShapeMaker();
        
        shapemaker.drawCircle();
        shapemaker.drawRectangle();
        shapemaker.drawSquare();
                     
        
    }
}
