package com.github.dhiraj072.leetcode.solutions.arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class BadVersionAPI {

  private static final Logger LOGGER =
      LoggerFactory.getLogger(BadVersionAPI.class);

  private int firsBadVersion;

  public BadVersionAPI() {

  }

  BadVersionAPI(int badVersion) {

    LOGGER.info("Setting firstBadVersion {}", badVersion);
    firsBadVersion = badVersion;
  }

  boolean isBadVersion(int version) {

    return version >= firsBadVersion;
  }

  public void setFirsBadVersion(int firsBadVersion) {

    this.firsBadVersion = firsBadVersion;
  }

}
