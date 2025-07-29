// CollectionsClassDemo.java
// Demonstrates usage of Collections class
//
// What is Collections Class?
// -------------------------
// Collections is a utility class in java.util package that provides static methods for operating on collections (like List, Set, etc.).
// It includes methods for sorting, searching, reversing, shuffling, finding min/max, and more.
//
// Key Features:
// - Provides static utility methods for collection manipulation
// - Works with all types of collections (List, Set, etc.)
// - Common methods: sort, reverse, shuffle, min, max, fill, copy, frequency, etc.
//
// Example usage below:
import java.util.*;
public class CollectionsClassDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(3, 1, 2));
        // Sorting the list
        Collections.sort(list);
        System.out.println("Sorted List: " + list);
        // Reversing the list
        Collections.reverse(list);
        System.out.println("Reversed List: " + list);
        // Finding max element
        int max = Collections.max(list);
        System.out.println("Max element: " + max);
        // Shuffling the list
        Collections.shuffle(list);
        System.out.println("Shuffled List: " + list);
        // Frequency of an element
        int freq = Collections.frequency(list, 1);
        System.out.println("Frequency of 1: " + freq);
    }
}
// Advanced Tips:
// - Use Collections.unmodifiableList(list) to create a read-only list.
// - Use Collections.synchronizedList(list) for thread-safe lists.
// - Collections class is different from Collection interface.
