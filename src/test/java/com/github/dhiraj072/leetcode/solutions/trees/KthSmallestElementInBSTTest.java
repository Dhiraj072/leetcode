package com.github.dhiraj072.leetcode.solutions.trees;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class KthSmallestElementInBSTTest extends BinaryTreeTestBase {

  KthSmallestElementInBST cut = new KthSmallestElementInBST();

  @Test
  public void test1() {

    TreeNode tree = generateBinaryTree(new int[] {3,1,4,-1,2});
    assertEquals(1, cut.kthSmallest(tree, 1));
    assertEquals(2, cut.kthSmallest(tree, 2));
    assertEquals(3, cut.kthSmallest(tree, 3));
    assertEquals(4, cut.kthSmallest(tree, 4));
  }

}