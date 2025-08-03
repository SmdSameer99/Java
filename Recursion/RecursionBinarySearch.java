package Recursion;

public class RecursionBinarySearch {

    public static void main(String[] args) {
    
    int[] arr = {2, 3, 4, 10, 40, 44, 54, 56, 78, 99};
     int search = 40;
     System.out.println(search(arr, search, 0, arr.length - 1));

}

static int search(int[] arr, int target, int s, int e) {
     
    if (s > e) {
        return -1;
    }

    int m = s + (e -1) / 2;

    if(arr[m] == target){
        return m;
    }

    if(target < arr[m]){
        return search(arr, target, s, m-1);
    }

    return search(arr, target, m+1, e);
}
}