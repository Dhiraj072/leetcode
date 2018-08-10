package com.github.dhiraj072.leetcode.solutions.strings;

/**
 * This has too many special cases, TODO find a better way!
 */
class LongestCommonPrefix {

  String getLongestCommonPrefix(String[] strs) {

    if (strs.length == 0) {

      return "";
    }

    if (strs.length == 1) {

      return strs[0];
    }

    StringBuilder longestCommonPrefix = new StringBuilder();
    int index = 0;

    while (true) {

      for (int i = 0; i < strs.length - 1; ++i) {

        if (index == strs[i].length() ||
            index == strs[i + 1].length() ||
            strs[i].isEmpty() ||
            !(strs[i].charAt(index) == strs[i + 1].charAt(index))) {

          return longestCommonPrefix.toString();
        }
      }
      longestCommonPrefix.append(strs[0].charAt(index));
      index++;
    }
  }
}
