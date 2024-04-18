package com.oz.twentyfour.mar.secondw;

public class FindMinimumInRotatedSortedArray {

  public int findMinimum(int[] rotatedSortedArray) {
    if (rotatedSortedArray.length == 1) {
      return rotatedSortedArray[0];
    }
    if (rotatedSortedArray.length == 2) {
      return Math.min(rotatedSortedArray[0], rotatedSortedArray[1]);
    }

    int leftIndex = 0;
    int rightIndex = rotatedSortedArray.length - 1;
    if (rotatedSortedArray[leftIndex] < rotatedSortedArray[rightIndex]) { // The whole array is sorted
      return rotatedSortedArray[leftIndex];
    }

    while (leftIndex < rightIndex) {
      int midIndex = (leftIndex + rightIndex) / 2;

      // the array is decreasing at mid + 1
      if (rotatedSortedArray[midIndex] > rotatedSortedArray[midIndex + 1]) {
        return rotatedSortedArray[midIndex + 1];
      }
      // the array is decreasing at mid
      if (rotatedSortedArray[midIndex - 1] > rotatedSortedArray[midIndex]) {
        return rotatedSortedArray[midIndex];
      }

      // Discard sorted part
      if (rotatedSortedArray[leftIndex] < rotatedSortedArray[rightIndex]) {
        leftIndex = midIndex + 1;
      } else {
        rightIndex = midIndex - 1;
      }
    }

    return 0;
  }
}
