package com.oz.twentyfour.may.firstw;

public class PalindromeListNodes {

  public boolean isPalindromeListTutorLoopVersion(LinkedList list) {
    int length = 0;
    Node temp = list.head;
    while (temp != null) {
      length++;
      temp = temp.next;
    }
    Node left = list.head;
    for (int i = 0; i < length / 2; i++) {
      Node right = list.head;
      for (int j = 0; j < length - i - 1; j++) {
        right = right.next;
      }
      if (left.data != right.data) {
        return false;
      }
      left = left.next;
    }
    return true;
  }

  private Node reverseList(Node head) {
    Node previous = null;
    Node current = head;
    while (current != null) {
      Node next = current.next;
      current.next = previous;
      previous = current;
      current = next;
    }
    return previous;
  }

  public boolean isPalindromeListTutorOptimalVersion(LinkedList list) {
    Node slow = list.head;
    Node fast = list.head;
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }
    slow = this.reverseList(slow);
    Node head = list.head;
    while (slow != null) {
      if (slow.data != head.data) {
        return false;
      }
      slow = slow.next;
      head = head.next;
    }
    return true;
  }

  static class Node {

    int data;
    Node next;

    Node(int data) {
      this.data = data;
      this.next = null;
    }

    Node(int data, Node next) {
      this.data = data;
      this.next = next;
    }
  }

  static class LinkedList {

    Node head;

    LinkedList() {
      this.head = null;
    }

    LinkedList(Node head) {
      this.head = head;
    }
  }
}
