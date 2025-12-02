import java.util.ArrayList;
import java.util.List;

public class LetterCombination {
    
    public static List<String> letterCombinations (String digits) {
        if (digits == null || digits.length() == 0) {
            return new ArrayList<>();
        }
        List<String> result = new ArrayList<>();

        //2,3
        for(int i=0;i<digits.length();i++){
            char ch = (char) (digits.charAt(i)+'0');
            System.out.println(ch);
            
            for(int j=0;j<3;j++){
                char ch2 = (char) (ch+j);
                System.out.println("  "+ch2);
                result.add(""+ch+ch2);
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        
        String digits = "23";
        System.out.println("Letter combinations for digits " + digits + ": " + letterCombinations(digits));
    }
}
