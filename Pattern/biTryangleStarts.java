package Pattern;

public class biTryangleStarts {
    
    public static void printBiTryangleStarts(int n) {
    
        // Upper triangle
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i-1; j++){
                System.out.print("  ");
            }
            for(int j=0; j<=i; j++){
                System.out.print(" *");
            }
            System.out.println();
        }

        // Lower triangle
        for(int i=n-2; i>=0; i--){
            for(int j=0; j<n-i-1; j++){
                System.out.print("  ");
            }
            for(int j=0; j<=i; j++){
                System.out.print(" *");
            }
            System.out.println();
        }
        
       
    }


    public static void main(String[] args) {
        
        System.out.println("Bi Tryangle Starts");

        int n = 10;
        
        printBiTryangleStarts(n);
    }
}
