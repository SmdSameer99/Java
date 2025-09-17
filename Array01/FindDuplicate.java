package Array01;

import java.util.List;

public class FindDuplicate {
    

    public List<Integer> findDuplicates(int[] nums) {
        
        int  i = 0;
        List<Integer> missingNos = new java.util.ArrayList<>();
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
        i = 0;
        while(i < nums.length){

            if(nums[i] != i+1){
                missingNos.add(nums[i]);
            }
            i++;
        }
        return missingNos;

    }

    public static void main(String[] args) {
        int[] arr = {1 };
        FindDuplicate obj = new FindDuplicate();
        List<Integer> result = obj.findDuplicates(arr);
        System.out.println("Duplicates: " + result);
    }
}
