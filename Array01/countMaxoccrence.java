package Array01;

class countMaxoccrence {

    public int majorityElement(int[] nums) {
        // Find the min and max values to handle arbitrary ranges
        int min = nums[0], max = nums[0];
        for (int num : nums) {
            if (num < min) min = num;
            if (num > max) max = num;
        }
        int[] countNo = new int[max - min + 1];
        for (int num : nums) {
            countNo[num - min]++;
        }
        int ansIndex = 0;
        for (int i = 1; i < countNo.length; i++) {
            if (countNo[i] > countNo[ansIndex]) {
                ansIndex = i;
            }
        }
        return min + ansIndex;
    }

    public static void main(String[] args) {
        
        int arr[] = {-1,1,1,1,2,1};
        countMaxoccrence obj = new countMaxoccrence();
        System.out.println(obj.majorityElement(arr));


    }
}
