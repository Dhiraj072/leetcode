package com.github.dhiraj072.leetcode.solutions.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayIntersectionCalculator {

  public static List<Integer> intersect(int[] nums1, int[] nums2) {

    List<Integer> result = new ArrayList<>();
    Arrays.sort(nums1);
    Arrays.sort(nums2);
    int i = 0;
    int j = 0;
    while (i < nums1.length && j < nums2.length) {

      if (nums1[i] == nums2[j]) {

        result.add(nums1[i]);
        i++;
        j++;
      } else {

        if (i == 0 || nums1[i] == nums1[i - 1]) {

          i++;
        } else if (j == 0 || nums2[j] == nums2[j - 1]) {

          j++;
        } else {

          i++;
          j++;
        }
      }
    }
    return result;
  }
}
