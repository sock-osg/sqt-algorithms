package com.oz.twentyfour.apr.fourthw;

public class TreeDepthFirstSearch {

  record Tree(int data, Tree left, Tree right) {

    public Tree(int data) {
      this(data, null, null);
    }
  }

  void dfsPreorder(Tree root) {
    if (root == null) {
      return;
    }

    System.out.print(root.data + " ");
    dfsPreorder(root.left);
    dfsPreorder(root.right);
  }

  void dfsInorder(Tree root) {
    if (root == null) {
      return;
    }
    dfsInorder(root.left);
    System.out.print(root.data + " ");
    dfsInorder(root.right);
  }

  void dfsPostorder(Tree root) {
    if (root == null) {
      return;
    }
    dfsPostorder(root.left);
    dfsPostorder(root.right);
    System.out.print(root.data + " ");
  }
}
