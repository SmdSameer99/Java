public class ReverseInterger {
    
    public static void main(String[] args) {
        int x = 1534236469;

        System.out.println(reverse(x));
    }

    private static int reverse(int x) {
    
        int ans = 0;

        // check range -2^31 to 2^31 -1
        

        while(x != 0){
            if(ans > Integer.MAX_VALUE / 10 || ans < Integer.MIN_VALUE / 10){
                return 0;
            }
            int temp = x % 10;
            x = x / 10;
            ans = ans * 10 + temp;
        }
        
        return ans;

    }
}
