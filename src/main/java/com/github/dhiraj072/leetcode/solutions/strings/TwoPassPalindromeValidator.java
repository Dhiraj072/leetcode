package com.github.dhiraj072.leetcode.solutions.strings;

/**
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
 *
 * Note: For the purpose of this problem, we define empty string as valid palindrome.
 *
 * Example 1:
 *
 * Input: "A man, a plan, a canal: Panama"
 * Output: true
 * Example 2:
 *
 * Input: "race a car"
 * Output: false
 */
public class TwoPassPalindromeValidator implements PalindromeValidator {

  @Override
  public boolean isValid(String str) {

    String reverseStr = new StringBuilder(str).reverse().toString();
    return str.equals(reverseStr);
  }
}
