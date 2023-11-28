/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 * Represents a Singleton pattern implementation with a single object.
 * This class ensures that only one instance of the object is created and provide access to it.
 *
 * @author zaheeruddin
 * @version 1.0
 */
package Singleton_Pattern;
public class SingleObject {
    // Singleton instance
   private static SingleObject instance = new SingleObject();

   // Private constructor to prevent instantiation from outside the class
   SingleObject(){}

    /**
    * Returns the singleton instance of SingleObject.
    *
    * @return the singleton instance of SingleObject
    */
   public static SingleObject getInstance(){
      return instance;
   }
   
   /**
    * Displays a message indicating  SingleObject instance.
    *  the message is "Hello World!".
    */
   public void showMessage(){
      System.out.println("Hello World!");
   }
}
