// QueueInterfaceDemo.java
// Demonstrates Queue interface
import java.util.*;
public class QueueInterfaceDemo {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("A");
        queue.add("B");
        System.out.println("Queue: " + queue);
        System.out.println("Removed: " + queue.remove());
        System.out.println("Queue after removal: " + queue);
    }
}
