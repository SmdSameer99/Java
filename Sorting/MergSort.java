package Sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class MergSort {

    private static int[] merge(int array[], int low, int mid, int high){

        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid + 1;

        while (left <= mid && right <= high) {
            if (array[left] <= array[right]) {
                temp.add(array[left]);
                left++;
            } else {
                temp.add(array[right]);
                right++;
            }
        }
        // Add remaining elements from left subarray
        while (left <= mid) {
            temp.add(array[left]);
            left++;
        }
        // Add remaining elements from right subarray
        while (right <= high) {
            temp.add(array[right]);
            right++;
        }
        // Copy merged elements back to original array
        for (int i = low; i <= high; i++) {
            array[i] = temp.get(i - low);
        }
        return array;

    }

    public static int[] mergeSort (int array[], int low, int high) {
                   
        if (low < high) {
            int mid = (low + high) / 2;
            mergeSort(array, low, mid);
            mergeSort(array, mid + 1, high);
            merge(array, low, mid, high);
        }
    
        return array;
    }
    

    public static void main(String[] args) {

        int[] array = {38, 27, 43, 3, 9, 82, 10, 1, 5, 7, 6, 4, 8, 2, 0, 15, 14, 13, 12, 11, 20, 19, 18, 17, 16, 25, 24, 23, 22, 21, 30, 29, 28, 35, 34, 33, 32, 31, 40, 39, 45, 44, 50};

        System.out.println("Unsorted array: " + Arrays.toString(array));

        int ans[] = mergeSort(array, 0, array.length - 1);

        System.out.println("Sorted array: " + Arrays.toString(ans));
    }
}
