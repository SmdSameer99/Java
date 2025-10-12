public class InsertionSort {

    public static void main(String[] args) {
        int arr[] = {5, 4, 3, 2, 1};
        int n = arr.length;

        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                if(arr[i] < arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                System.out.println("i: " + i +" j: " + j+"\n\n");
                for(int no: arr){ System.out.print(" "+ no);
                
                }System.out.println();
            }
        }
        for(int i: arr){
            System.out.print(" "+ i);
        }
    }
}