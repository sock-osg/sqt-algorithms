package com.oz.twentyfour.may.thirthw;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Given a binary tree root, create a function that prints its nodes in level order (level by level).
 *
 * Example 1:
 * Input:
 *             5
 *           /   \
 *         10     3
 *      /     \    \
 *     4       6    7
 *      \     / \    \
 *       8   9   1    2
 * Output: 5 10 3 4 6 7 8 9 1 2
 */
public class TreeBreadthFirstSearch {

  static class Tree {
    int data;
    Tree left;
    Tree right;
    Tree(int data){this.data = data; this.left = null; this.right = null;}
    Tree(int data, Tree left, Tree right){this.data = data; this.left = left; this.right = right;}
  }

  public void bfs(Tree root) {
    Queue<Tree> levelTrees = new LinkedList<>();

    System.out.printf("%s ", root.data);
    levelTrees.add(root.left);
    levelTrees.add(root.right);

    while (!levelTrees.isEmpty()) {
      Tree currentLevel = levelTrees.poll();
      System.out.printf("%s ", currentLevel.data);

      if (currentLevel.left != null) {
        levelTrees.add(currentLevel.left);
      }
      if (currentLevel.right != null) {
        levelTrees.add(currentLevel.right);
      }
    }
  }
}
