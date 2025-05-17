import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordOccurrences {
    
    // Method to find all occurrences of a word in a string
    public static List<Integer> findOccurrences(String inputString, String wordToFind) {
        List<Integer> indices = new ArrayList<>();
        int start = 0;

        while (start < inputString.length()) {
            start = inputString.indexOf(wordToFind, start);
            if (start == -1) {
                break;
            }
            indices.add(start);
            start += wordToFind.length(); // Move past the current occurrence
        }
        return indices;
    }

    // Method to check special conditions after an index
    public static List<String> checkSpecialConditions(String inputString, String wordToFind) {
        List<Integer> occurrences = findOccurrences(inputString, wordToFind);
        List<String> result = new ArrayList<>();

        for (int index : occurrences) {
            if (index + wordToFind.length() < inputString.length() && 
                inputString.charAt(index + wordToFind.length()) == '7') {
                result.add("Special condition met after index " + index);
            }
        }
        return result;
    }

    // Main method to process words and check conditions with dynamic input
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a string:");
        String inputString = scanner.nextLine();
        
        System.out.println("Enter words to search for (comma-separated):");
        String[] words = scanner.nextLine().split(",");

        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].trim(); // Trim spaces
        }

        processString(inputString, words);
        
        scanner.close();
    }

    public static void processString(String inputString, String[] words) {
        for (String word : words) {
            System.out.println("Searching for word: " + word);
            List<Integer> indices = findOccurrences(inputString, word);
            System.out.println("Indices of '" + word + "': " + indices);

            List<String> specialConditions = checkSpecialConditions(inputString, word);
            for (String condition : specialConditions) {
                System.out.println(condition);
            }
        }
    }
}