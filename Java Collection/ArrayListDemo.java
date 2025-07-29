// ArrayListDemo.java
// Demonstrates ArrayList
//
// What is ArrayList?
// ------------------
// ArrayList is a resizable array implementation of the List interface in Java.
// It allows dynamic addition, removal, and access of elements.
// ArrayList is part of the Java Collections Framework and is found in java.util package.
//
// Key Features:
// - Maintains insertion order
// - Allows duplicate elements
// - Provides random access (get/set by index)
// - Not synchronized (not thread-safe by default)
// - Grows automatically as elements are added
//
// Common Operations:
// - add(element): Adds an element to the end
// - add(index, element): Inserts at a specific position
// - get(index): Retrieves element at index
// - set(index, element): Updates element at index
// - remove(index): Removes element at index
// - size(): Returns number of elements
// - contains(element): Checks if element exists
// - clear(): Removes all elements
//
// When to use ArrayList?
// - When you need fast random access
// - When you need a dynamic array (size changes frequently)
// - When thread safety is not a concern
//
// Drawbacks:
// - Slow for insertions/removals in the middle (shifts elements)
// - Not thread-safe (use Collections.synchronizedList or CopyOnWriteArrayList for thread safety)
//
// Example usage below:
import java.util.*;
public class ArrayListDemo {
    public static void main(String[] args) {
        // Creating an ArrayList of Integers
        ArrayList<Integer> arr = new ArrayList<>();
        // Adding elements
        arr.add(10);
        arr.add(20);
        arr.add(30);
        System.out.println("ArrayList: " + arr);

        // Accessing elements
        int first = arr.get(0); // get element at index 0
        System.out.println("First element: " + first);

        // Updating elements
        arr.set(1, 25); // set index 1 to 25
        System.out.println("After update: " + arr);

        // Removing elements
        arr.remove(2); // remove element at index 2
        System.out.println("After removal: " + arr);

        // Checking size
        System.out.println("Size: " + arr.size());

        // Checking if ArrayList contains an element
        System.out.println("Contains 25? " + arr.contains(25));

        // Iterating over ArrayList
        System.out.print("Iterating: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Clearing the ArrayList
        arr.clear();
        System.out.println("After clear: " + arr);
    }
}

// Advanced Tips:
// - Use ArrayList<String> or ArrayList<CustomClass> for other data types.
// - For thread-safe lists, use Collections.synchronizedList(new ArrayList<>()) or CopyOnWriteArrayList.
// - For frequent insertions/removals in the middle, consider LinkedList instead.
// - ArrayList can be converted to array using toArray() method.
// - Initial capacity can be set: new ArrayList<>(initialCapacity);
// - ArrayList allows null elements.
