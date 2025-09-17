package Array2D;

public class SearchingKey2D {
    
    public static void main(String[] args) {
        
        int arr[][] = {
            {5, 4, 3},
            {2, 1, 0},
            {8, 7, 6}
        };

        int row = arr.length;
        int col = arr[0].length;
        int size = row * col;
        int key = 7;

        for(int i=0; i<row;i++){
            for(int j=0; j<col; j++){
                if(arr[i][j] == key){
                    System.out.println("Key found at index: (" + i + ", " + j + ")");
                    break;
                }
            }
            System.out.println();
        }
    }   
}
