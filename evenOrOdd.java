public class evenOrOdd {
    public static String checkEvenOrOdd(int number) {
        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    public static void main(String[] args) {
        int number = 5; // Example number
        String result = checkEvenOrOdd(number);
        System.out.println("The number " + number + " is " + result + ".");
    }
    
}
