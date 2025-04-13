public class closestToNandDevisibleM {
    
    public static int FindNumber(int n, int m) {
        int closest = 0;

       int tempCal = n/m;
       
       int multiple1 = tempCal * m;
       int multiple2 = (tempCal + 1) * m;

       if( n - multiple1 < multiple2 - n){
              closest = multiple1;
       } else {
                closest = multiple2;
       }
       
       return closest;
    }

    public static void main(String[] args) {
        int n = 13;
        int m = 6;

        int result = FindNumber(n, m);
        System.out.println("The closest number to " + n + " that is divisible by " + m + " is: " + result);

    }
}
