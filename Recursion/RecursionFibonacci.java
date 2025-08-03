package Recursion;

public class RecursionFibonacci {
    public static int fibonacci(int n) {
        if (n <= 1) {
            System.out.println("sum : " + n);
            return n;
        }
        if(n > 1){
            System.out.print(n + " ");
        }
        
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 7;
        System.out.println("Fibonacci of " + n + " is: " + fibonacci(n));
}
}
