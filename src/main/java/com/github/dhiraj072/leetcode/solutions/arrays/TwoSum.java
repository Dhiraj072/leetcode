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

        return new int[] {indexOf(origNums, nums[i]), indexOf(origNums, nums[j])};
      } else if (sum < target) {

        i++;
      } else {

        j--;
      }
    }
    return null;
  }

  private static int indexOf(int[] origNums, int num) {

    for (int i = 0; i < origNums.length; ++i) {

      if (origNums[i] == num) {

        LOGGER.info("Orig nums {} num {} index {}", origNums, num, i);
        return i;
      }
    }
    return -1;
  }
}
