package com.github.dhiraj072.leetcode.solutions.others;

import java.util.HashMap;
import java.util.Stack;

class ValidParentheses {

  boolean validate(String str) {

    Stack<Character> open = new Stack<>();
    HashMap<Character, Character> closeChar = new HashMap<>();
    closeChar.put('(', ')');
    closeChar.put('{', '}');
    closeChar.put('[', ']');

    for (int i = 0; i < str.length(); ++i) {

      char c = str.charAt(i);
      if (c == '(' || c == '{' || c == '[') {

        open.push(str.charAt(i));
      } else {

        if (open.empty() || closeChar.get(open.pop()) != c) {

          return false;
        }
      }
    }
    return open.empty();
  }
}
