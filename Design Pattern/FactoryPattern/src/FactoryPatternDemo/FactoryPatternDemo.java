package FactoryPatternDemo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
/**
 * Represents a demo class to demonstrate the usage of the Factory Pattern with ShapeFactory.
 * It creates an instance of ShapeFactory and uses it to create and draw different shapes.
 *
 * @author zaheeruddin
 * @version 1.0
 */
public class FactoryPatternDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        ShapeFactory shapeFactory = new ShapeFactory();
        
        Shape shape1= shapeFactory.getShape("CIRCLE");
        shape1.draw();
        
        Shape shape2= shapeFactory.getShape("RECTANGLE");
        shape2.draw();
        
        Shape shape3= shapeFactory.getShape("SQUARE");
        shape3.draw();
    }
}
