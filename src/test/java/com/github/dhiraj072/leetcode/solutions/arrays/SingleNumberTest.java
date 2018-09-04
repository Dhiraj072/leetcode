package com.github.dhiraj072.leetcode.solutions.arrays;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
public abstract class SingleNumberTest {

  private SingleNumber singleNumber;

  @BeforeAll
  void init() {

    singleNumber = createInstance();
  }

  abstract SingleNumber createInstance();

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