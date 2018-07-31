package com.github.dhiraj072.leetcode.solutions.arrays;

/**
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/96/sorting-and-searching/774/
 *
 * This exceeds the time limit. Not a good solution
 */
public class LoopFirstBadVersionFinder extends BadVersionAPI implements
    FirstBadVersionFinder {

  LoopFirstBadVersionFinder(int badVersion) {

    super(badVersion);
  }

  @Override
  public int firstBadVersion(int n) {

    int firstBadVersion = 1;
    for (int version = 1; version <= n; ++version) {

      if (isBadVersion(version)) {

        firstBadVersion = version;
        break;
      }
    }

    return firstBadVersion;
  }
}
