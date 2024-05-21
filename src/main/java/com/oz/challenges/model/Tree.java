package com.oz.challenges.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class Tree {

  public int data;
  public Tree left;
  public Tree right;

  public Tree(int data) {
    this.data = data;
    this.left = null;
    this.right = null;
  }
}
