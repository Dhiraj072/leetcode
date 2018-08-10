package com.github.dhiraj072.leetcode.solutions.strings;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LongestCommonPrefixTest {

  private LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();

  @Test
  public void testSimplePrefix() {

    assertEquals("fl",
        longestCommonPrefix
            .getLongestCommonPrefix(new String[]{"flower", "flow", "flight" }));
  }

  @Test
  public void testEmptyPrefix() {

    assertEquals("",
        longestCommonPrefix
            .getLongestCommonPrefix(new String[]{"hello", "yoo" }));
  }

  @Test
  public void testAllStringsAreEmpty() {

    assertEquals("",
        longestCommonPrefix
            .getLongestCommonPrefix(new String[]{"", "", "", "" }));
  }

  @Test
  public void testAllStringsAreSame() {

    assertEquals("hello",
        longestCommonPrefix
            .getLongestCommonPrefix(new String[]{"hello", "hello", "hello" }));
  }

  @Test
  public void testOneStringIsEmpty() {

    assertEquals("",
        longestCommonPrefix.getLongestCommonPrefix(new String[]{"", "hello" }));
  }

  @Test
  public void testStringArrayIsEmpty() {

    assertEquals("",
        longestCommonPrefix.getLongestCommonPrefix(new String[]{}));
  }

  @Test
  public void testStringArrayContainsOneString() {

    assertEquals("hello",
        longestCommonPrefix.getLongestCommonPrefix(new String[]{"hello" }));
  }

  @Test
  public void testStringTwoElements() {

    assertEquals("a",
        longestCommonPrefix.getLongestCommonPrefix(new String[]{"aa", "a" }));
  }

}