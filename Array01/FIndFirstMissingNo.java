package Array01;

public class FIndFirstMissingNo {
    
    public int firstMissingPositive(int[] nums) {
        
        int i = 0, n = nums.length; 
        while(i < nums.length){
            int correctIndex = nums[i] - 1;
            if( nums[i] >0 && nums[i] < n && nums[i] != nums[correctIndex]){
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            }else{
                i++;
            }
        }
        i = 0;
        while(i < nums.length){
            if(nums[i] != i + 1){
                return i + 1;
            }
            i++;
        }

        return n + 1; 

    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 0};
        FIndFirstMissingNo obj = new FIndFirstMissingNo();
        int result = obj.firstMissingPositive(arr);
        System.out.println("\n First Missing Positive: " + result);
    }
}
