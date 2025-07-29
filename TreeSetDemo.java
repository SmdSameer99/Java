// TreeSetDemo.java
// Demonstrates TreeSet
import java.util.*;
public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();
        ts.add("Banana");
        ts.add("Apple");
        ts.add("Cherry");
        System.out.println("TreeSet (sorted): " + ts);
    }
}
