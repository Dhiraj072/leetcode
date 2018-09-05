package com.github.dhiraj072.leetcode.solutions.strings;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharFinder {

  public static int firstUniqChar(String s) {

    Map<Character, Boolean> isUnique = new HashMap<>();
    for (int i = 0; i < s.length(); ++i) {

      if (isUnique.containsKey(s.charAt(i))) {

        isUnique.put(s.charAt(i), false);
      } else {

        isUnique.put(s.charAt(i), true);
      }
    }
    for (int i = 0; i < s.length(); ++i) {

      if (isUnique.get(s.charAt(i))) {

        return i;
      }
    }
    return -1;
  }
}

