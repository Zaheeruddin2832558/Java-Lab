/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
/**
 * Demonstrates the use of the Singleton pattern by obtaining the instance
 * of SingleObject and invoking its method.
 *
 * @author zaheeruddin
 * @version 1.0
 */
package Singleton_Pattern;
        
public class SingletonPatternDemo {

    /**
     * The entry point of the application.
     *
     * @param args the command 
     */
    public static void main(String args[]) {
       // Get the Singleton instance
      SingleObject object = SingleObject.getInstance();

       // Display the message using the Singleton instance
      object.showMessage();
    }
}
