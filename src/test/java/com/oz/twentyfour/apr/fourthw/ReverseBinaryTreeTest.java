package com.oz.twentyfour.apr.fourthw;

import static com.oz.twentyfour.apr.fourthw.ReverseBinaryTree.Tree;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * Given a binary tree of integers root, create a function that reverses it left to right in-place.
 * Example 1:
 * Input:
 *                1
 *              /   \
 *            2      3
 *           / \    / \
 *          4   5  6   7
 * Output: [1, 3, 2, 7, 6, 5, 4]
 *                1
 *              /   \
 *            3      2
 *           / \    / \
 *          7   6  5   4
 *
 * Example 2:
 * Input:
 *                6
 *             /     \
 *            8      13
 *          /  \    /
 *         2    1  5
 *        /
 *       7
 * Output: [6, 13, 8, null, 5, 1, 2, null, null, null, null, null, 7]
 *                6
 *             /     \
 *            13      8
 *             \    /  \
 *             5   1    2
 *                       \
 *                        7
 */
class ReverseBinaryTreeTest {
  
  private final ReverseBinaryTree reverseBinaryTree = new ReverseBinaryTree();
  private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
  private final PrintStream originalOut = System.out;

  @BeforeEach
  void setUpBeforeClass() {
    System.setOut(new PrintStream(this.outContent));
  }

  @AfterEach
  void tearDownAfterClass() {
    System.setOut(this.originalOut);
  }

  @Test
  void reverseBinaryTreeExampleOneTest() {
    Tree root = new Tree(1,
        new Tree(2,
            new Tree(4), new Tree(5)),
        new Tree(3,
            new Tree(6), new Tree(7))
    );

    System.out.print("Reversed: ");
    this.reverseBinaryTree.reverseTree(root);

    Assertions.assertEquals("Reversed: 1 3 2 7 6 5 4 ", outContent.toString());
  }

  @Test
  void reverseBinaryTreeExampleTwoTest() {
    Tree root = new Tree(6,
        new Tree(8,
            new Tree(2,
                new Tree(7), null),
            new Tree(1)),
        new Tree(13,
            new Tree(5), null)
    );

    System.out.print("Reversed: ");
    this.reverseBinaryTree.reverseTree(root);

    Assertions.assertEquals("Reversed: 6 13 8 5 1 2 7 ", outContent.toString());
  }
}
