package com.github.dhiraj072.leetcode.solutions.list;

public class LinkedListCycleCalculator {

  public static boolean hasCycle(ListNode head) {

    if (head == null || head.next == null) {

      return false;
    }
    ListNode pointer1 = head;
    ListNode pointer2 = head.next.next;
    while (pointer2 != null && pointer2.next != null && pointer2.next.next != null) {

      if (pointer1 == pointer2) {

        return true;
      }
      pointer1 = pointer1.next;
      pointer2 = pointer2.next.next;
    }
    return false;
  }
}
