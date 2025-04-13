// self note: yet to be completed

public class romanToInteger {

    
    // Method to convert a Roman numeral to an integer
    public static int getRomanValue(char c) {
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0; // Invalid character
        }
    }
    
    public static int romanToInt(String s) {
        int total = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            int value = getRomanValue(c);

            if (value < prevValue) {
                total -= value;
            } else {
                total += value;
            }
            prevValue = value;
        }

        return total;
    }
    public static void main(String[] args) {
        // Example usage
        String roman = "MCMXCIV"; // Example Roman numeral
        int result = romanToInt(roman);
        System.out.println("The integer value of " + roman + " is: " + result);


        


    }
}
