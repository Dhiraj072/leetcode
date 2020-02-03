package com.github.dhiraj072.leetcode.solutions.math;

/**
 * Excel Sheet Column Number
 * Given a column title as appear in an Excel sheet, return its corresponding column number.
 *
 * For example:
 *
 *     A -> 1
 *     B -> 2
 *     C -> 3
 *     ...
 *     Z -> 26
 *     AA -> 27
 *     AB -> 28
 *     ...
 * Example 1:
 *
 * Input: "A"
 * Output: 1
 * Example 2:
 *
 * Input: "AB"
 * Output: 28
 * Example 3:
 *
 * Input: "ZY"
 * Output: 701
 */
public class ExcelSheetColumnNumber {

  public int titleToNumber(String s) {
    int col = 0;
    int pow = 0;
    for(int i = s.length() - 1; i >= 0; --i) {
      int colNum = (s.charAt(i) % 'A') + 1;
      col += (int) (Math.pow(26, pow) * colNum);
      pow++;
    }
    return col;
  }
}
