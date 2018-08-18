package com.github.dhiraj072.leetcode.solutions.math;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PrimeNumbersTest {

  private PrimeNumbers primeNumbers = new PrimeNumbers();

  @Test
  public void countPrimesSimpleOne() {

    assertEquals(4, primeNumbers.count(10));
  }

  @Test
  public void countPrimesSimpleTwo() {

    assertEquals(8, primeNumbers.count(20));
  }

  @Test
  public void countPrimesZero() {

    assertEquals(0, primeNumbers.count(1));
  }

  @Test
  public void countPrimesOne() {

    assertEquals(0, primeNumbers.count(2));
  }

  @Test
  public void countPrimesTwo() {

    assertEquals(2, primeNumbers.count(5));
  }

  @Test
  public void countPrimesNumIsZero() {

    assertEquals(0, primeNumbers.count(0));
  }

  @Test
  public void countPrimesNumBig() {

    assertEquals(13848, primeNumbers.count(150000));
  }
}