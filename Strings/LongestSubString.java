package Strings;

public class LongestSubString {
    
    public static int FindLongestSubString(String str){
        int length = str.length();
        int ans = 1, temp = 1 ;
        
        for(int i=0; i<length-1 ; i++){
            if(str.charAt(i)+0 == str.charAt(i+1)-1 ){
                temp++;
            }else{
                temp = 1;
            } 

            if(ans < temp) {
                ans = temp;
        }}

        return ans;
    }

    public static void main(String[] args) {
        String str = "aaabbbccc";
        
        int ans = FindLongestSubString(str);

        
        System.out.println( ans);
    }
}
