// ListInterfaceDemo.java
// Demonstrates List interface
//
// What is List Interface?
// ----------------------
// List is an interface in Java Collections Framework that represents an ordered collection (sequence) of elements.
// It allows duplicate elements and provides positional access and insertion.
// Common implementations: ArrayList, LinkedList, Vector, Stack.
//
// Key Features:
// - Maintains insertion order
// - Allows duplicate elements
// - Provides indexed access (get/set by index)
// - Supports positional insertion and removal
//
// Example usage below:
import java.util.*;
public class ListInterfaceDemo {
    public static void main(String[] args) {
        // Using List interface with ArrayList implementation
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Apple"); // Duplicate allowed
        System.out.println("List: " + list);

        // Accessing elements
        String first = list.get(0);
        System.out.println("First element: " + first);

        // Updating elements
        list.set(1, "Orange");
        System.out.println("After update: " + list);

        // Removing elements
        list.remove(2);
        System.out.println("After removal: " + list);

        // Iterating over List
        System.out.print("Iterating: ");
        for (String s : list) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
// Advanced Tips:
// - Use List for ordered collections where duplicates are allowed.
// - Choose ArrayList for fast random access, LinkedList for frequent insertions/removals.
// - List can be used as a stack (with add/remove at end) or queue (with add/remove at start).
