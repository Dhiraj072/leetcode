package com.github.dhiraj072.leetcode.solutions.arrays;

import java.util.HashMap;

class DuplicateChecker {

  boolean containsDuplicate(int[] nums) {

    HashMap<Integer, Boolean> elementPresent = new HashMap<>();
    for (int num : nums) {

      if (elementPresent.containsKey(num)) {

        return true;
      } else {

        elementPresent.put(num, true);
      }
    }
    return false;
  }
}
