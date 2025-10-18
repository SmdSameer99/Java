package Recursion;

public class StartParttten {
    

    public static void printPattern(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n + " \n");
        printPattern(n - 1);
        System.out.print(n + " ");
    }
    public static void main(String[] args) {
        int n = 5;
        printPattern(n);
    }
}
