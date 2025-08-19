package Array01;

import java.math.BigInteger;

public class MultiplyStrings {
    public static String multiply(String num1, String num2) {
        //StringBuilder ans = new StringBuilder();
        String X = 0, y = 0;

        for(int i=0;i<num1.length();i++){
            X = X * 10 + (num1.charAt(i) - '0');
        }

        for(int i=0;i<num2.length();i++){
            y = y * 10 + (num2.charAt(i) - '0');
        }

        BigInteger product = X * y;
        String ans = String.valueOf(product);

        return ans;
    }


    public static void main(String[] args) {

        String num1 = "123456789";
        String num2 = "987654321";
        String result = multiply(num1, num2);
        System.out.println("Result: " + result);
    }
}
