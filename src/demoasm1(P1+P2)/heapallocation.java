/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demoasm1;

/**
 *
 * @author THANG
 */
public class heapallocation {

    public static void main(String[] args) {

        // Create a new array on the heap.
        int[] array = new int[10];

        // Print the address of the array in memory.
        System.out.println("The address of the array is: " + System.identityHashCode(array));
    }
}