package com.oz.twentyfour.may.firstw;

public class PeakFinding {

  public int findPeak(int[] arr) {
    int peakIndex = 0;

    for (int index = 0; index < arr.length; index++) {
      int left = (index == 0) ? Integer.MIN_VALUE : arr[index - 1];
      int current = arr[index];
      int right = (index == arr.length - 1) ? Integer.MIN_VALUE : arr[index + 1];

      if (left <= current && current >= right) {
        peakIndex = index;
      }
    }

    return peakIndex;
  }

  private int findPeak(int[] arr, int left, int right) {
    if (left >= right) {
      return left;
    }

    int mid = (left + right) / 2;

    if (arr[mid] < arr[mid+1]) {
      return this.findPeak(arr, mid + 1, right);
    } else {
      return this.findPeak(arr, left, mid);
    }
  }

  public int findPeakTutorVersion(int[] arr) {
    return findPeak(arr, 0, arr.length-1);
  }

  public int findPeakDivideAndConquerVersion(int[] arr) {
    int left = 0;
    int right = arr.length - 1;

    while (left < right) {
      int mid = (left + right) / 2;
      if (arr[mid] < arr[mid + 1]) {
        left = mid + 1;
      }  else {
        right = mid;
      }
    }

    return left;
  }
}
