package com.oz.twentyfour.may.thirthw;

import com.oz.challenges.model.Tree;

import java.util.Objects;

/**
 * Given a binary tree root, create a boolean function that checks if it's a binary search tree. Note that in a binary
 * search tree, every node must be strictly greater than all nodes on its left subtree, and strictly smaller than all
 * nodes on its right subtree.
 *
 * Example 1:
 * Input: root =
 *            16
 *          /   \
 *        8      22
 *      /   \
 *     3    11
 *   /  \
 *  1    6
 * Output: true
 * Explanation: every node is strictly greater than all nodes on its left subtree, and strictly smaller than all nodes
 * on its right subtree
 *
 * Example 2:
 * Input: root =
 *            16
 *          /   \
 *        8      22
 *      /   \
 *     3    19
 *   /  \
 *  1    6
 * Output: false
 * Explanation: it's not a valid binary search tree because 16 is smaller than 19
 */
public class ValidBinarySearchTree {

  public boolean isBst(Tree root) {
    if (Objects.isNull(root)) {
      return false;
    }

    final int rootValue = root.data;
    return this.validateLeft(root.left, rootValue) && this.validateRight(root.right, rootValue);
  }

  private boolean validateLeft(Tree node, int rootValue) {
    boolean isLeftOk = Objects.isNull(node.left);
    if (Objects.nonNull(node.left)) {
      isLeftOk = node.left.data < node.data && node.left.data < rootValue;
    }

    boolean isRightOk = Objects.isNull(node.right);
    if (Objects.nonNull(node.right)) {
      isRightOk = node.right.data > node.data && node.right.data < rootValue;
    }

    if (isLeftOk && isRightOk) {
      return Objects.nonNull(node.left) ? this.validateLeft(node.left, rootValue) : true
          && Objects.nonNull(node.right) ? this.validateLeft(node.right, rootValue) : true;
    } else {
      return false;
    }
  }

  private boolean validateRight(Tree node, int rootValue) {
    boolean isLeftOk = Objects.isNull(node.left);
    if (Objects.nonNull(node.left)) {
      isLeftOk = node.left.data < node.data && node.left.data > rootValue;
    }

    boolean isRightOk = Objects.isNull(node.right);
    if (Objects.nonNull(node.right)) {
      isRightOk = node.right.data > node.data && node.right.data > rootValue;
    }

    if (isLeftOk && isRightOk) {
      return Objects.nonNull(node.left) ? this.validateRight(node.left, rootValue) : true
          && Objects.nonNull(node.right) ? this.validateRight(node.right, rootValue) : true;
    } else {
      return false;
    }
  }

  ////////////// Solution 1

  private boolean isBst(Tree root, int min, int max) {
    if (root == null) {
      return true;
    } else if (root.data <= min || root.data >= max) {
      return false;
    } else {
      return this.isBst(root.left, min, root.data) && this.isBst(root.right, root.data, max);
    }
  }

  public boolean isBstTutorVersionOne(Tree root) {
    return this.isBst(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
  }

  /////////// Solution 2

  public boolean isBstTutorVersionTwo(Tree root) {
    int[] precedent = new int[]{ Integer.MIN_VALUE };
    return this.isBstRec(root, precedent);
  }

  private boolean isBstRec(Tree root, int[] precedent) {
    if (root == null) {
      return true;
    }
    if (!isBstRec(root.left, precedent)) {
      return false;
    }
    if (root.data <= precedent[0]) {
      return false;
    } else {
      precedent[0] = root.data;
    }
    if (!isBstRec(root.right, precedent)) {
      return false;
    }
    return true;
  }
}
