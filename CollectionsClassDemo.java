// CollectionsClassDemo.java
// Demonstrates usage of Collections class
import java.util.*;
public class CollectionsClassDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(3, 1, 2));
        Collections.sort(list);
        System.out.println("Sorted List: " + list);
        Collections.reverse(list);
        System.out.println("Reversed List: " + list);
        int max = Collections.max(list);
        System.out.println("Max element: " + max);
    }
}
