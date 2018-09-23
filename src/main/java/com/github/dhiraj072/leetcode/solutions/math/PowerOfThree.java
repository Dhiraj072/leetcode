package com.github.dhiraj072.leetcode.solutions.math;

public class PowerOfThree {

  public static boolean isPowerOfThree(int n) {

    if (n <= 0) {

      return false;
    }
    while (n > 1) {

      if (n % 3 != 0) {

        return false;
      }
      if (n >= 729) {

        n = n / 729;
      } else {

        n = n / 3;
      }
    }
    return true;
  }

  static boolean isPowerOfThreeWithoutLoop(int n) {

    return n > 0 && 1162261467 % n == 0;
  }
}
