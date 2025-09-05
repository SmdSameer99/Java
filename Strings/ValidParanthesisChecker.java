package Strings;

public class ValidParanthesisChecker {
    
    public static boolean CheckSring(String str){

        int StringSize = str.length();

        if(StringSize%2 == 1 || StringSize == 0) return false;

        int left = 0, right = StringSize-1;

        while (left < right){
            if((str.charAt(left) == '(' && str.charAt(right) == ')') ||str.charAt(left) == '*' || str.charAt(right) == '*'){
                System.out.println("left " + str.charAt(left) +", right " +  str.charAt(right) );
                left++;
                right--;
            }else{ 
                return false;
            }

        }
        return true;
    } 

    public static void main(String[] args) {
        // Test Case 1: Simple balanced parentheses with asterisks
        test("(*))", "Simple balanced parentheses with asterisks");

        // Test Case 2: All asterisks
        test("***", "All asterisks");

        // Test Case 3: Balanced with asterisks in middle
        test("(*)", "Balanced with asterisks in middle");

        // Test Case 4: Unbalanced - more closing brackets
        test("((*))", "Unbalanced - more closing brackets");

        // Test Case 5: Unbalanced - more opening brackets
        test("((*)", "Unbalanced - more opening brackets");

        // Test Case 6: Empty string
        test("", "Empty string");

        // Test Case 7: Complex case with multiple asterisks
        test("(**)(*)(*)", "Complex case with multiple asterisks");

        // Test Case 8: Incorrect order
        test(")(", "Incorrect order");

        // Test Case 9: Single bracket
        test("(", "Single bracket");

        // Test Case 10: Asterisks can act as both
        test("((*)**))(", "Asterisks can act as both");
    }

    private static void test(String input, String description) {
        boolean result = CheckSring(input);
        System.out.println("Test: " + description);
        System.out.println("Input: " + input);
        System.out.println("Result: " + result);
        System.out.println("------------------------");
    }


}
