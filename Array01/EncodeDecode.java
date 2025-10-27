
package Array01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class EncodeDecode {

    // Encode multiple strings into one string: each entry as "<length>#<content>"
    public static String encode(List<String> strs) {
        StringBuilder encoded = new StringBuilder();
        for (String s : strs) {
            encoded.append(s.length()).append('#').append(s);
        }
        return encoded.toString();
    }

    // Convenience varargs overload
    public static String encode(String... strs) {
        return encode(Arrays.asList(strs));
    }

    // Decode the single encoded string back into the original list of strings
    public static List<String> decode(String str) {
        List<String> decoded = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            // parse the length number
            int len = 0;
            while (i < str.length() && Character.isDigit(str.charAt(i))) {
                len = len * 10 + (str.charAt(i) - '0');
                i++;
            }
            // expect '#'
            if (i >= str.length() || str.charAt(i) != '#') {
                break; // malformed input; stop parsing
            }
            i++; // move past '#'
            // extract the string of the parsed length
            if (i + len > str.length()) {
                break; // malformed input; stop parsing
            }
            decoded.add(str.substring(i, i + len));
            i += len;
        }
        return decoded;
    }

    public static void main(String[] args) {
        List<String> input = Arrays.asList(
            "Hello World!",
            "Test",
            "Another one with # hash",
            ""
        );

        String encoded = encode(input);
        System.out.println("Encoded: " + encoded);

        List<String> decoded = decode(encoded);
        System.out.println("Decoded:");
        for (String s : decoded) {
            System.out.println(s);
        }
    }
}
