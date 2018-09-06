package com.github.dhiraj072.leetcode.solutions.strings;

public class FirstUniqueCharFinderArray {

  public static int firstUniqChar(String s) {

    int[] frequency = new int[26];

    for (int i = 0; i < s.length(); ++i) {

      frequency[s.charAt(i) - 97] += 1;
    }
    for (int i = 0; i < s.length(); ++i) {

      if (frequency[s.charAt(i) - 97] == 1) {

        return s.indexOf(s.charAt(i));
      }
    }
    return -1;
  }
}
