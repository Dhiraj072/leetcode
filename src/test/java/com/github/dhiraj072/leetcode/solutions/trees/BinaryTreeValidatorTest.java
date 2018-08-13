package com.github.dhiraj072.leetcode.solutions.trees;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class BinaryTreeValidatorTest extends BinaryTreeTestBase {

  private BinaryTreeValidator validator =
      new BinaryTreeValidator();

  private BinaryTreeNode root;

  @Test
  public void testTreeIsNotValid() {

    int initArr[] = {5, 1, 4, -1, -1, 3, 6};
    root = generateBinaryTree(initArr);
    assertFalse(validator.validate(root));
  }

  @Test
  public void testTreeIsValidThreeNodes() {

    int initArr[] = {2, 1, 3};
    root = generateBinaryTree(initArr);
    assertTrue(validator.validate(root));
  }

  @Test
  public void testTreeIsValidFiveNodes() {

    int initArr[] = {10, 5, 15, -1, -1, 6, 20};
    root = generateBinaryTree(initArr);
    assertFalse(validator.validate(root));
  }

  @Test
  public void treeIsValidSingleNode() {

    int initArr[] = {2};
    root = generateBinaryTree(initArr);
    assertTrue(validator.validate(root));
  }

  @Test
  public void treeIsValidTwoNodes() {

    int initArr[] = {2, 1};
    root = generateBinaryTree(initArr);
    assertTrue(validator.validate(root));
  }

  @Test
  public void treeIsValidZeroNodes() {

    int initArr[] = {};
    root = generateBinaryTree(initArr);
    assertTrue(validator.validate(root));
  }
}