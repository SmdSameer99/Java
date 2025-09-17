package Array01;

import java.util.List;

public class MissingNumber {
    
    // private static int missingNumber(int[] arr) {
    //     int i = 0, missingNo = arr.length;

    //     //sort the array
    //     while(i < arr.length){
    //         int correctIndex = arr[i];
    //         if(arr[i] < arr.length && arr[i] != arr[correctIndex]){
    //             int temp = arr[i];
    //             arr[i] = arr[correctIndex];
    //             arr[correctIndex] = temp;
                
    //         }else{
    //             i++;
    //         }
    //     }

    //     //search for missing number
    //     for (int index = 0; index < arr.length; index++) {
    //         if(arr[index] != index){
    //             missingNo = index;
    //             break;
    //         }
    //     }
    //     return missingNo;
    // }

        private static List<Integer> missingNumbers(int[] arr) {
        int i = 0;
        List<Integer> missingNos = new java.util.ArrayList<>();
        //missingNos.add(arr.length);

        //sort the array
        while(i < arr.length){
            int correctIndex = arr[i]-1;
            if(arr[i] != arr[correctIndex]){
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
                
            }else{
                i++;
            }
        }
        // print loop 
        // for (int index = 0; index < arr.length; index++) {
        //     System.out.print (arr[index] + " "  );
        // }
        //search for missing number
        i=0;
        while (i < arr.length) {
            if(arr[i] != i+1 ){
                missingNos.add(i+1);
            }
            i++;            
        }
       
        
        return missingNos;
    }

    

    public static void main(String[] args) {
        
        int arr[] = {4,3,2,7,8,2,3,1};
        System.out.println(missingNumbers(arr));

    }
}
