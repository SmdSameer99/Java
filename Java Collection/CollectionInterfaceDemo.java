// CollectionInterfaceDemo.java
// Demonstrates Collection interface
//
// What is Collection Interface?
// ----------------------------
// Collection is the root interface of the Java Collections Framework.
// It represents a group of objects, known as elements.
// All other collection interfaces (List, Set, Queue) extend Collection.
//
// Key Features:
// - Defines basic operations: add, remove, contains, size, clear, etc.
// - Cannot be instantiated directly (use classes like ArrayList, HashSet, etc.)
// - Provides methods for bulk operations (addAll, removeAll, retainAll)
//
// Example usage below:
import java.util.*;
public class CollectionInterfaceDemo {
    public static void main(String[] args) {
        // Using Collection interface with ArrayList implementation
        Collection<String> collection = new ArrayList<>();
        collection.add("A");
        collection.add("B");
        System.out.println("Collection: " + collection);

        // Checking if collection contains an element
        System.out.println("Contains 'A'? " + collection.contains("A"));

        // Removing an element
        collection.remove("A");
        System.out.println("After removal: " + collection);

        // Checking size
        System.out.println("Size: " + collection.size());

        // Clearing the collection
        collection.clear();
        System.out.println("After clear: " + collection);
    }
}
// Advanced Tips:
// - Use Collection as a reference type for flexibility.
// - All List, Set, and Queue implementations can be referenced as Collection.
// - Collection interface does not include map-related methods (see Map interface for that).
