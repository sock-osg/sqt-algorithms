package com.oz.twentyfour.mar.firstw;

public class IntegerToEnglishWords {

  private static final String[] LESS_THAN_20 = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
  private static final String[] TENS = {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
  private static final String[] THOUSANDS = {"", "Thousand", "Million", "Billion"};

  public String numberToWords(int number) {
    if (number == 0) {
      return "Zero";
    }

    int i = 0;
    StringBuilder words = new StringBuilder();
    while (number > 0) {
      if (number % 1000 != 0) {
        words.insert(0, this.helper(number % 1000) + THOUSANDS[i] + " ");
      }

      number /= 1000;
      i++;
    }

    return words.toString().trim();
  }

  private String helper(int num) {
    if (num == 0) {
      return "";
    } else if (num < 20) {
      return LESS_THAN_20[num] + " ";
    } else if (num < 100) {
      return TENS[num / 10] + " " + helper(num % 10);
    } else {
      return LESS_THAN_20[num / 100] + " Hundred " + helper(num % 100);
    }
  }
}
