package com.github.dhiraj072.leetcode.solutions.strings;

import static org.junit.Assert.*;

import org.junit.Test;

public class FirstUniqueCharFinderTest {

  @Test
  public void testShouldReturnTwo() {

    assertEquals(2, FirstUniqueCharFinder.firstUniqChar("loveleetcode"));
  }

  @Test
  public void testShouldReturnZero() {

    assertEquals(0, FirstUniqueCharFinder.firstUniqChar("abc"));
  }

  @Test
  public void testShouldReturnMinusOne() {

    assertEquals(-1, FirstUniqueCharFinder.firstUniqChar("aabbcc"));
  }

  @Test
  public void testShouldReturnThree() {

    assertEquals(2, FirstUniqueCharFinder.firstUniqChar("aac"));
  }

  @Test
  public void testShouldMinusOne() {

    assertEquals(-1, FirstUniqueCharFinder.firstUniqChar("aadadaad"));
  }
}