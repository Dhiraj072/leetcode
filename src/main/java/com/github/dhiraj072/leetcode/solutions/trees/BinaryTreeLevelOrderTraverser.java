package com.github.dhiraj072.leetcode.solutions.trees;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeLevelOrderTraverser {

  static List<List<Integer>> result;

  static List<List<Integer>> traverse(BinaryTreeNode root) {

    result = new ArrayList<>();
    int level = 0;
    levelTraverse(root, level);
    return result;
  }

  private static void levelTraverse(BinaryTreeNode root, int level) {

    if (root == null) {

      return;
    }
    if (result.size() == level) {

      result.add(new ArrayList<>());
    }
    result.get(level).add(root.val);
    levelTraverse(root.left, level + 1);
    levelTraverse(root.right, level + 1);
  }
}
