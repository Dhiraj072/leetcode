package com.github.dhiraj072.leetcode.solutions.arrays;

import java.util.HashMap;

class DuplicateChecker {

  boolean containsDuplicate(int[] arr) {

    HashMap<Integer, Boolean> elementPresent = new HashMap<>();
    for (int num : arr) {

      if (elementPresent.containsKey(num)) {

        return true;
      } else {

        elementPresent.put(num, true);
      }
    }
    return false;
  }
}
