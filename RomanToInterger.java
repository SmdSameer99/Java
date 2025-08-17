import java.util.HashMap;
import java.util.Map;

public class RomanToInterger {
    
    public static int romanToInteger(String s) {

        Map<Character, Integer> romapMap = new HashMap<>();
        romapMap.put('I', 1);
        romapMap.put('V', 5);
        romapMap.put('X', 10);
        romapMap.put('L', 50);
        romapMap.put('C', 100);
        romapMap.put('D', 500);
        romapMap.put('M', 1000);

        int romanResult = 0;

        for(int i=0 ; i <s.length(); i++){
            int currentValue = romapMap.get(s.charAt(i));

            if(i+1 < s.length() && currentValue < romapMap.get(s.charAt(i+1))) {
                romanResult -= currentValue;
            } else {
                romanResult += currentValue;
            }

        }
        return romanResult;

    }
    public static void main(String[] args) {
        String romanNumeral = "MCMXCIV"; // Example Roman numeral
        String romanNumeral2 = "MMXXIII"; // Another example Roman numeral



        int integerValue = romanToInteger(romanNumeral);
        System.out.println("The integer value of " + romanNumeral + " is: " + integerValue);

        int integerValue2 = romanToInteger(romanNumeral2);
        System.out.println("The integer value of " + romanNumeral2 + " is: " + integerValue2);
    }
}
