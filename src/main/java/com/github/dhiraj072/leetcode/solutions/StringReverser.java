package com.github.dhiraj072.leetcode.solutions;

class StringReverser {

    String reverseString(String s) {

        String result = "";
        int strLength = s.length();

        for (int i = strLength; i >= 1; --i) {

            result = result.concat(s.substring(i - 1, i));
        }

        return result;
    }
}
