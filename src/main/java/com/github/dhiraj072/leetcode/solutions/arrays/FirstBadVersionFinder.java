package com.github.dhiraj072.leetcode.solutions.arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FirstBadVersionFinder {

  private static final Logger LOGGER =
      LoggerFactory.getLogger(FirstBadVersionFinder.class);

  private int[] arr;
  private int firsBadVersion;

  FirstBadVersionFinder(int[] array, int firstBadVersion) {

    LOGGER.info("Initializing with {}", array);
    this.arr = array;
    this.firsBadVersion = firstBadVersion;
  }

  int firstBadVersion(int n) {

    if (n == 0) {

      return 0;
    }
    return search(0, n);
  }

  private int search(int leftIndex, int rightIndex) {

    int currentVersion = (leftIndex + rightIndex) / 2;
    if (currentVersion == 0) {

      return 1;
    }
    if (isBadVersion(currentVersion) && !isBadVersion(currentVersion - 1)) {

      return currentVersion + 1;
    }
    LOGGER.info("Checking at index {}", currentVersion);

    if (isBadVersion(currentVersion)) {

      return search(leftIndex, currentVersion);
    } else {

      return search(currentVersion, rightIndex);
    }
  }

  private boolean isBadVersion(int version) {

    return arr[version] >= firsBadVersion;
  }
}
