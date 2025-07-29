// PriorityQueueDemo.java
// Demonstrates PriorityQueue
import java.util.*;
public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(30);
        pq.add(10);
        pq.add(20);
        System.out.println("PriorityQueue: " + pq);
        System.out.println("Polled: " + pq.poll());
        System.out.println("PriorityQueue after poll: " + pq);
    }
}
