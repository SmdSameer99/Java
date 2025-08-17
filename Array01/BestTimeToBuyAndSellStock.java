public class BestTimeToBuyAndSellStock {
    
      public int maxProfit(int[] prices) {
        int arrayLenght = prices.length;

        int maxValueAfterMin = 0;
        int minValueToBuy = prices[0];
        int minValueToBuyLocation = 0;

        for(int i=0; i<arrayLenght; i++) {
            if(minValueToBuy > prices[i]) {
                minValueToBuy = prices[i];
                minValueToBuyLocation = i;
            } 
            maxValueAfterMin = Math.max(maxValueAfterMin, prices[i] - minValueToBuy);  
        }
        
        return maxValueAfterMin;
    
    }
    public static void main(String[] args) {

        BestTimeToBuyAndSellStock solution = new BestTimeToBuyAndSellStock();
        int[] prices = {7, 1, 5, 3, 6, 4};
        int[] prices2 = {7, 6, 5, 3, 1};
        
        int maxProfit = solution.maxProfit(prices);
        System.out.println("Maximum profit is: " + maxProfit);
    }
}
