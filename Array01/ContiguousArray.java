package Array01;

public class ContiguousArray {
    
     public static int findMaxLength(int[] nums) {
        int zeroCount = 0, oneCount = 0, temp_zeroCount = 0, temp_oneCount = 0;
        for(int i=0; i<nums.length; i++){
             
            if(nums[i]==0 && ((i > 0 && nums[i-1] == 0) || (i < nums.length - 1 && nums[i+1]==0))){
                temp_zeroCount++;
                if(temp_zeroCount>zeroCount){
                    zeroCount=temp_zeroCount;
                }
            }else{ temp_zeroCount = 0;
            }
            if(nums[i]==1 && ((i > 0 && nums[i-1] == 1) || (i < nums.length - 1 && nums[i+1]==1))){
                temp_oneCount++;
                if(temp_oneCount>oneCount){
                    oneCount=temp_oneCount;
                }
            }else{ temp_oneCount = 0;
            }
                
        }

        return (oneCount>=zeroCount) ? zeroCount*2 : oneCount*2;
    }
    public static void main(String[] args) {
        int[] nums = {0,1,1,1,1,1,0,0,0};
        System.out.println(findMaxLength(nums));

    }
}
