package com.github.dhiraj072.leetcode.solutions.dp;

import java.util.HashMap;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HouseRobber {

  private static final Logger LOGGER =
      LoggerFactory.getLogger(HouseRobber.class);

  static Map<Integer, Integer> calculated;

  static int rob(int nums[]) {

    calculated = new HashMap<>();
    if (nums.length == 0) {

      return 0;
    }
    return maxSum(nums, 0);
  }

  private static int maxSum(int[] nums, int n) {

    LOGGER.info("Will compute maxSum(nums, {})", n);
    if (calculated.containsKey(n)) {

      return calculated.get(n);
    }
    if (n == nums.length - 1) {

      return nums[n];
    }
    if (n == nums.length - 2) {

      return Math.max(nums[n], nums[n + 1]);
    }
    if (n == nums.length - 3) {

      return Math.max(nums[n] + nums[n + 2], nums[n + 1]);
    }
    int result = Math.max(maxSum(nums, n + 2) + nums[n],
        maxSum(nums, n + 3) +  Math.max(nums[n], nums[n + 1]));

    calculated.put(n, result);
    return result;
  }

}
