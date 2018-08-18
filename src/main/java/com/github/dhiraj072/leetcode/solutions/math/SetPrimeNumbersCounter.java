package com.github.dhiraj072.leetcode.solutions.math;

import java.util.HashSet;
import java.util.Set;

class SetPrimeNumbersCounter implements PrimeNumbersCounter {

  public int count(int n) {

    System.out.println("Count set");
    Set<Integer> primes = new HashSet<>();
    for (int i = 2; i < n; ++i) {

      primes.add(i);
    }
    for (int i = 2; i <= n/2; i = i + 1) {

      if (!primes.contains(i)) {

        continue;
      }
      for (int j = i * 2; j <= n; j = j + i) {

        primes.remove(j);
      }
    }
    return primes.size();
  }
}
