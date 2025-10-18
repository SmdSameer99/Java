package Recursion;

public class RecursionBinarySearch {

    public static int binarySearch(int arr[], int target, int start, int end){

        int index = 0;
        
        if(start > end){
            return -1;
        }
        int mid = start + (end - start)/2;

        if(arr[mid] == target){
            return mid;
        }else if (arr[mid] > target){
            index = binarySearch(arr, target, start, mid - 1);
        }else{
            index = binarySearch(arr, target, mid + 1, end);
        }
        return index;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 5;
        int result = binarySearch(arr, target, 0, arr.length - 1);
        System.out.println("Element found at index: " + result);
    }
}