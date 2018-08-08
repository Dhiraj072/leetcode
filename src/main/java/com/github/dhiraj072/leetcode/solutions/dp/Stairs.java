package com.github.dhiraj072.leetcode.solutions.dp;

class Stairs {

  private int[] waysToClimb;

  int distinctWaysToClimb(int n) {

    waysToClimb = new int[n + 1];
    return countDistinctWaysToClimb(n);
  }

  private int countDistinctWaysToClimb(int n) {

    if (n == 1) {

      return 1;
    } else if (n == 2) {

      return 2;
    } else {

      if (waysToClimb[n - 1] == 0) {

        waysToClimb[n - 1] = countDistinctWaysToClimb(n - 1);
      }
      if (waysToClimb[n - 2] == 0) {

        waysToClimb[n - 2] = countDistinctWaysToClimb(n - 2);
      }
      return waysToClimb[n - 1] + waysToClimb[n - 2];
    }
  }
}
