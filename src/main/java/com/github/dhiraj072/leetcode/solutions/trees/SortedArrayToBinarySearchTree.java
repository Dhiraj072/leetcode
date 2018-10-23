package com.github.dhiraj072.leetcode.solutions.trees;

public class SortedArrayToBinarySearchTree {

  public static TreeNode convert(int[] sortedArray){

    return binarySearch(sortedArray, 0, sortedArray.length - 1);
  }

  private static TreeNode binarySearch(int[] sortedArray, int start, int end) {

    int mid = (start + end) / 2;
    TreeNode node = new TreeNode(sortedArray[mid]);
    if (start > end) {

      return null;
    }
    node.left = binarySearch(sortedArray, start, mid - 1);
    node.right = binarySearch(sortedArray,mid + 1, end);
    return node;
  }
}
