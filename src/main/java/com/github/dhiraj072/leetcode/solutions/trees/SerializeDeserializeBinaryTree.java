package com.github.dhiraj072.leetcode.solutions.trees;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Serialization is the process of converting a data structure or object into a sequence of bits so that it can be stored in a file or memory buffer, or transmitted across a network connection link to be reconstructed later in the same or another computer environment.
 *
 * Design an algorithm to serialize and deserialize a binary tree. There is no restriction on how your serialization/deserialization algorithm should work. You just need to ensure that a binary tree can be serialized to a string and this string can be deserialized to the original tree structure.
 *
 * Example:
 *
 * You may serialize the following tree:
 *
 *     1
 *    / \
 *   2   3
 *      / \
 *     4   5
 *
 * as "[1,2,3,null,null,4,5]"
 * Clarification: The above format is the same as how LeetCode serializes a binary tree. You do not necessarily need to follow this format, so please be creative and come up with different approaches yourself.
 *
 * Note: Do not use class member/global/static variables to store states. Your serialize and deserialize algorithms should be stateless.
 */
public class SerializeDeserializeBinaryTree {

  public String serialize(TreeNode root) {

    StringBuilder treeStr = new StringBuilder();
    traverse(root, treeStr);
    String result = treeStr.toString();
    return result.substring(0, result.length() - 1);
  }

  private void traverse(TreeNode node, StringBuilder result) {
    if(node == null) {
      result.append("null,");
    }
    else {
      result.append(node.val).append(",");
      traverse(node.left, result);
      traverse(node.right, result);
    }
  }

  // Decodes your encoded data to tree.
  public TreeNode deserialize(String data) {
    if(data.trim().isEmpty())
      return null;
    LinkedList<String> nodes = new LinkedList<>(Arrays.asList(data.split(",")));
    return buildTree(nodes);
  }

  private TreeNode buildTree(Queue<String> nodes) {
    String val = nodes.remove();
    if (val == null || val.equals("null"))
      return null;
    TreeNode node = new TreeNode(Integer.parseInt(val));
    node.left = buildTree(nodes);
    node.right = buildTree(nodes);
    return node;
  }
}
