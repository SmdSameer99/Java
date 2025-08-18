package Array01;

import java.util.Arrays;

public class MoveAllZeros {
    public static int[] moveZeros(int[] arr){
        int countZeros = 0;
        int[] ans = new int[arr.length];
        for(int i: arr){
            if(i == 0) {
                countZeros++;
                continue;
            }
            //System.out.println(i);
            ans[i] = i;
        }
        while (countZeros > 0) {
            //System.out.println('0');
            ans[arr.length - countZeros] = 0;
            countZeros--;
        }
        return(ans);
    }
    
    public static void main(String[] args) {
        int arr[] = {0, 1, 0, 3, 12};
        int[] result = moveZeros(arr);
        System.out.println(Arrays.toString(result));
    }
}
