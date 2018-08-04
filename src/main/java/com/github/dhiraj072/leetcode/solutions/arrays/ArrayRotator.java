package com.github.dhiraj072.leetcode.solutions.arrays;

import static java.lang.Math.abs;

public abstract class ArrayRotator {

  abstract int[] rotate(int arr[], int steps);

  /**
   *
   * @param m - number to return modulus for
   * @param n
   * @return m mod(n)
   */
  int mod(int m, int n) {

    return abs(m) < abs(n) ? abs(m) : abs(m) % abs(n);
  }
}
