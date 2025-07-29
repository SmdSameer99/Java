// DequeInterfaceDemo.java
// Demonstrates Deque interface
//
// What is Deque Interface?
// -----------------------
// Deque (Double Ended Queue) is an interface in Java Collections Framework that allows insertion and removal of elements from both ends.
// Common implementations: ArrayDeque, LinkedList.
//
// Key Features:
// - Supports insertion/removal at both front and back
// - Can be used as a stack (LIFO) or queue (FIFO)
// - No capacity restrictions in ArrayDeque
//
// Example usage below:
import java.util.*;
public class DequeInterfaceDemo {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();
        deque.addFirst("Front");
        deque.addLast("Back");
        System.out.println("Deque: " + deque);
        // Removing from front
        System.out.println("Removed from front: " + deque.removeFirst());
        System.out.println("Deque after removal: " + deque);
        // Adding and removing from back
        deque.addLast("NewBack");
        System.out.println("Deque after addLast: " + deque);
        System.out.println("Removed from back: " + deque.removeLast());
        System.out.println("Deque after removeLast: " + deque);
    }
}
// Advanced Tips:
// - Use ArrayDeque for fast, resizable double-ended queue.
// - Deque is ideal for implementing both stacks and queues.
// - Not thread-safe. For thread safety, use ConcurrentLinkedDeque.
