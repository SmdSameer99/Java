package Array01;

public class CycleSort {

    private static void cycleSort(int[] arr) {
        int i = 0;
        while(i < arr.length){

            int correctIndex = arr[i] - 1;
            if(arr[i] != arr[correctIndex] ){
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            }else{
                i++;
            }
        }

    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 2, 4};
        cycleSort(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}