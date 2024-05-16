package com.oz.challenges.utils;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
public class LinkedList {

  public Node head;

  @ToString
  @NoArgsConstructor
  @AllArgsConstructor
  public static class Node {

    public int data;
    public Node next;
  }
}
