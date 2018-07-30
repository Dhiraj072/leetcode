package com.github.dhiraj072.leetcode.solutions.strings;

/**
 * Problem URL https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/879/
 */
class StringReverser {

  String reverseString(String s) {

    String result = "";
    int strLength = s.length();

    for (int i = strLength; i >= 1; --i) {

      result = result.concat(s.substring(i - 1, i));
    }

    return result;
  }
}
