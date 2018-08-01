package com.github.dhiraj072.leetcode.solutions.arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/96/sorting-and-searching/774/
 *
 * Stack overflows for bigger number. Need to optimize
 */
class BinaryFirstBadVersionFinder extends BadVersionAPI implements
    FirstBadVersionFinder {

  private static final Logger LOGGER =
      LoggerFactory.getLogger(BinaryFirstBadVersionFinder.class);


  BinaryFirstBadVersionFinder(int firstBadVersion) {

    super(firstBadVersion);
  }

  @Override
  public int firstBadVersion(int n) {

    if (isBadVersion(1)) {

      return 1;
    }
    return findFirstBadVersion(1, n);
  }

  private int findFirstBadVersion(int leftIndex, int rightIndex) {

    // Don't use currentVersion = (leftIndex + rightIndex) / 2 to avoid stack overflow
    // See https://en.wikipedia.org/wiki/Binary_search_algorithm#Implementation_issues
    int currentVersion = (int) Math.ceil(leftIndex + ((rightIndex - leftIndex) / 2.0));

    if (isBadVersion(currentVersion) && !isBadVersion(currentVersion - 1)) {

      return currentVersion;
    }

    if (isBadVersion(currentVersion)) {

      return findFirstBadVersion(leftIndex, currentVersion);
    } else {

      return findFirstBadVersion(currentVersion, rightIndex);
    }
  }
}
