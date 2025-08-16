package Array01;

import java.util.ArrayList;

public class RemoveDuplicateSorted {
    public static int removeDuplicate(int arr[]) {
        if (arr.length == 0) {
            return 0;
        }

        ArrayList<Integer> result = new ArrayList<>();
        result.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                result.add(arr[i]);
            }
        }
        
        for( int i : result){
            
        }


    }
}
