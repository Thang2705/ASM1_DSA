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
import java.util.Queue;

public class QueueExample {

    public static void main(String[] args) {
        // Create a queue
        Queue<String> queue = new LinkedList<>();

        // Enqueue items into the queue
        queue.add("Item 1");
        queue.add("Item 2");
        queue.add("Item 3");

        // Dequeue items from the queue
        System.out.println(queue.remove()); // Item 1
        System.out.println(queue.remove()); // Item 2
        System.out.println(queue.remove()); // Item 3

        // Check if the queue is empty
        if (queue.isEmpty()) {
            System.out.println("The queue is empty");
        }
    }
}