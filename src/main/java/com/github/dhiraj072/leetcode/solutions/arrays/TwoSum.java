package com.github.dhiraj072.leetcode.solutions.arrays;

import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TwoSum {

  private static final Logger LOGGER =
      LoggerFactory.getLogger(TwoSum.class);

  public static int[] twoSum(int[] nums, int target) {

    int[] origNums = nums.clone();
    Arrays.sort(nums);
    int i = 0;
    int j = nums.length - 1;
    int sum;
    while (i < j) {

      sum = nums[i] + nums[j];
      if (sum == target) {

        return indexOf(origNums, nums[i], nums[j]);
      } else if (sum < target) {

        i++;
      } else {

        j--;
      }
    }
    return null;
  }

  private static int[] indexOf(int[] origNums, int num1, int num2) {

    int[] result = new int[2];
    int count = 0;
    for (int i = 0; i < origNums.length; ++i) {

      if (origNums[i] == num1 || origNums[i] == num2) {

        result[count] = i;
        count++;
      }
    }
    return result;
  }
}
