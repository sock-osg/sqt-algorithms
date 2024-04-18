package com.oz.twentyfour.mar.thirthw;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 *
 */
class BestTimeToBuyAndSellStockIITest {

  private final BestTimeToBuyAndSellStockII bestTimeToBuyAndSellStockII = new BestTimeToBuyAndSellStockII();

  @Test
  void test() {
    Assertions.assertEquals(7, this.bestTimeToBuyAndSellStockII.maxProfit(new int[] { 7, 1, 5, 3, 6, 4 }));
    Assertions.assertEquals(5, this.bestTimeToBuyAndSellStockII.maxProfit(new int[] { 1, 2, 3, 4, 5, 6 }));
  }
}
