// HashSetDemo.java
// Demonstrates HashSet
//
// What is HashSet?
// ----------------
// HashSet is a class that implements the Set interface using a hash table.
// It stores unique elements and does not maintain any order.
//
// Key Features:
// - No duplicate elements allowed
// - No guaranteed order of elements
// - Allows one null element
// - Fast operations (add, remove, contains) due to hashing
//
// Example usage below:
import java.util.*;
public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(1);
        hs.add(2);
        hs.add(1); // Duplicate, will not be added
        System.out.println("HashSet: " + hs);

        // Checking if HashSet contains an element
        System.out.println("Contains 2? " + hs.contains(2));

        // Removing an element
        hs.remove(1);
        System.out.println("After removal: " + hs);

        // Iterating over HashSet
        System.out.print("Iterating: ");
        for (int num : hs) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
// Advanced Tips:
// - Use HashSet for fast lookups and uniqueness.
// - For sorted sets, use TreeSet. For insertion order, use LinkedHashSet.
// - HashSet is not thread-safe. Use Collections.synchronizedSet for thread safety.
