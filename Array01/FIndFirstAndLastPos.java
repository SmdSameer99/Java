package Array01;


public class FIndFirstAndLastPos {
    public static void searchRange(int[] nums, int target) {
       
        int ansX = -1, ansY = -1, right = 0;
        int left = nums.length;
        int mid = 0;
        while (right>left) {
            mid = (right + left)/2;
            if(nums[mid] == target){
                ansX = mid;
            }else if(target> nums[mid]){
                left  = mid + 1 ;
            }else{
                right = mid - 1 ;
            }
        }
        while (right>left) {
            mid = (right + left)/2;
            if(nums[mid] == target){
                ansY = mid;
            }else if(target> nums[mid]){
                left  = mid + 1 ;
            }else{
                right = mid - 1 ;
            }
        }
        System.out.println(ansX + " " + ansY);
    }

    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;

        //System.out.println(Arrays.toString(searchRange(nums, target)));

        searchRange(nums, target);
    }
}
