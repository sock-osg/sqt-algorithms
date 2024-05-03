package com.oz.twentyfour.may.firstw;

public class ReverseLinkedList {

  static class Node {

    int data;
    Node next;

    Node(int data) {
      this.data = data; this.next = null;
    }

    Node(int data, Node next) {
      this.data = data; this.next = next;
    }
  }

  static class LinkedList {

    Node head;

    LinkedList(Node head) {
      this.head = head;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      Node cur = head;
      while (cur != null) {
        sb.append(cur.data).append("->");
        cur = cur.next;
      }

      return sb.toString();
    }
  }

  public void reverseList(LinkedList list) {
    if (list == null) {
      return;
    }

    Node prev = null;
    Node current = list.head;
    while (current != null) {
      Node next = current.next;
      current.next = prev;
      prev = current;
      current = next;
    }

    list.head = prev;
  }

  public void reverseListTutorVersion(LinkedList list) {
    list.head = reverseNodes(list.head);
  }

  private Node reverseNodes(Node node) {
    if (node == null || node.next == null) {
      return node;
    }

    Node reversed = reverseNodes(node.next);
    node.next.next = node;
    node.next = null;
    return reversed;
  }
}
