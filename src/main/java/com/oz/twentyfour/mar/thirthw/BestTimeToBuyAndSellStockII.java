package com.oz.twentyfour.mar.thirthw;

public class BestTimeToBuyAndSellStockII {

  public int maxProfit(int[] dailyPrices) {
    int profit = 0;
    for (int index = 0; index < dailyPrices.length - 1; index++) {
      int currentProfit = dailyPrices[index + 1] - dailyPrices[index];
      if (currentProfit > 0) {
        profit += currentProfit;
      }
    }

    return profit;
  }
}
