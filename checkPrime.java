import java.util.*;

public class checkPrime {
    public static boolean checkIfPrime(int input){
        if (input <= 1) {
            return false; // 0 and 1 are not prime numbers
        }
        for (int i = 2; i <= Math.sqrt(input); i++) {
            if (input % i == 0) {
                return false; // Found a divisor, not prime
            }
        }
        return true; // No divisors found, it's prime
    }
        

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it's prime:");
        int input = sc.nextInt();
        boolean isPrime = checkIfPrime(input);
        System.out.println("Is the number prime? " + isPrime);
        sc.close();
    }
}
