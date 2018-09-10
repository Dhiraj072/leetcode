package com.github.dhiraj072.leetcode.solutions.strings;

public class StringToInteger {

  public static int convert(String str) {

    int multiplier = 1;
    int i = 0;
    while (i < str.length() && str.charAt(i) == ' ') {

      ++i;
    }
    if (i < str.length() && (str.charAt(i) == '-' || str.charAt(i) == '+')) {

      multiplier =  str.charAt(i) == '-' ? -1 : 1;
      ++i;
    }
    while (i < str.length() && str.charAt(i) == '0') {

      ++i;
    }
    StringBuilder intStr = new StringBuilder();
    while (i < str.length() && str.charAt(i) >= '0' && str.charAt(i) <= '9') {

      intStr.append(str.charAt(i));
      i++;
    }
    System.out.println(intStr);
    int result = 0;
    int tens = 1;
    for (int j = intStr.length() - 1; j >= 0; --j) {


      int toAdd = (intStr.charAt(j) - 48) * tens;
      if (result > Integer.MAX_VALUE - toAdd) {

        return multiplier == -1 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
      } else {

        result += toAdd;
        tens = 10 * tens;
        if (tens > Integer.MAX_VALUE/10) {

          return multiplier == -1 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        }
        System.out.println(toAdd + " " + result);
      }
    }
    return result * multiplier;
  }
}
