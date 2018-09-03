package com.github.dhiraj072.leetcode.solutions.arrays;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SingleNumberTest {

  private SingleNumber singleNumber = new SingleNumber();

  @Test
  public void testShouldReturnFour() {

    assertEquals(4, singleNumber.singleNumber(new int[]{4, 1, 2, 1, 2}));
  }

  @Test
  public void testShouldReturnOne() {

    assertEquals(1, singleNumber.singleNumber(new int[]{2, 2, 1}));
  }

  @Test
  public void testShouldReturnTwo() {

    assertEquals(2, singleNumber.singleNumber(new int[]{2}));
  }

  @Test
  public void testShouldReturnFive() {

    assertEquals(5, singleNumber.singleNumber(new int[]{1, 1, 5, 7, 7}));
  }
}