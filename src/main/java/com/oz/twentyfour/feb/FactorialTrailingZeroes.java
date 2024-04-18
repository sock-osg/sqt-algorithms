package com.oz.twentyfour.feb;

/**
 * More detailed explanation (canonical decomposition and successive divisions)
 * <a href="https://www.youtube.com/watch?v=AAL2lu_Ov-8&t=1574s">here</a>
 */
public class FactorialTrailingZeroes {

  /**
   * TC: O(log(5) n), SC: O(1)
   */
  public int solve(int number) {
    int totalZeroes = 0;

    if (number < 5) {
      return totalZeroes;
    }

    while (number > 0) {
      number = number / 5;
      totalZeroes += number;
    }

    return totalZeroes;
  }
}
