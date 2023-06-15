/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demoasm1;

/**
 *
 * @author THANG
 */
public class Deallocation {

    public static void main(String[] args) {

        // Create a new object
        Person person = new Person(1, "John Doe");

        // Set the reference to null
        person = null;

        // This will trigger the garbage collector to deallocate the memory
        // that was allocated for the person object
        System.gc();
    }
}

class Person {

    int id;
    String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }
}