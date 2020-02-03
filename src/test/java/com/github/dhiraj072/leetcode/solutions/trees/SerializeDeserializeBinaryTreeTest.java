package com.github.dhiraj072.leetcode.solutions.trees;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class SerializeDeserializeBinaryTreeTest extends BinaryTreeTestBase  {

  private static final Logger LOGGER =
      LoggerFactory.getLogger(SerializeDeserializeBinaryTreeTest.class);

  private SerializeDeserializeBinaryTree cut = new SerializeDeserializeBinaryTree();

  @Test
  public void test() {

    TreeNode root = cut.deserialize("1,2,null,null,3,null,null");
    assertEquals("1,2,null,null,3,null,null", cut.serialize(root));
  }

}