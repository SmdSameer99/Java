// SetInterfaceDemo.java
// Demonstrates Set interface
import java.util.*;
public class SetInterfaceDemo {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("A");
        set.add("B");
        set.add("A"); // Duplicate, will not be added
        System.out.println("Set: " + set);
    }
}
