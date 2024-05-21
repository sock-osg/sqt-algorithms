package com.oz.twentyfour.may.thirthw;

/**
 * Given a matrix of integers matrix of size n*m, where each element matrix[i][j] represents the cost of passing from
 * that cell, create a function that returns the cost of the minimum cost path to go from the top left cell to the right
 * bottom cell, knowing that you can only move to the right or to the bottom.
 *
 * Example 1:
 * Input: matrix = [[3, 12, 4, 7, 10], [6, 8, 15, 11, 4], [19, 5, 14, 32, 21], [1, 20, 2, 9, 7]]
 * Output: 54
 * Explanation: 3 + 6 + 8 + 5 + 14 + 2 + 9 + 7 = 54
 */
public class MinimumCostPath {

  public int minimumCostPath(int[][] matrix) {
    int coordX = 0;
    int coordY = 0;

    int accumulator = matrix[0][0];
    while (coordX < matrix.length && coordY < matrix[0].length) {
      int rightValue = coordY + 1 >= matrix[0].length ? Integer.MAX_VALUE : matrix[coordX][coordY + 1];
      int bottomValue = coordX + 1 >= matrix.length ? Integer.MAX_VALUE : matrix[coordX + 1][coordY];

      if (rightValue == Integer.MAX_VALUE && bottomValue == Integer.MAX_VALUE) {
        break;
      }

      if (rightValue < bottomValue) { // Validate left
        accumulator += rightValue;
        coordY = coordY + 1 >= matrix[0].length ? coordY : coordY + 1;
      } else {
        accumulator += bottomValue;
        coordX = coordX + 1 >= matrix.length ? coordX : coordX + 1;
      }
    }

    return accumulator;
  }

  private int minimumCostPath(int[][] matrix, int i, int j) {
    int n = matrix.length;
    int m = matrix[0].length;
    if (i == n - 1 && j == m - 1) {
      return matrix[i][j];
    } else if (i == n - 1) {
      return matrix[i][j] + minimumCostPath(matrix, i, j + 1);
    } else if (j == m - 1) {
      return matrix[i][j] + minimumCostPath(matrix, i + 1, j);
    } else {
      return matrix[i][j] + Math.min(minimumCostPath(matrix, i + 1, j), minimumCostPath(matrix, i, j + 1));
    }
  }

  public int minimumCostPathTutorVersionOne(int[][] matrix) {
    return minimumCostPath(matrix, 0, 0);
  }

  public int minimumCostPathTutorVersionTwo(int[][] matrix) {
    int n = matrix.length;
    int m = matrix[0].length;
    int[][] costs = new int[n][m];
    costs[0][0] = matrix[0][0];
    for (int i = 1; i < m; i++) {
      costs[0][i] = costs[0][i - 1] + matrix[0][i];
    }
    for (int i = 1; i < n; i++) {
      costs[i][0] = costs[i - 1][0] + matrix[i][0];
    }
    for (int i = 1; i < n; i++) {
      for (int j = 1; j < m; j++) {
        costs[i][j] = Math.min(costs[i - 1][j], costs[i][j - 1]) + matrix[i][j];
      }
    }
    return costs[n-1][m-1];
  }
}
