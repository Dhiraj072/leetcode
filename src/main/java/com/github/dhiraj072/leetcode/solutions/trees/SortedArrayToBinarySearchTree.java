package com.github.dhiraj072.leetcode.solutions.trees;

import static com.github.dhiraj072.leetcode.utils.TreeTraverser.levelTraverse;

import java.util.List;

public class SortedArrayToBinarySearchTree {

  public static List<Integer> convert(int[] sortedArray){

    TreeNode node = binarySearchAndBuildTree(sortedArray, 0, sortedArray.length - 1);
    return levelTraverse(node);
  }

  private static TreeNode binarySearchAndBuildTree(int[] sortedArray, int start, int end) {

    int mid = (start + end) / 2;
    TreeNode node = new TreeNode(sortedArray[mid]);
    if (start > end) {

      return null;
    }
    node.left = binarySearchAndBuildTree(sortedArray, start, mid - 1);
    node.right = binarySearchAndBuildTree(sortedArray,mid + 1, end);
    return node;
  }
}
