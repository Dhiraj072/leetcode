package com.github.dhiraj072.leetcode.solutions.math;

import java.util.HashMap;
import java.util.Map;

class RomanToIntegerConverter {

  private Map<String, Integer> romanToIntegerMap;

  RomanToIntegerConverter() {

    romanToIntegerMap = new HashMap<>();
    romanToIntegerMap.put("I", 1);
    romanToIntegerMap.put("IV", 4);
    romanToIntegerMap.put("V", 5);
    romanToIntegerMap.put("IX", 9);
    romanToIntegerMap.put("X", 10);
    romanToIntegerMap.put("XL", 40);
    romanToIntegerMap.put("L", 50);
    romanToIntegerMap.put("XC", 90);
    romanToIntegerMap.put("C", 100);
    romanToIntegerMap.put("CD", 400);
    romanToIntegerMap.put("D", 500);
    romanToIntegerMap.put("CM", 900);
    romanToIntegerMap.put("M", 1000);
  }

  int convert(String romanNumeral) {

    int i = 0;
    int integerResult = 0;
    while (i < romanNumeral.length()) {

      if (i <= romanNumeral.length() - 2 && romanToIntegerMap
          .containsKey(romanNumeral.substring(i, i + 2))) {

        integerResult += romanToIntegerMap
            .get(romanNumeral.substring(i, i + 2));
        i = i + 2;
      } else {

        integerResult += romanToIntegerMap
            .get(romanNumeral.substring(i, i + 1));
        i++;
      }
    }
    return integerResult;
  }
}
