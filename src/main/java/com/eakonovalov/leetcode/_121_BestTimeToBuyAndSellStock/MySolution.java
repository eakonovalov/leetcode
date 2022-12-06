package com.eakonovalov.leetcode._121_BestTimeToBuyAndSellStock;

public class MySolution implements Solution {

    public int maxProfit(int[] prices) {
        int lo = prices[0];
        int hi = 0;
        int profit = 0;
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > lo && prices[i] > hi) {
                hi = prices[i];
            }
            if (profit < hi - lo) {
                profit = hi - lo;
            }
            if (profit > maxProfit) {
                maxProfit = profit;
            }
            if (prices[i] < lo) {
                lo = prices[i];
                hi = 0;
                profit = 0;
            }
        }

        return maxProfit;
    }
}
