// DequeInterfaceDemo.java
// Demonstrates Deque interface
import java.util.*;
public class DequeInterfaceDemo {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();
        deque.addFirst("Front");
        deque.addLast("Back");
        System.out.println("Deque: " + deque);
        System.out.println("Removed from front: " + deque.removeFirst());
        System.out.println("Deque after removal: " + deque);
    }
}
