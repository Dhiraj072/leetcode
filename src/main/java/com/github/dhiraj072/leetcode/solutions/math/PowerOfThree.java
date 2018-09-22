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
      n = n / 3;
    }
    return true;
  }
}
