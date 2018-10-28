package com.github.dhiraj072.leetcode.solutions.list;

public class NthEndNodeRemover {

  public static ListNode removeNthFromEnd(ListNode head, int n) {

    if (head.next == null) {

      return null;
    }
    ListNode first = head;
    ListNode second = head;
    while (n > 0) {

      second = second.next;
      n--;
    }
    if (second == null) {

      return head.next;
    }
    while (second.next != null) {

      second = second.next;
      first = first.next;
    }
    first.next = first.next.next;
    return head;
  }
}
