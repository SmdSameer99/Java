// ComparatorDemo.java
// Demonstrates Comparator interface
import java.util.*;
public class ComparatorDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 1, 2);
        list.sort(new Comparator<Integer>() {
            public int compare(Integer a, Integer b) {
                return b - a; // Descending order
            }
        });
        System.out.println("Sorted with Comparator: " + list);
    }
}
