package Array01;

public class AdjIncreasingSubArray {
    
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;
        int count=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]<arr[i+1]){
                count++;
            }else{
                count = 0;
            }
            if (count>=2) {
                for(int j=i+1;j<arr.length;j++){
                     if(arr[i]<arr[i+1]){
                count++;
            }else{
                count = 0;
            }
                }
            }
        }
    }
}
