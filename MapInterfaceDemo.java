// MapInterfaceDemo.java
// Demonstrates Map interface
import java.util.*;
public class MapInterfaceDemo {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        System.out.println("Map: " + map);
    }
}
