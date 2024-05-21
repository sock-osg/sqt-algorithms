package com.oz.twentyfour.may.thirthw;

import com.oz.challenges.model.Tree;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ValidBinarySearchTreeTest {

  private final ValidBinarySearchTree validBinarySearchTree = new ValidBinarySearchTree();
  private final Tree validBstTree = new Tree(16,
      new Tree(8,
          new Tree(3,
              new Tree(1),
              new Tree(6)),
          new Tree(11)),
      new Tree(22));
  private final Tree invalidBstTree = new Tree(16,
      new Tree(8,
          new Tree(3,
              new Tree(1),
              new Tree(6)),
          new Tree(19)),
      new Tree(22));

  @Test
  void isValidBinarySearchTestOne() {
    Assertions.assertTrue(this.validBinarySearchTree.isBst(validBstTree));
    Assertions.assertFalse(this.validBinarySearchTree.isBst(invalidBstTree));
  }

  @Test
  void isValidBinarySearchTutorVersionOneTest() {
    Assertions.assertTrue(this.validBinarySearchTree.isBstTutorVersionOne(this.validBstTree));
  }

  @Test
  void isValidBinarySearchTutorVersionTwoTest() {
    Assertions.assertTrue(this.validBinarySearchTree.isBstTutorVersionTwo(this.validBstTree));
  }
}
