// HashSetDemo.java
// Demonstrates HashSet
import java.util.*;
public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(1);
        hs.add(2);
        hs.add(1); // Duplicate
        System.out.println("HashSet: " + hs);
    }
}
