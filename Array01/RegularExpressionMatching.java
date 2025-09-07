package Array01;

public class RegularExpressionMatching {

    public boolean isMatch(String s, String p) {
        int x = s.length();
        int y = p.length();
        
        int max = Math.max(x, y);
        

        
        

        return (count == y) ? true : false;
    }

    public static void main(String[] args) {
        RegularExpressionMatching obj = new RegularExpressionMatching();
        String s = "aa";
        String p = "a*";
        System.out.println(obj.isMatch(s, p));
    }
    
}
