/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 * Represents a Square shape that implements the Shape interface.
 * Provides the specific implementation of the draw method for drawing a square.
 *
 * @author zaheeruddin
 * @version 1.0
 */
package FacadePattern;
public class Square implements Shape {
    
    @Override
    public String draw(){
        System.out.println("Draw Square");
        return "Draw Square";
    }
    
    
}
