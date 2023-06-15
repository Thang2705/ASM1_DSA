/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demoasm1;

/**
 *
 * @author THANG
 */
import java.util.Stack;

public class StackDemo {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Push elements into the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Print the elements of the stack
        System.out.println("Elements of the stack:");
        for (Integer element : stack) {
            System.out.println(element);
        }
    }
}