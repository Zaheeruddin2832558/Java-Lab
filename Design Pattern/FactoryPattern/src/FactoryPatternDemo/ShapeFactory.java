package FactoryPatternDemo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 * Represents a factory class for creating different shapes.
 * It contains a method getShape that takes a shapeType as input and returns an instance of the corresponding shape.
 *
 * @author zaheeruddin
 * @version 1.0
 */
public class ShapeFactory {
    /**
     * Gets an instance of the specified shape type.
     *
     * @param shapeType a string representing the type of shape to create
     * @return an instance of the specified shape type, or null if the shapeType is invalid
     */
    public Shape getShape (String shapeType){
     if (shapeType == null){
         return null;
     }
     if (shapeType.equalsIgnoreCase("CIRCLE")){
         return new Circle();
         
     }else if (shapeType.equalsIgnoreCase("RECTANGLE")){
         return new Rectangle();     
         
    }else if (shapeType.equalsIgnoreCase("SQUARE")){
         return new Square();     
    
}
     return null;
    }
}