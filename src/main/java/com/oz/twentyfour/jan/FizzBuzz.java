package com.oz.twentyfour.jan;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

  public List<String> solve(int number) {
    final List<String> answer = new ArrayList<>();

    for (int index = 1; index <= number; index++) {
      StringBuilder result = new StringBuilder();

      if (index % 3 == 0) {
        result.append("Fizz");
      }

      if (index % 5 == 0) {
        result.append("Buzz");
      }

      answer.add(result.isEmpty() ? String.valueOf(index) : result.toString());
    }

    return answer;
  }
}
