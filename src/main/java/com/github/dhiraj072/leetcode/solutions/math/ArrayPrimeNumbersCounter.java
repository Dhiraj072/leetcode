package com.github.dhiraj072.leetcode.solutions.math;

class ArrayPrimeNumbersCounter implements PrimeNumbersCounter {

  public int count(int n) {

    if (n < 2) {

      return 0;
    }

    int[] primes = new int[n + 1];
    for (int i = 2; i <= n; ++i) {

      primes[i] = i;
    }
    int count = 0;
    for (int i = 2; i < n; i = i + 1) {

      if (primes[i] != 0) {

        count++;
        for (int j = i * 2; j < n; j = j + i) {

          primes[j] = 0;
        }
      }
    }
    return count;
  }
}
