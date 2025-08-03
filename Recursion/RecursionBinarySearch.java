package Recursion;

public class RecursionBinarySearch {
        static long startTime = System.currentTimeMillis();


    public static void main(String[] args) {
    
    int[] arr = {2, 3, 4, 10, 40, 44, 54, 56, 78, 99};

    //give me larger array with 200 elements
    int[] arrLarg = new int[200];
    for (int i = 0; i < arrLarg.length; i++) {
        arrLarg[i] = i * 2; // fill with even numbers
    }

     int search = 40;
     System.out.println(search(arrLarg, search, 0, arrLarg.length - 1));

    // Example usage
        System.out.println("Time taken: " + (System.currentTimeMillis() - startTime) + " ms");
}

static int search(int[] arr, int target, int s, int e) {
     
    if (s > e) {
        return -1;
    }

    int m = s + (e -1) / 2;

    // checking middle element
    if(arr[m] == target){
        return m;
    }

    // checking if target is smaller than middle element
    if(target < arr[m]){
        return search(arr, target, s, m-1);
    }

    // checking if target is greater than middle element
    return search(arr, target, m+1, e);
}
}