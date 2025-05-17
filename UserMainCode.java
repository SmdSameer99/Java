import java.io.*;
import java.util.*;
import java.util.Map.Entry; // Explicit import for Entry

public class UserMainCode {

    /**
     * Finds the first character in input2 that appears exactly input1 times.
     * Preserves the order of appearance from the original string.
     * Treats characters case-sensitively.
     * Includes spaces in the count.
     *
     * @param input1 The target frequency.
     * @param input2 The string to search within.
     * @return The first character (as a String) with frequency input1,
     * or the string "null" if no such character exists.
     */
    public static String findChar(int input1, String input2) {
        // Use LinkedHashMap to preserve the insertion order (order of first appearance)
        Map<Character, Integer> freqMap = new LinkedHashMap<>();

        // Count character frequency
        for (char c : input2.toCharArray()) {
            // getOrDefault simplifies adding/updating the count
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        // Find the first character (in insertion order) with frequency equal to input1
        for (Entry<Character, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() == input1) {
                // Found the first matching character
                return String.valueOf(entry.getKey());
            }
        }

        // No character found with the specified frequency
        return "null";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter target frequency (input1):");
        int input1 = sc.nextInt();
        sc.nextLine(); // consume the leftover newline

        System.out.println("Enter the string (input2):");
        String input2 = sc.nextLine();

        // Call the method and print the result
        String result = UserMainCode.findChar(input1, input2);
        System.out.println("Result:");
        System.out.println(result);

        sc.close(); // Close the scanner
    }
}