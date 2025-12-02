package Array01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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

    public static int maxProfit2(int[] prices) {
        int size = prices.length;
        int profit = 0;
        if (size == 0) return 0;

        for(int i=0;i<size-1;i++){
            if(prices[i]<prices[i+1]){
                profit += prices[i+1] - prices[i];
            }
        }
        return profit;

    }

    public static int maxProfit3(int[] prices){
        // int size = prices.length;
        // if (size == 0) return 0;
        // List<Integer> buySell = new ArrayList<>();

        // int profit = 0;
        // for(int i=1;i<size;i++){
        //     if(prices[i] > prices[i-1]){
                
        //         profit += prices[i] - prices[i-1];
        //     }else if(prices[i] < prices[i-1]){
        //         buySell.add(profit);
        //         profit = 0;
        //     }
        // }
        // buySell.add(profit);
        // profit = 0;
        // Collections.sort(buySell, Collections.reverseOrder());
        // for(int j : buySell){
        //     System.out.print(j + " ");
        // }

        //     if(buySell.size() >= 2){
        //         profit = buySell.get(0) + buySell.get(1);
        //     }else{
        //         profit = buySell.get(0);
        //     }
        
        // return profit;

         int firstBuy = Integer.MAX_VALUE;
    int firstSell = 0;
    int secondBuy = Integer.MAX_VALUE;
    int secondSell = 0;
    
    for (int price : prices) {
        firstBuy = Math.min(firstBuy, price);                // Find lowest buy price
        firstSell = Math.max(firstSell, price - firstBuy);   // Find highest profit for 1st transaction
        secondBuy = Math.min(secondBuy, price - firstSell);  // Find lowest buy price considering previous profit
        secondSell = Math.max(secondSell, price - secondBuy); // Find highest total profit
    }
    
    return secondSell;
    }

    public static void main(String[] args) {

        BestTimeToBuyAndSellStock solution = new BestTimeToBuyAndSellStock();
        // int[] prices = {1,2,3,4,5};
        // int[] prices2 = {7, 6, 5, 3, 1};
        // int[] prices = {3,3,5,0,0,3,1,4};
        // int[] prices = {7,6,4,3,1};
        int[] prices = {1,2,4,2,5,7,2,4,9,0};

        int maxProfit = BestTimeToBuyAndSellStock.maxProfit(prices);
        System.out.println("Maximum profit is: " + maxProfit);

        int maxProfit2 = BestTimeToBuyAndSellStock.maxProfit2(prices);
        System.out.println("Maximum profit for multiple transactions is: " + maxProfit2);

        int maxProfit3 = BestTimeToBuyAndSellStock.maxProfit3(prices);
        System.out.println("Maximum profit with buy-sell pairs is: " + maxProfit3);

    }
}
