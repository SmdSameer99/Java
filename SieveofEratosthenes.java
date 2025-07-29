public class SieveofEratosthenes {
    public static void main(String args[]) {
        int n = 20;

        boolean prime[] = new boolean[n + 1];
        for (int i = 0; i <= n; i++) {
            prime[i] = true; // Assume all numbers are prime initially
        }
        prime[0] = prime[1] = false; // 0 and 1 are not prime numbers

        for (int p = 2; p * p <= n; p++) {
            if (prime[p]) { // If prime[p] is still true
                for (int i = p * p; i <= n; i += p) {
                    prime[i] = false; // Mark multiples of p as not prime
                }
            }
        }

        System.out.println("Prime numbers up to " + n + ":");
        for (int i = 2; i <= n; i++) {  
            if (prime[i]) {
                System.out.print(i + " "); // Print prime numbers
            }
        }.
        
    }
}
