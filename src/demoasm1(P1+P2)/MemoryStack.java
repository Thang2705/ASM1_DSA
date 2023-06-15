/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demoasm1;

/**
 *
 * @author THANG
 */
public class MemoryStack {

    public static void main(String[] args) {
        // Create a variable on the stack
        int x = 10;

        // Call a method that creates a new variable on the stack
        createVariable();

        // Print the value of the variable on the stack
        System.out.println(x);
    }

    private static void createVariable() {
        // Create a new variable on the stack
        int y = 20;
    }
}