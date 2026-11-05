class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            int profitIfSoldToday = prices[i] - minPrice;

            if (profitIfSoldToday > maxProfit) {
                maxProfit = profitIfSoldToday;
            }

            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }
        }

        return maxProfit;
    }
}