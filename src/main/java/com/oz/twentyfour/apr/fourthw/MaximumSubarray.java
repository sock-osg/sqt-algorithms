package com.oz.twentyfour.apr.fourthw;

public class MaximumSubarray {

  public int maximumSubarray(int[] arr) {
    int globalSum = Integer.MIN_VALUE;
    int localSum = arr[0];
    for (int index = 1; index < arr.length; index++) {
      if (localSum + arr[index] > 0) {
        localSum += arr[index];
      } else {
        globalSum = Math.max(globalSum, localSum);
        localSum = arr[index];
      }
    }

    return Math.max(globalSum, localSum);
  }

  public int maximumSubarrayTutorVersion(int[] arr){
    int globalSum = Integer.MIN_VALUE;
    int localSum = 0;

    for (int element : arr) {
      localSum = Math.max(element, localSum + element);
      globalSum = Math.max(globalSum, localSum);
    }

    return globalSum;
  }
}
