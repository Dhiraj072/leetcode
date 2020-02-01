package com.github.dhiraj072.leetcode.solutions.backtracking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent.
 *
 * A mapping of digit to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.
 *
 * Example:
 *
 * Input: "23"
 * Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
 * Note:
 *
 * Although the above answer is in lexicographical order, your answer could be in any order you want.
 */
public class LetterCombinationsOfPhoneNumber {

  /*
  Works only with java 11 but currently my local is java 8,
  though leetcode accepts this
  Map<Character, String> phone = Map
      .of('2', "abc", '3', "def", '4', "ghi", '5', "jkl", '6', "mno",
      '7', "pqrs", '8', "tuv", '9', "wxyz");
   */
  Map<Character, String> phone = new HashMap<>();

  public List<String> letterCombinations(String digits) {

    List<String> result = new ArrayList<>();
    char[] str = new char[digits.length()];
    generate(str, 0, result, digits);
    return result;
  }

  void generate(char[] str, int pos, List<String> result, String digits) {
    if (str.length == pos) {
      if (pos != 0)
        result.add(new String(str));
    } else {
      String chars = phone.get(digits.charAt(pos));
      for (int i = 0; i < chars.length(); i++) {
        str[pos] = chars.charAt(i);
        generate(str, pos + 1, result, digits);
      }
    }
  }
}
