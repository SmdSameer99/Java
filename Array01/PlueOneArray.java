package Array01;

public class PlueOneArray {
    
    public static int[] plusOne(int[] arr){
        int ans[] = new int[arr.length];
        int carry = 0;

        for(int i = arr.length - 1; i >= 0; i--){ //looop revise 
            
            int sum = arr[i] + carry; 

            if(i == arr.length - 1) sum++; //1st +1

            if(sum == 10){
                ans[i] = 0;
                carry = 1;
            } else {
                ans[i] = sum;
                carry = 0;
            }
            if(i == 0 && carry > 0) {
                ans = SecondPlusLoop(arr);
            }else if(i == 0 && carry == 0) {
                
                ans[0] += carry ;

            }
        }
        

        return ans;
    }

    public static int[] SecondPlusLoop(int[] arr) {
        int ans[] = new int[arr.length + 1];
        int carry = 0;

        for(int i = arr.length - 1; i >= 0; i--){ //loop revise 
            int sum = arr[i] + carry; 

            if(i == arr.length - 1) sum++; //1st +1

            if(sum == 10){
                ans[i + 1] = 0;
                carry = 1;
            } else {
                ans[i + 1] = sum;
                carry = 0;
            }
        }
        ans[0] = carry;

        return ans;
    }

    public static void main(String[] args) {
    
        int arr[] = { 9};
        int arr2[] = {9, 9, 9};
        int result[] = plusOne(arr);
        int result2[] = plusOne(arr2);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
