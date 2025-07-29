// LinkedListDemo.java
// Demonstrates LinkedList
//
// What is LinkedList?
// -------------------
// LinkedList is a doubly-linked list implementation of the List and Deque interfaces in Java.
// It allows efficient insertions and deletions from both ends and the middle.
// LinkedList is part of the Java Collections Framework and is found in java.util package.
//
// Key Features:
// - Maintains insertion order
// - Allows duplicate elements
// - Efficient for frequent insertions/removals (O(1) at ends)
// - Slower random access (O(n) for get/set by index)
// - Implements List, Deque, and Queue interfaces
// - Can be used as a stack, queue, or double-ended queue
//
// Common Operations:
// - add(element): Adds to end
// - addFirst(element), addLast(element): Adds to front/back
// - get(index): Retrieves element at index
// - set(index, element): Updates element at index
// - remove(index), removeFirst(), removeLast(): Removes elements
// - size(): Returns number of elements
// - contains(element): Checks if element exists
// - clear(): Removes all elements
//
// When to use LinkedList?
// - When you need frequent insertions/removals in the middle or ends
// - When you need a queue or deque implementation
// - When random access is not a priority
//
// Drawbacks:
// - Slower random access compared to ArrayList
// - Higher memory usage (stores node pointers)
//
// Example usage below:
import java.util.*;
public class LinkedListDemo {
    public static void main(String[] args) {
        // Creating a LinkedList of Strings
        LinkedList<String> ll = new LinkedList<>();
        // Adding elements
        ll.add("First");
        ll.add("Second");
        ll.addFirst("Zeroth"); // Add to front
        ll.addLast("Third");   // Add to end
        System.out.println("LinkedList: " + ll);

        // Accessing elements
        String first = ll.getFirst();
        String last = ll.getLast();
        System.out.println("First: " + first + ", Last: " + last);

        // Updating elements
        ll.set(1, "Updated");
        System.out.println("After update: " + ll);

        // Removing elements
        ll.removeFirst();
        ll.removeLast();
        System.out.println("After removals: " + ll);

        // Checking size
        System.out.println("Size: " + ll.size());

        // Iterating over LinkedList
        System.out.print("Iterating: ");
        for (String s : ll) {
            System.out.print(s + " ");
        }
        System.out.println();

        // Clearing the LinkedList
        ll.clear();
        System.out.println("After clear: " + ll);
    }
}

// Advanced Tips:
// - Use LinkedList for queue, stack, or deque operations.
// - For thread-safe lists, use Collections.synchronizedList(new LinkedList<>()).
// - LinkedList allows null elements.
// - Avoid using LinkedList for frequent random access; prefer ArrayList for that use case.
