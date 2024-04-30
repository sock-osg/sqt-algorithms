package com.oz.twentyfour.apr.fourthw;

import java.util.LinkedList;
import java.util.Queue;

public class ReverseBinaryTree {

  static class Tree{
    int data;
    Tree left;
    Tree right;
    Tree(int data){this.data = data; this.left = null; this.right = null;}
    Tree(int data, Tree left, Tree right){this.data = data; this.left = left; this.right = right;}
  }

  public void reverseTree(Tree root) {
    Queue<Tree> levelTrees = new LinkedList<>();

    System.out.printf("%s ", root.data);
    levelTrees.add(root.right);
    levelTrees.add(root.left);

    while (!levelTrees.isEmpty()) {
      Tree currentLevel = levelTrees.poll();
      System.out.printf("%s ", currentLevel.data);

      if (currentLevel.right != null) {
        levelTrees.add(currentLevel.right);
      }
      if (currentLevel.left != null) {
        levelTrees.add(currentLevel.left);
      }
    }
  }

  // MY-BAD: I thought I should print it instead of re-order the object itself.
  public void reverseTreeTutorVersion(Tree root) {
    if(root == null) return;
    Tree temp = root.left;
    root.left = root.right;
    root.right = temp;
    reverseTree(root.left);
    reverseTree(root.right);
  }
}
