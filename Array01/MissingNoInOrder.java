package Array01;

public class MissingNoInOrder {
    
    public int[] findErrorNums(int[] nums) {

        int  i = 0;
        
        while(i < nums.length){
            int correctIndex = nums[i] - 1;
            if(nums[i] != nums[correctIndex]){
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            }else{
                i++;
            }
        }

        for (i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                return new int[] {nums[i], i + 1};
            }
        }
        return new int[0];
        
    }

    public static void main(String[] args) {
        int[] arr = {1,2,2,4};
        MissingNoInOrder obj = new MissingNoInOrder();
        int[] result = obj.findErrorNums(arr);
        System.out.println("Duplicate: " + result[0] + ", Missing: " + result[1]);
        
}
}
