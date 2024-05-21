package com.oz.twentyfour.may.thirthw;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MinimumCostPathTest {

  private final MinimumCostPath minimumCostPath = new MinimumCostPath();

  @Test
  void getMinimumCostTest() {
    final int[][] matrix = new int[][] {
        { 3, 12, 4, 7, 10 },
        { 6, 8, 15, 11, 4 },
        { 19, 5, 14, 32, 21 },
        { 1, 20, 2, 9, 7 }
    };
    Assertions.assertEquals(54, this.minimumCostPath.minimumCostPath(matrix));
  }

  @Test
  void getMinimumCostLongMatrixTest() {
    final int[][] matrix = new int[][] {
        {86, 42, 0, 79, 62, 65, 22, 97, 30},
        {28, 55, 34, 5, 11, 81, 0, 14, 58},
        {71, 35, 77, 88, 49, 79, 12, 8, 28},
        {35, 74, 86, 33, 37, 68, 88, 54, 98},
        {28, 97, 20, 91, 1, 2, 62, 89, 74},
        {15, 28, 21, 36, 75, 75, 60, 48, 89},
        {85, 25, 16, 77, 83, 24, 71, 65, 27},
        {94, 52, 88, 63, 84, 41, 53, 32, 70},
        {36, 4, 4, 62, 21, 63, 80, 74, 79},
        {85, 19, 34, 92, 15, 25, 97, 49, 100}
    };
    Assertions.assertEquals(715, this.minimumCostPath.minimumCostPath(matrix));
  }

  @Test
  void getMinimumCostLongMatrixTutorVersionOneTest() {
    final int[][] matrix = new int[][] {
        {86, 42, 0, 79, 62, 65, 22, 97, 30},
        {28, 55, 34, 5, 11, 81, 0, 14, 58},
        {71, 35, 77, 88, 49, 79, 12, 8, 28},
        {35, 74, 86, 33, 37, 68, 88, 54, 98},
        {28, 97, 20, 91, 1, 2, 62, 89, 74},
        {15, 28, 21, 36, 75, 75, 60, 48, 89},
        {85, 25, 16, 77, 83, 24, 71, 65, 27},
        {94, 52, 88, 63, 84, 41, 53, 32, 70},
        {36, 4, 4, 62, 21, 63, 80, 74, 79},
        {85, 19, 34, 92, 15, 25, 97, 49, 100}
    };
    Assertions.assertEquals(715, this.minimumCostPath.minimumCostPathTutorVersionOne(matrix));
  }
}
