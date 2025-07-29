// QueueInterfaceDemo.java
// Demonstrates Queue interface
//
// What is Queue Interface?
// -----------------------
// Queue is an interface in Java Collections Framework that represents a collection designed for holding elements prior to processing (FIFO: First-In-First-Out).
// Common implementations: LinkedList, PriorityQueue, ArrayDeque.
//
// Key Features:
// - Follows FIFO order (except for PriorityQueue)
// - Supports insertion (offer/add) and removal (poll/remove) at ends
// - Used for scheduling, buffering, and task management
//
// Example usage below:
import java.util.*;
public class QueueInterfaceDemo {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("A");
        queue.add("B");
        System.out.println("Queue: " + queue);
        // Removing element from front
        System.out.println("Removed: " + queue.remove());
        System.out.println("Queue after removal: " + queue);
        // Peeking at the front element
        System.out.println("Peek: " + queue.peek());
    }
}
// Advanced Tips:
// - Use offer/poll for safe queue operations (returns special value if fails).
// - For thread-safe queues, use ConcurrentLinkedQueue or BlockingQueue implementations.
// - PriorityQueue does not guarantee FIFO order, but orders by priority.
