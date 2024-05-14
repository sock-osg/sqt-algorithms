package com.oz.twentyfour.may.thirthw;

import static com.oz.twentyfour.may.thirthw.TreeBreadthFirstSearch.Tree;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class TreeBreadthFirstSearchTest {

  private final TreeBreadthFirstSearch treeBreadthFirstSearch = new TreeBreadthFirstSearch();
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
  void testBreadthFirstSearch() {
    Tree root = new Tree(5,
        new Tree(10,
            new Tree(4,
                null,
                new Tree(8)),
            new Tree(6,
                new Tree(9),
                new Tree(1))),
        new Tree(3,
            null,
            new Tree(7,
                new Tree(2),
                null))
    );

    this.treeBreadthFirstSearch.bfs(root);

    Assertions.assertEquals("5 10 3 4 6 7 8 9 1 2", outContent.toString().trim());
  }
}
