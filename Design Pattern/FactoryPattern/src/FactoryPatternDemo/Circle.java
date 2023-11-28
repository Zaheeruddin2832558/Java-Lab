package FactoryPatternDemo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Represents a Circle shape that implements the Shape interface.
 * Provides the specific implementation of the draw method for drawing a circle.
 *
 * @author zaheeruddin
 * @version 1.0
 */
public class Circle implements Shape {
    /**
     * Draws a circle.
     */
     @Override
    public void draw(){
        System.out.println("Inside Circle:draw() method.");
    }
    
}
