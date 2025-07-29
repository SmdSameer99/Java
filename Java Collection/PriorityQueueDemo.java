// PriorityQueueDemo.java
// Demonstrates PriorityQueue
//
// What is PriorityQueue?
// ----------------------
// PriorityQueue is a class that implements the Queue interface using a heap data structure.
// It orders elements according to their natural ordering or by a Comparator provided at queue construction time.
//
// Key Features:
// - Elements are ordered by priority (smallest/largest first, not FIFO)
// - Allows duplicate elements
// - Does not allow null elements
// - Not thread-safe
//
// Example usage below:
import java.util.*;
public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(30);
        pq.add(10);
        pq.add(20);
        System.out.println("PriorityQueue: " + pq);
        // Removing the highest priority (smallest) element
        System.out.println("Polled: " + pq.poll());
        System.out.println("PriorityQueue after poll: " + pq);
        // Peeking at the next element
        System.out.println("Peek: " + pq.peek());
    }
}
// Advanced Tips:
// - Use PriorityQueue for scheduling, Dijkstra's algorithm, etc.
// - For max-heap, use a custom Comparator: new PriorityQueue<>(Collections.reverseOrder())
// - For thread-safe priority queues, use PriorityBlockingQueue.
