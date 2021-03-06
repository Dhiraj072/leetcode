package com.github.dhiraj072.leetcode.solutions.trees;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BinaryTreeSymmetricCheckerTest extends BinaryTreeTestBase {

  @Test
  void testIsSymmetricShouldReturnTrue() {

    TreeNode root = generateBinaryTree(new int[] {1,2,2,3,4,4,3});
    assertTrue(BinaryTreeSymmetricChecker.isSymmetric(root));
  }

  @Test
  void testIsSymmetricShouldRReturnFalse() {

    TreeNode root = generateBinaryTree(new int[] {1,2,2,-1,3,-1,3});
    assertFalse(BinaryTreeSymmetricChecker.isSymmetric(root));
  }

  @Test
  void testIsSymmetricSingleNode() {

    TreeNode root = generateBinaryTree(new int[] {1});
    assertTrue(BinaryTreeSymmetricChecker.isSymmetric(root));
  }

  @Test
  void testIsSymmetricTwoNodes() {

    TreeNode root = generateBinaryTree(new int[] {1, 2});
    assertFalse(BinaryTreeSymmetricChecker.isSymmetric(root));
  }

  @Test
  void testIsSymmetricZeroNodes() {

    TreeNode root = generateBinaryTree(new int[] {});
    assertTrue(BinaryTreeSymmetricChecker.isSymmetric(root));
  }
}