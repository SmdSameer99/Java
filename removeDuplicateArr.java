public class removeDuplicateArr {
    
    public static int[] removeDuplicates(int[] arr) {
        int n = arr.length;
        if (n == 0) return arr;

        int[] temp = new int[n];
        int j = 0, newArrLength = 1;
        
        temp[0] = arr[0];
        for(int i=1;i<n;i++){
            if(arr[i] != temp[j]){
                j++;
                temp[j] = arr[i];
                newArrLength++;
            }
        }
        int[] result = new int[newArrLength];
        System.arraycopy(temp, 0, result, 0, newArrLength);
        return result;
        
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 4, 4, 5, 5, 6};
        int[] uniqueArr = removeDuplicates(arr);
        
        System.out.print("Array after removing duplicates: ");
        for (int num : uniqueArr) {
            System.out.print(num + " ");
        }
    }
}
