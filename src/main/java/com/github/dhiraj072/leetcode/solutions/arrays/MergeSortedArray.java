package com.github.dhiraj072.leetcode.solutions.arrays;

public class MergeSortedArray {

  public void merge(int[] nums1, int m, int[] nums2, int n) {

    int[] origNums1 = nums1.clone();
    int i = 0;
    int j = 0;
    int index = 0;
    while (i < m && j < n) {

      if (origNums1[i] < nums2[j]) {

        nums1[index] = origNums1[i];
        i++;
      } else {

        nums1[index] = nums2[j];
        j++;
      }
      index++;
    }
    index = append(nums1, index, origNums1, i);
    append(nums1, index, nums2, j);
  }

  private int append(int[] arr1, int startIndex, int[] arr2, int arr2Index) {

    for (int i = arr2Index; i < arr2.length; ++i) {

      arr1[startIndex] = arr2[i];
      startIndex++;
    }
    return startIndex;
  }
}
