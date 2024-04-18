package com.oz.twentyfour.feb;

public class Pow {

  public double pow(double base, double exponent) {
    if (exponent == 0) {
      return 1.0;
    }

    double exp = Math.abs(exponent);
    double result = 1;
    while (exp > 0.0d) {
      if (exp % 2 == 0) { // if exp is even
        base *= base;
        exp /= 2;
      } else {
        result *= base;
        exp -= 1;
      }
    }

    return exponent < 0 ? 1.0d / result : result;
  }
}
