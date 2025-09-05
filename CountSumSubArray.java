public class CountSumSubArray {
    
    // brute force approach
    public int subarraySum(int[] nums, int k) {
        int count = 0, sum = 0 ;

        for(int i=0; i< nums.length; i++){
            sum = 0;
            for(int j = i; j< nums.length; j++){
                sum += nums[j];
                if(sum == k) count++;
            }

        } return count;
    }

    // optimal approach
    public int subarraySumOptimal(int[] nums, int k) {
        
    }

    public static void main(String[] args) {
        int nums[] = {1,1,1};
        int k = 2;

        CountSumSubArray obj = new CountSumSubArray();
        System.out.println(obj.subarraySum(nums, k));
    }
}
