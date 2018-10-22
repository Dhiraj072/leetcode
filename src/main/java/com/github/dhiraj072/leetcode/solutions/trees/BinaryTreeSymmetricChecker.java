package com.github.dhiraj072.leetcode.solutions.trees;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeSymmetricChecker {

  static List<List<Integer>> result;

  public static boolean isSymmetric(TreeNode root) {

    result = new ArrayList<>();
    levelTraverse(root, 0);
    for (List<Integer> level : result) {
      
      if (!isSymmetricLevel(level)) {

        return false;
      }
    }
    return true;
  }

  private static boolean isSymmetricLevel(List<Integer> level) {

    int start = 0;
    int end = level.size() - 1;
    while (start < end) {

      if (level.get(start) != level.get(end)) {

        return false;
      }
      start++;
      end--;
    }
    return true;
  }

  private static void levelTraverse(TreeNode root, int level) {

    if (result.size() == level) {

      result.add(new ArrayList<>());
    }
    if (root == null) {

      result.get(level).add(-1);
      return;
    }
    result.get(level).add(root.val);
    levelTraverse(root.left, level + 1);
    levelTraverse(root.right, level + 1);
  }
}
