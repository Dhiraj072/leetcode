package com.github.dhiraj072.leetcode.solutions.trees;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class SortedArrayToBinarySearchTreeTest extends BinaryTreeTestBase {

  private static final Logger LOGGER =
      LoggerFactory.getLogger(SortedArrayToBinarySearchTreeTest.class);

  @Test
  void testArrayToTreeOddElements() {

    TreeNode root = SortedArrayToBinarySearchTree.convert(new int[] {-10,-3,0,5,9});
    LOGGER.info("Tree {}", depthTraverseBinaryTree(root));
  }

  @Test
  void testArrayToTreeEvenElements() {

    TreeNode root = SortedArrayToBinarySearchTree.convert(new int[] {1,2, 3, 4, 5, 6});
    LOGGER.info("Tree {}", depthTraverseBinaryTree(root));
  }
}