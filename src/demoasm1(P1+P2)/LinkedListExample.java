/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demoasm1;

/**
 *
 * @author THANG
 */
import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args) {

        // Create a linked list
        LinkedList<String> linkedList = new LinkedList<>();

        // Add elements to the linked list
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");

        // Print the elements of the linked list
        for (String element : linkedList) {
            System.out.println(element);
        }
    }
}
