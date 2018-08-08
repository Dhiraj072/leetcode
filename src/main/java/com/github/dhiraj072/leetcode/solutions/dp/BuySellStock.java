package com.github.dhiraj072.leetcode.solutions.dp;

class BuySellStock {

  int maxProfit(int[] prices) {

    if (prices.length == 0 || prices.length == 1) {

      return 0;
    }

    int max_profit = 0;
    int[] maxPriceOnOrAfter = new int[prices.length];
    maxPriceOnOrAfter[prices.length - 1] = prices[prices.length - 1];

    for (int i = prices.length - 2; i >= 0; --i) {

      maxPriceOnOrAfter[i] = Math.max(prices[i], maxPriceOnOrAfter[i + 1]);
    }

    for (int i = 0; i < prices.length - 1; ++i) {

      max_profit = Math.max(max_profit, maxPriceOnOrAfter[i + 1] - prices[i]);
    }

    return max_profit;
  }

}
