package com.github.dhiraj072.leetcode.solutions.arrays;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class GroupAnagramsTest {

  @Test
  void testCase1() {
    assertEquals(Arrays.asList(
      Arrays.asList("eat","tea","ate"),
      Arrays.asList("bat"),
      Arrays.asList("tan","nat")
      ),
        GroupAnagrams.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));
  }
}