/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demoasm1;

/**
 *
 * @author THANG
 */


import java.util.Arrays;

public class SearchHeap {

    public static void main(String[] args) {
        // Create a heap
        int[] heap = {10, 5, 1, 8, 7, 6, 9, 3, 2, 4};

        // Print the heap
        System.out.println("Original heap:");
        System.out.println(Arrays.toString(heap));

        // Search for the key 5 in the heap
        int index = searchHeap(heap, 5);

        // Print the index of the key
        System.out.println("The index of the key 5 is " + index);
    }

    private static int searchHeap(int[] heap, int key) {
        // Check if the key is in the heap.
        if (key < heap[0]) {
            return -1;
        }

        // Otherwise, search for the key in the heap.
        int low = 0;
        int high = heap.length - 1;
        int mid = (low + high) / 2;

        while (low <= high) {
            if (heap[mid] == key) {
                return mid;
            } else if (heap[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
            mid = (low + high) / 2;
        }

        return -1;
    }
}