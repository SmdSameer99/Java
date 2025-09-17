package Array2D;

public class Sort2DArray {
    
    public static void main(String[] args) {
        
        int arr[][] = {
            {5, 4, 3},
            {2, 1, 0},
            {8, 7, 6}
        };

        int row = arr.length;
        int col = arr[0].length;
        int size = row * col;

        
        for(int i=0; i<row;i++){
            for(int j=0; j<col; j++){
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }

        
    }
}
