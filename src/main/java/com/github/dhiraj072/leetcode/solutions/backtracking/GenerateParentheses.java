package com.github.dhiraj072.leetcode.solutions.backtracking;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {

  public List<String> generateParenthesis(int n) {

    List<String> result = new ArrayList<>();
    char[] str = new char[2*n];
    generate(str, 0, result, 0, 0);
    System.out.println(result);
    return result;
  }

  private void generate(char[] str, int pos, List<String> result, int openBrackets, int closeBrackets) {

    if (pos == str.length) {
      result.add(new String(str));
    } else {
      if (openBrackets < str.length/2) {
        str[pos] = '(';
        generate(str, pos + 1, result, openBrackets + 1, closeBrackets);
      }
      if (closeBrackets < openBrackets) {
        str[pos] = ')';
        generate(str, pos + 1, result, openBrackets, closeBrackets + 1);
      }
    }
  }
}
