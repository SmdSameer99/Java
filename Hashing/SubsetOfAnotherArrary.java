package Hashing;

import java.util.HashSet;

public class SubsetOfAnotherArrary {

    static boolean isSubset(int arr1[], int arr2[]) {
        int n = arr1.length;
        int m = arr2.length;

        // using by hasjing
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(arr1[i]);
        }   

        for (int i = 0; i < m; i++) {
            if (!set.contains(arr2[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        
        int arr1[] = {11, 1, 13, 21, 3, 7};
        int arr2[] = {11, 3, 7, 1};

        System.out.println(isSubset(arr1, arr2));


    }
}
