package Tasks;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LibrarySystem {
    
    public static void main(String[] args) {
        
        System.out.println("Library System");

        Map<String, List<String>> library = new HashMap();
        
        library.put("Fiction", new ArrayList<>(Arrays.asList("Book_f01", "b_f02")));
        library.put("Science", new ArrayList<>(Arrays.asList("Book_f001", "b_f002")));
    

        for(Map.Entry<String, List<String>> entry : library.entrySet()){
            System.out.println(entry.getKey() + "  Book " + entry.getValue());
        }

        System.out.println(library.entrySet());
    }
}
