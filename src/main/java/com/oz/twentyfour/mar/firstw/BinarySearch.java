package com.oz.twentyfour.mar.firstw;

public class BinarySearch {

  public int getIndexOf(int[] orderedNumbers, int targetNumber) {
    int arraysLength = orderedNumbers.length / 2;

    int leftArrayStartIndex = 0;
    int leftArrayEndIndex = arraysLength - 1;
    int rightArrayStartIndex = leftArrayEndIndex + 1;
    int rightArrayEndIndex = orderedNumbers.length - 1;

    while (arraysLength != 1) {
      if (targetNumber <= orderedNumbers[leftArrayEndIndex]) { // target could be in left side
        // RE-DEFINING EXTERNAL RANGES
        // leftArrayStartIndex is already pointing to left init index
        rightArrayEndIndex = leftArrayEndIndex;
      } else if (targetNumber <= orderedNumbers[rightArrayEndIndex]) { // target could be in left side
        // RE-DEFINING EXTERNAL RANGES
        leftArrayStartIndex = rightArrayStartIndex;
        // rightArrayEndIndex is already pointing to right end index
      }

      arraysLength /= 2; // Divide to recalculate internal ranges

      leftArrayEndIndex = leftArrayStartIndex + (arraysLength - 1);
      rightArrayStartIndex = leftArrayEndIndex + 1;

    }

    if (rightArrayEndIndex - leftArrayStartIndex <= 3) {
      for (int index = leftArrayStartIndex; index <= rightArrayEndIndex; index++) {
        if (orderedNumbers[index] == targetNumber) {
          return index;
        }
      }
    }

    return -1;
  }

  public int getIndexOfApuVersion(int[] nums, int target) {
    int left = 0;
    int right = nums.length - 1;
    while (left <= right) {
      int mid = (left + right) / 2;
      if (nums[mid] == target) {
        return mid;
      }
      if (target < nums[mid]) {
        right = mid - 1;
      } else {
        left = mid + 1;
      }
    }
    return -1;
  }
}
