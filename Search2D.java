public class Search2D {
    
    // public static int[] searchIn2DArray(int[][] matrix, int target) {
    //     if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
    //         return new int[]{-1, -1}; // Return -1, -1 if the matrix is empty
    //     }
        
    //     int rows = matrix.length;
    //     int cols = matrix[0].length;
        
    //     int row = 0;
    //     int col = cols/2; // Start from the top-right corner
        
    //     while (row < rows && col >= 0) {
    //         if (matrix[row][col] == target) {
    //             return new int[]{row, col}; // Element found
    //         } else if (matrix[row][col] > target) {
    //             col--; // Move left 
    //         } else {
    //             row++; // Move down
    //         }
    //     }
        
    //     return new int[]{-1, -1}; // Element not found
    // }

    public static int[] searchIn2DArray(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int binaryRow = 0;
        int binaryCol = cols-1;

        while(binaryRow < rows && binaryCol >= 0 ){
            if(matrix[binaryRow][binaryCol] == target){
                System.out.println("true");
                return new int[]{binaryRow, binaryCol};
            }else if( matrix[binaryRow][binaryCol] > target ){
                binaryCol--;
            }else{
                binaryRow++;
            }
        }

        return new int[]{-1, -1};
    }

        

    
    public static void main(String[] args) {
        // int[][] matrix = {
        //     {1, 2, 3, 4},
        //     {5, 6, 7, 8},
        //     {9, 10, 11, 12},
        //     {13, 14, 15, 16}
        // };

        // int [][] matrix = {{1}};
        // System.out.println(matrix.length);
        // System.out.println(matrix[0].length);
        // System.out.println(matrix[0][0]);
        int [][] matrix = new int[][] {
            {1,4,7,11,15},
            {2,5,8,12,19},
            {3,6,9,16,22},
            {10,13,14,17,24},
            {18,21,23,26,30}
        };
        
        
        int target = 1;
        int[] result = searchIn2DArray(matrix, target);
        
        if (result[0] != -1) {
            System.out.println("Element found at: (" + result[0] + ", " + result[1] + ")");
        } else {
            System.out.println("Element not found");
        }
    }
    }

