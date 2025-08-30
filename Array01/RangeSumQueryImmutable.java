package Array01;

public class RangeSumQueryImmutable {

    static class NumArray {
        private int[] sumedArray;

        public NumArray(int[] nums) {
            int arrayLength = nums.length;
            sumedArray = new int[arrayLength + 1];
            sumedArray[0] = 0;
            for (int i = 0; i < arrayLength; i++) {
                sumedArray[i + 1] = sumedArray[i] + nums[i];
            }
        }

        public int sumRange(int left, int right) {
            return sumedArray[right + 1] - sumedArray[left];
        }
    }

    public static void main(String[] args) {

        int[] nums = {-2, 0, 3, -5, 2, -1};

        NumArray obj = new NumArray(nums);
        int left = 2;
        int right = 5;
        
        int param_1 = obj.sumRange(left, right);
        System.out.println(param_1);
    }

}
