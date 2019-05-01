package com.github.dhiraj072.leetcode.solutions.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Given an array of strings, group anagrams together.
 *
 * Example:
 *
 * Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
 * Output:
 * [
 *   ["ate","eat","tea"],
 *   ["nat","tan"],
 *   ["bat"]
 * ]
 * Note:
 *
 * All inputs will be in lowercase.
 * The order of your output does not matter.
 */
public class GroupAnagrams {

  public static List<List<String>> groupAnagrams(String[] strs) {

    String sorted;
    Map<String, List<String>> result = new HashMap<>();
    for (int i = 0; i < strs.length; ++i) {

      char[] arr = strs[i].toCharArray();
      Arrays.sort(arr);
      sorted = String.valueOf(arr);
      if (!result.containsKey(sorted)) {

        result.put(sorted, new ArrayList<>());
      }
      result.get(sorted).add(strs[i]);
    }
    List<List<String>> list = new ArrayList<>(result.values());
    return list;
  }
}
