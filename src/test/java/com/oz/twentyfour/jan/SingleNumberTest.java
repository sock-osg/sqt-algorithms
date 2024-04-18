package com.oz.twentyfour.jan;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * Given a non-empty array of integers nums, every element appears twice except for one. Find that single one. You must
 * implement a solution with a linear runtime complexity and use only constant extra space.
 * <p>
 * Example 1:
 *  Input: nums = [2,2,1]
 *  Output: 1
 * <p>
 * Example 2:
 *  Input: nums = [4,1,2,1,2]
 *  Output: 4
 * <p>
 * Example 3:
 * Input: nums = [1]
 * Output: 1
 */
class SingleNumberTest {

  private final SingleNumber singleNumber = new SingleNumber();

  @Test
  void solveForOneTest() {
    int repeatedNumber = this.singleNumber.solve(List.of(2, 2, 1));
    int repeatedNumberEnhanced = this.singleNumber.solveEnhanced(List.of(2, 2, 1));

    Assertions.assertEquals(1, repeatedNumber);
    Assertions.assertEquals(1, repeatedNumberEnhanced);
  }

  @Test
  void solveForFourTest() {
    int repeatedNumber = this.singleNumber.solve(List.of(4,1,2,1,2));
    int repeatedNumberEnhanced = this.singleNumber.solveEnhanced(List.of(4,1,2,1,2));

    Assertions.assertEquals(4, repeatedNumber);
    Assertions.assertEquals(4, repeatedNumberEnhanced);
  }

  @Test
  void solveForOnlyOneTest() {
    int repeatedNumber = this.singleNumber.solve(List.of(1));
    int repeatedNumberEnhanced = this.singleNumber.solveEnhanced(List.of(1));

    Assertions.assertEquals(1, repeatedNumber);
    Assertions.assertEquals(1, repeatedNumberEnhanced);
  }

  @Test
  void solveForZeroInTheListTest() {
    List<Integer> integersList = List.of(1, 0, 5, 5, 0);
    int repeatedNumber = this.singleNumber.solve(integersList);
    int repeatedNumberEnhanced = this.singleNumber.solveEnhanced(integersList);

    Assertions.assertEquals(1, repeatedNumber);
    Assertions.assertEquals(1, repeatedNumberEnhanced);
  }
}
