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

public class PopOperation {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("The stack before popping: " + stack);

        int poppedElement = stack.pop();
        System.out.println("The popped element is: " + poppedElement);

        System.out.println("The stack after popping: " + stack);
    }
}