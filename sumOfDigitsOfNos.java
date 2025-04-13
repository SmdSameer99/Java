public class sumOfDigitsOfNos {

    public static int sumOfDigits(int number){
        int sum = 0;
        while (number > 0) {

            sum += number % 10;
            number /= 10;
            
        }

        return sum;
    }

    public static String sumOfDigitsString(String numString){
        int sum = 0;
        
        for(int i = 0; i< numString.length();i++){
        
            int c = numString.charAt(i);
        
            sum += c - '0';
        }

          System.out.println();
        
        return String.valueOf(sum);
       
    }
    public static void main(String[] args) {
        // Example usage
        // int number = 12345; // Example number
        // int sum = sumOfDigits(number);
        // System.out.println("The sum of digits of " + number + " is: " + sum);

        // if given number is in string;
        String numberString = "67890"; 
        String sumString = sumOfDigitsString(numberString);
        System.out.println("The sum of digits of " + numberString + " is: " + sumString);
        
        
        
        
    }
}