package com.github.dhiraj072.leetcode.solutions.strings;

import static org.junit.Assert.*;

import org.junit.Test;

public class FirstUniqueCharFinderTest {

  @Test
  public void testShouldReturnTwo() {

    assertEquals(2, FirstUniqueCharFinderArray.firstUniqChar("loveleetcode"));
  }

  @Test
  public void testShouldReturnZero() {

    assertEquals(0, FirstUniqueCharFinderArray.firstUniqChar("abc"));
  }

  @Test
  public void testShouldReturnMinusOne() {

    assertEquals(-1, FirstUniqueCharFinderArray.firstUniqChar("aabbcc"));
  }

  @Test
  public void testShouldReturnThree() {

    assertEquals(2, FirstUniqueCharFinderArray.firstUniqChar("aac"));
  }

  @Test
  public void testShouldMinusOne() {

    assertEquals(-1, FirstUniqueCharFinderArray.firstUniqChar("aadadaad"));
  }

  @Test
  public void testShouldReturnFive() {

    assertEquals(5, FirstUniqueCharFinderArray.firstUniqChar("aabbcdc"));
  }
}