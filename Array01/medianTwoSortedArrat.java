package Array01;

public class medianTwoSortedArrat {
    
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
   
        double ans = 0.0;
        int sizeNum1 = nums1.length,  sizeNum2 = nums2.length;
        int[] nums3 = new int[sizeNum1 + sizeNum2];

        int arrayPointer1 = 0, arrayPointer2 = 0;

        for(int i=0;i<sizeNum1+sizeNum2;i++){

            if(arrayPointer1 < sizeNum1 && arrayPointer2 < sizeNum2){
                if(nums1[arrayPointer1] < nums2[arrayPointer2]){
                    nums3[i] = nums1[arrayPointer1];
                    arrayPointer1++;
                }else{
                    nums3[i] = nums2[arrayPointer2];
                    arrayPointer2++;
                }
            }else if(arrayPointer1 < sizeNum1){
                nums3[i] = nums1[arrayPointer1];
                arrayPointer1++;
            }else{
                nums3[i] = nums2[arrayPointer2];
                arrayPointer2++;
            }          
        }
        int sizeNum3 = nums3.length;
        if(sizeNum3 % 2 == 0){
            int mid = sizeNum3 / 2;
            ans = (double)(nums3[mid] + nums3[mid - 1]) / 2;
        }else{
            int mid = sizeNum3 / 2;
            ans = (double)nums3[mid];
        }
        return ans;

    }

    public static void main(String[] args) {
        medianTwoSortedArrat obj = new medianTwoSortedArrat();
        int[] nums1 = {1,2};
        int[] nums2 = {3, 4};
        System.out.println(obj.findMedianSortedArrays(nums1, nums2));
    }
}   