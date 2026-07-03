class Solution {
    public int maxProfit(int[] prices) {
        int lenPrices = prices.length;

        if(lenPrices ==1) return 0;


        int max = 0;
        int left = 0;
        int profit = 0;

        for(int i = 1; i < lenPrices;i++){

            profit = prices[i] - prices[left];
            max = Math.max(profit, max);

            if(prices[i] < prices[left]){
                left = i;
            }

        }

        return max;
    
    }
}
