package Stack;

import java.util.Stack;

public class LongestValidParentheses {
    
    public static int longestValidParentheses(String s) {
        
            Stack<Character> stack = new Stack<>();
        int size = 0, maxSize = 0;

        for(int i=0 ;i<s.length();i++){
            char c = s.charAt(i);
            if (c == '(') {
                stack.push(')');
            } else if (c == '{') {
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            } else if (!stack.isEmpty()) {
                int temp = stack.pop();
                if(temp == c){
                size+=2;
                }
                if(temp !=c && size != 0){
                    size+=2;
                }
            }else{
                // maxSize = Math.max(maxSize, size);
                size = 0;
            } maxSize = Math.max(maxSize, size);
        }

        return maxSize;
  }


    public static void main(String[] args) {
        String s = "()(()";// Example input
        System.out.println(longestValidParentheses(s));
    }
}
