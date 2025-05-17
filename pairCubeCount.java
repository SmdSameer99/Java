public class pairCubeCount {
    
    public static void main(String[] args) {
        int n = 9; // Example value for n
        int count = 0;

        // Iterate through all pairs of integers (i, j)
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                // Check if the sum of cubes of i and j is a perfect cube
                if(n == (i * i * i) + (j * j * j)){
                    count++;
                    
                           }           }
        }

        System.out.println("Number of pairs (i, j) such that i < j and i^3 + j^3 is a perfect cube: " + count);
    }
}
