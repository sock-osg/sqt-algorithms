package com.oz.twentyfour.jan;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SingleNumber {

  // TC: o(n), SC: o(n)
  public int solve(List<Integer> integersList) {
    if (integersList.size() == 1) {
      return integersList.getFirst();
    }

    Set<Integer> resultSet = new HashSet<>();

    for (int currInt : integersList) {
      if (resultSet.contains(currInt)) {
        resultSet.remove(currInt);
      } else {
        resultSet.add(currInt);
      }
    }

    return resultSet.iterator().next();
  }

  // TC: o(n), SC: o(1)
  public int solveEnhanced(final List<Integer> integersList) {
    return integersList.stream().reduce(0, (a, b) -> a ^ b);
  }
}
