// TreeSetDemo.java
// Demonstrates TreeSet
//
// What is TreeSet?
// ---------------
// TreeSet is a class that implements the Set interface using a Red-Black tree (self-balancing binary search tree).
// It stores unique elements in sorted (ascending) order.
//
// Key Features:
// - No duplicate elements allowed
// - Elements are sorted in natural order (or by Comparator)
// - Does not allow null elements (throws NullPointerException)
// - Provides methods for range view (subSet, headSet, tailSet)
//
// Example usage below:
import java.util.*;
public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();
        ts.add("Banana");
        ts.add("Apple");
        ts.add("Cherry");
        // ts.add(null); // Uncommenting this line will throw NullPointerException
        System.out.println("TreeSet (sorted): " + ts);

        // Checking if TreeSet contains an element
        System.out.println("Contains 'Apple'? " + ts.contains("Apple"));

        // Removing an element
        ts.remove("Banana");
        System.out.println("After removal: " + ts);

        // Iterating over TreeSet
        System.out.print("Iterating: ");
        for (String fruit : ts) {
            System.out.print(fruit + " ");
        }
        System.out.println();
    }
}
// Advanced Tips:
// - Use TreeSet for sorted, unique collections.
// - For custom sorting, use TreeSet with a Comparator.
// - TreeSet is not thread-safe. Use Collections.synchronizedSortedSet for thread safety.
// - TreeSet is slower than HashSet for basic operations but provides ordering.
