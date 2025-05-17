public class validTriangeOrNot {
    
    public static boolean isValidTriangle(int a, int b, int c) {
        // Check if the sum of any two sides is greater than the third side
        if (a + b <= c) {
            System.out.println("Failed: a + b > c");
            return false;
        }
        if (a + c <= b) {
            System.out.println("Failed: a + c > b");
            return false;
        }
        if (b + c <= a) {
            System.out.println("Failed: b + c > a");
            return false;
        }
        System.out.println("Passed: a + b > c");
        System.out.println("Passed: a + c > b");
        System.out.println("Passed: b + c > a");
        return true;
    }

    public static void main(String[] args) {
        int side1 = 4;
        int side2 = 4;
        int side3 = 4;

        if (isValidTriangle(side1, side2, side3)) {
            System.out.println("The sides form a valid triangle.");
        } else {
            System.out.println("The sides do not form a valid triangle.");
        }
    }
}
