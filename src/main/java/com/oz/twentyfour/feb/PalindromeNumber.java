package com.oz.twentyfour.feb;

public class PalindromeNumber {

  /**
   * TC: O(log x), SC: O(1)
   * @param inputNumber
   * @return
   */
  public boolean solve(int inputNumber) {
    int halfReverse = 0;

    while (inputNumber > halfReverse) {
      int lastDigit = inputNumber % 10;
      halfReverse = (halfReverse * 10) + lastDigit;

      inputNumber = inputNumber / 10;
    }

    return (inputNumber == halfReverse) || (inputNumber == halfReverse / 10);
  }
}
