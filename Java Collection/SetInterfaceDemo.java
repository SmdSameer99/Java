// SetInterfaceDemo.java
// Demonstrates Set interface
//
// What is Set Interface?
// ----------------------
// Set is an interface in Java Collections Framework that represents a collection of unique elements (no duplicates).
// Common implementations: HashSet, LinkedHashSet, TreeSet.
//
// Key Features:
// - Does not allow duplicate elements
// - No guaranteed order (except for LinkedHashSet and TreeSet)
// - Allows at most one null element (HashSet)
//
// Example usage below:
import java.util.*;
public class SetInterfaceDemo {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("A");
        set.add("B");
        set.add("A"); // Duplicate, will not be added
        System.out.println("Set: " + set);

        // Checking if set contains an element
        System.out.println("Contains 'B'? " + set.contains("B"));

        // Removing an element
        set.remove("A");
        System.out.println("After removal: " + set);

        // Iterating over Set
        System.out.print("Iterating: ");
        for (String s : set) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
// Advanced Tips:
// - Use HashSet for fast access, TreeSet for sorted order, LinkedHashSet for insertion order.
// - Set is useful for removing duplicates from a collection.
// - Set does not support indexed access (no get/set by index).
