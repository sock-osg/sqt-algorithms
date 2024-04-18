package com.oz.twentyfour.apr.thirthw;

import java.util.ArrayList;
import java.util.List;

public class SequentialDigits {

  public List<Integer> sequentialDigits(int low, int high) {
    List<Integer> result = new ArrayList<>();
    int length = 0;
    int initialDigit = low;
    while (initialDigit > 0) {
      length++;
      initialDigit /= 10;
    }

    int nextSequence = this.calculateSequence(initialDigit, length);
    while (nextSequence >= low && nextSequence <= high) {
      result.add(nextSequence);

      nextSequence = this.calculateSequence(initialDigit, length);
    }

    return result;
  }

  private int calculateSequence(int initialDigit, int length) {
    return 0;
  }

  public List<Integer> sequentialDigitsApuVersion(int low, int high) {
    String digits = "123456789";

    List<Integer> result = new ArrayList<>();
    for (int length = 1; length <= 9; length++) {
      for (int i = 0; i + length <= digits.length(); i++) {
        String substring = digits.substring(i, i + length);
        int value = Integer.parseInt(substring);

        if (value >= low && value <= high) {
          result.add(value);
        }
      }
    }

    return result;
  }
}
