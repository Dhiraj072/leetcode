package com.github.dhiraj072.leetcode.solutions.arrays;

import static java.lang.Math.abs;

public abstract class ArrayRotator {

  abstract int[] rotate(int nums[], int k);

  /**
   * @param m - number to return modulus for
   * @return m mod(n)
   */
  int mod(int m, int n) {

    return abs(m) < abs(n) ? abs(m) : abs(m) % abs(n);
  }
}
