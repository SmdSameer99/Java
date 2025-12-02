package Strings;

public class LongestCommonString {
    public static void main(String[] args) {
        // Example usage
        String[] strings = {"bicycle", "cycle", "icicle"};
        String longestCommonSubstring = findLongestCommonSubstring(strings);
        System.out.println("Longest Common Substring: " + longestCommonSubstring);
    }

    public static String findLongestCommonSubstring(String[] strings) {
        if (strings == null || strings.length == 0) {
            return "";
        }
        
        String result = strings[0];
        
        // Compare with each string in the array
        for (int i = 1; i < strings.length; i++) {
            String str2 = strings[i];
            String tempResult = "";
            
            // Try all substrings of result
            for (int j = 0; j < result.length(); j++) {
                for (int k = j + 1; k <= result.length(); k++) {
                    String substring = result.substring(j, k);
                    
                    // Check if this substring exists in str2
                    if (str2.contains(substring) && substring.length() > tempResult.length()) {
                        tempResult = substring;
                    }
                }
            }
            
            result = tempResult;
            if (result.isEmpty()) {
                return "";
            }
        }
        
        return result;
    }

    private static String commonSubstring(String str1, String str2) {
        String result = "";
        
        // Try all substrings of str1
        for (int i = 0; i < str1.length(); i++) {
            for (int j = i + 1; j <= str1.length(); j++) {
                String substring = str1.substring(i, j);
                
                // Check if this substring exists in str2
                if (str2.contains(substring) && substring.length() > result.length()) {
                    result = substring;
                }
            }
        }
        return result;
    }
}
