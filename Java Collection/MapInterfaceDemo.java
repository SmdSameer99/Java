// MapInterfaceDemo.java
// Demonstrates Map interface
//
// What is Map Interface?
// ----------------------
// Map is an interface in Java Collections Framework that represents a collection of key-value pairs.
// Each key maps to exactly one value. Keys are unique, values can be duplicated.
// Common implementations: HashMap, TreeMap, LinkedHashMap.
//
// Key Features:
// - Stores key-value pairs
// - Keys must be unique, values can be duplicated
// - Allows null values and one null key (HashMap)
// - Not a true Collection (does not extend Collection interface)
//
// Example usage below:
import java.util.*;
public class MapInterfaceDemo {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        System.out.println("Map: " + map);
        // Accessing value by key
        System.out.println("Value for key 2: " + map.get(2));
        // Checking if key exists
        System.out.println("Contains key 1? " + map.containsKey(1));
        // Removing a key-value pair
        map.remove(3);
        System.out.println("After removal: " + map);
        // Iterating over keys and values
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
// Advanced Tips:
// - Use HashMap for fast access, TreeMap for sorted keys, LinkedHashMap for insertion order.
// - For thread-safe maps, use ConcurrentHashMap or Collections.synchronizedMap.
// - Map is ideal for lookups, caching, and associative arrays.
