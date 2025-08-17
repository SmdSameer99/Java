class Solution {
    public int findDuplicate(int[] nums) {

       int n =  nums.length;
       boolean[] seen = new boolean[n];
       for (int i = 0; i < n; i++) {
           if (seen[nums[i]]) {
               return nums[i];
           }
           seen[nums[i]] = true;
       }
       return -1;
       
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 3, 4, 2, 2};
        int duplicate = solution.findDuplicate(nums);
        System.out.println("Duplicate number is: " + duplicate);
    }
}