package com.oz.twentyfour.apr.fourthw;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static com.oz.twentyfour.apr.fourthw.TreeDepthFirstSearch.Tree;

/**
 * Given a binary tree of integers root, create 3 functions to print the tree nodes in preorder, inorder, and postorder
 * traversal.
 *    Preorder: print the root value, then print the left subtree, then print the right subtree.
 *    Inorder: print the left subtree, then print the root value, then print the right subtree.
 *    Postorder: print the left subtree, then print the right subtree, then print the root value.
 *
 * Example 1:
 * Input: root =  1
 *              /   \
 *            2      3
 *           / \    / \
 *          4   5  6   7
 * Output:
 *    Preorder: 1 2 4 5 3 6 7
 *    Inorder: 4 2 5 1 6 3 7
 *    Postorder: 4 5 2 6 7 3 1
 *
 * Example 2:
 * Input: root =                   6
 *                              /     \
 *                             8      13
 *                           /  \    /
 *                          2    1  5
 *                         /
 *                        7
 * Output:
 *    Preorder: 6 8 2 7 1 13 5
 *    Inorder: 7 2 8 1 6 5 13
 *    Postorder: 7 2 1 8 5 13 6
 */
class TreeDepthFirstSearchTest {

  private final TreeDepthFirstSearch depthFirstSearch = new TreeDepthFirstSearch();
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
  void exampleOneTest() {
    Tree root = new Tree(1,
        new Tree(2,
            new Tree(4), new Tree(5)),
        new Tree(3,
            new Tree(6), new Tree(7))
    );

    System.out.print("Preorder: ");
    this.depthFirstSearch.dfsPreorder(root);
    System.out.print("Inorder: ");
    this.depthFirstSearch.dfsInorder(root);
    System.out.print("Postorder: ");
    this.depthFirstSearch.dfsPostorder(root);

    Assertions.assertEquals("Preorder: 1 2 4 5 3 6 7 Inorder: 4 2 5 1 6 3 7 Postorder: 4 5 2 6 7 3 1 ", outContent.toString());
  }

  @Test
  void exampleTwoTest() {
    Tree root = new Tree(6,
        new Tree(8,
            new Tree(2,
                new Tree(7), null),
            new Tree(1)),
        new Tree(13,
            new Tree(5), null)
    );

    System.out.print("Preorder: ");
    this.depthFirstSearch.dfsPreorder(root);
    System.out.print("Inorder: ");
    this.depthFirstSearch.dfsInorder(root);
    System.out.print("Postorder: ");
    this.depthFirstSearch.dfsPostorder(root);

    Assertions.assertEquals("Preorder: 6 8 2 7 1 13 5 Inorder: 7 2 8 1 6 5 13 Postorder: 7 2 1 8 5 13 6 ", outContent.toString());
  }
}
