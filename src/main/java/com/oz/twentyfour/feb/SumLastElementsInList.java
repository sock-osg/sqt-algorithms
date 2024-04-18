package com.oz.twentyfour.feb;

import java.util.ArrayList;
import java.util.List;

public class SumLastElementsInList {

  private final int size;
  private final List<Integer> items;

  private int currentSum = 0;

  public SumLastElementsInList(int size) {
    this.size = size;
    this.items = new ArrayList<>();
  }

  public void add(final int newElement) {
    if (this.items.size() < this.size) {
      this.currentSum += newElement;
    } else {
      final int previous = this.items.get(this.items.size() - this.size);
      this.currentSum = (this.currentSum - previous) + newElement;
    }

    this.items.add(newElement);
  }

  public int calculate() {
    return this.currentSum;
  }
}
