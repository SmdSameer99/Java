
public class LinearSearch {

    public static int linearSearch(int arr[], int target, int index){

        if(arr[index] == target){
            return index;
        }
        if (index == arr.length - 1){
            return -1;
        }
        return linearSearch(arr, target, index + 1);
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};
        int target = 6;
        int result = linearSearch(arr, target, 0);
    }

}