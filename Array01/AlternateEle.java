package Array01;

import java.util.ArrayList;

public class AlternateEle {
    static ArrayList<Integer> altArrayList(ArrayList<Integer> arr) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr.size(); i += 2) {
            result.add(arr.get(i));
        }
        return result;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            arr.add((int)(Math.random()*1000));
        }
        
        System.out.println("Original Array: " + arr);
        
        ArrayList<Integer> alternateElements = altArrayList(arr);
        System.out.println("\n\n Alternate elements: " + alternateElements);
    }
}
