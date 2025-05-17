public class distanceBetweenTwoPoints {

    public static double calculateDistance(double x1, double y1, double x2, double y2) {
        // by applying the pythagorean theorem
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

 
    public static void main(String[] args) {
        
        // Example coordinates
        double x1 = 3.0;
        double y1 = 4.0;
        double x2 = 7.0;
        double y2 = 1.0;

        // Calculate the distance
        double distance = calculateDistance(x1, y1, x2, y2);

        // Print the result
        System.out.println("The distance between the points is: " + distance);
    }
}