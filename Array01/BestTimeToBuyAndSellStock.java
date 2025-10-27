package Array01;

public class BestTimeToBuyAndSellStock {
    
    //   public static int maxProfit(int[] prices) {
    //     int size = prices.length;
    //     if (size == 0) return 0;

    //     int maxValueSoFar = 0 ;

    //     for(int i=0;i<size; i++){
    //         for(int j=i;j<size;j++){

    //             if(prices[i]<prices[j]){
    //                 maxValueSoFar = Math.max(maxValueSoFar, prices[j] - prices[i]);
    //         }
    //     }
    // }
    //     return maxValueSoFar;
    
    // }

    public static int maxProfit(int[] prices) {
        int minSoFar = prices[0];
        int maxProfit = 0;

        for(int i=0;i<prices.length;i++){
            minSoFar = Math.min(minSoFar, prices[i]);

            maxProfit = Math.max(maxProfit, prices[i] - minSoFar);
        }
        return maxProfit;

    }

    public static void main(String[] args) {

        BestTimeToBuyAndSellStock solution = new BestTimeToBuyAndSellStock();
        int[] prices = {7,6,4,3,1, 10};
        // int[] prices2 = {7, 6, 5, 3, 1};
        
        int maxProfit = solution.maxProfit(prices);
        System.out.println("Maximum profit is: " + maxProfit);
    }
}
