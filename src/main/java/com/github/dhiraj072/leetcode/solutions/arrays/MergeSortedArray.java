package com.github.dhiraj072.leetcode.solutions.arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MergeSortedArray {

  private static final Logger LOGGER =
      LoggerFactory.getLogger(MergeSortedArray.class);

  public static void merge(int[] nums1, int m, int[] nums2, int n) {

    int[] origNums1 = nums1.clone();
    int i = 0;
    int j = 0;
    int index = 0;
    while (i < m && j < n) {

      if (origNums1[i] == nums2[j]) {

        nums1[index] = nums2[j];
        nums1[index + 1] = nums2[j];
        index += 2;
        j++;
        i++;
      } else if (origNums1[i] < nums2[j]) {

        nums1[index] = origNums1[i];
        i++;
        index++;
      } else {

        nums1[index] = nums2[j];
        j++;
        index++;
      }
      LOGGER.info("nums1 {}, index {}, i {} nums2 {}, j {}", nums1, index, i, nums2, j);
    }
    if (i < m) {

      append(nums1, index, origNums1, i, m);
    } else {

      append(nums1, index, nums2, j, n);
    }
  }

  private static int append(int[] arr1, int startIndex, int[] arr2, int arr2Index, int mn) {

    for (int i = arr2Index; i < mn; ++i) {
      arr1[startIndex] = arr2[i];;
      startIndex++;
    }
    return startIndex;
  }
}
