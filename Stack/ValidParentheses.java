package Stack;

public class ValidParentheses {

    public static boolean isValid(String s) {
        java.util.Stack<Character> stack = new java.util.Stack<>();


        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(')');
            } else if (c == '{') {
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            } else if (stack.isEmpty() || stack.pop() != c) {
                return false;
            }
        }

        return stack.isEmpty();
    }
        
    public static void main(String[] args) {
        String s = "([])"; // Example input
        System.out.println(isValid(s));
    }
}