package com.oz.twentyfour.mar.secondw;

public class BestTimeToBuyAndSellStock {

  public int evaluate(int[] prices) {
    if (prices.length == 0) {
      return 0;
    }

    var profit = 0;
    var indexLeft = 0;
    for (int index = 1; index < prices.length; index++) {
      profit = Math.max(profit, prices[index] - prices[indexLeft]);

      if (prices[index] < prices[indexLeft]) {
        indexLeft = index;
      }
    }

    return profit;
  }
}
