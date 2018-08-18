package com.github.dhiraj072.leetcode.solutions.math;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
abstract class PrimeNumbersCounterTest {

  private PrimeNumbersCounter primeNumbers;

  @BeforeAll
  void init() {

    primeNumbers = createPrimeNumbersCounter();
  }

  abstract PrimeNumbersCounter createPrimeNumbersCounter();

  @Test
  void countPrimesLessThanTen() {

    assertEquals(4, primeNumbers.count(10));
  }

  @Test
  void countPrimesLessThanTwenty() {

    assertEquals(8, primeNumbers.count(20));
  }

  @Test
  void countPrimesLessThanOne() {

    assertEquals(0, primeNumbers.count(1));
  }

  @Test
  void countPrimesLessThanTwo() {

    assertEquals(0, primeNumbers.count(2));
  }

  @Test
  void countPrimesLessThanFive() {

    assertEquals(2, primeNumbers.count(5));
  }

  @Test
  void countPrimesLessThanZero() {

    assertEquals(0, primeNumbers.count(0));
  }

  @Test
  void countPrimesLessThanABigNum() {

    assertEquals(13848, primeNumbers.count(150000));
  }
}