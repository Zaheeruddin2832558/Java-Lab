/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaassignment;
import java.util.Scanner;

/**
 *
 * @author zaheeruddin
 */
public class JavaAssignment {

   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int n = scanner.nextInt();
        
        if (n <= 0) {
            System.out.println("Please enter array size.");
            return;
        }
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        
        scanner.close();

        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }
    
}
