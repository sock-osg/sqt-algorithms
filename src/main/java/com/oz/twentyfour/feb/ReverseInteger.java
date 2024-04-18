package com.oz.twentyfour.feb;

public class ReverseInteger {

  private static final int MAX_ALLOWED = Integer.MAX_VALUE / 10;

  public int reverseInteger(int number) {
    final boolean isNegative = number < 0;
    number = isNegative ? -number : number;

    int reverse = 0;
    while (number != 0) {
      if (reverse >= MAX_ALLOWED) {
        return 0;
      }

      reverse = (reverse * 10) + (number % 10);
      number = number / 10;
    }

    return isNegative ? -reverse : reverse;
  }
}
