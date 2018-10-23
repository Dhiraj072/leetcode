package com.github.dhiraj072.leetcode.utils;

import com.github.dhiraj072.leetcode.solutions.trees.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeTraverser {

  private static List<Integer> traverseResult;

  public static List<Integer> depthTraverse(TreeNode node) {

    traverseResult = new ArrayList<>();
    depthTraversePreOrder(node);
    return traverseResult;
  }

  private static void depthTraversePreOrder(TreeNode node) {

    if (node == null) {

      traverseResult.add(null);
      return;
    }
    traverseResult.add(node.val);
    depthTraversePreOrder(node.left);
    depthTraversePreOrder(node.right);
  }

  public static List<Integer> levelTraverse(TreeNode node) {

    traverseResult = new ArrayList<>();
    Queue<TreeNode> traverseQueue = new LinkedList<>();
    traverseQueue.add(node);
    levelTraverse(traverseQueue);
    return traverseResult;
  }

  private static void levelTraverse(Queue<TreeNode> traverseQ) {

    while (!traverseQ.isEmpty()) {

      TreeNode currentNode = traverseQ.remove();
      if (currentNode == null) {

        traverseResult.add(null);
        continue;
      }
      traverseResult.add(currentNode.val);
      if (isLeafNode(currentNode)) {

        continue;
      }
      traverseQ.add(currentNode.left);
      traverseQ.add(currentNode.right);
    }
  }

  public static boolean isLeafNode(TreeNode node) {

    return node.left == null && node.right == null;
  }
}
