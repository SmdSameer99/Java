public class SmallestIntDivK {
    
    public static int getOneDigitNum(int no){
        switch (no) {
            case 1: return 1; 
            case 2: return 11; 
            case 3: return 111; 
            case 4: return 1111; 
            case 5: return 11111; 
            case 6: return 111111;
            default: return -1; 
        }
    }
    public static void main(String[] args) {
        int k = 7;
        
        int startLoop_I = Integer.toString(k*10).length();

        System.out.println("next length for loop " + startLoop_I);

        int ans = -1;
        for(int i = startLoop_I; i <= 6; i++ ){
            
            int digitNo = getOneDigitNum(i);
            System.out.println("Digit no: " +digitNo);
            if(digitNo%k == 0){
                ans = digitNo;
                break;
            }   
        }

        System.out.println(ans+" len: "+String.valueOf(ans).length());
    }
}
