package com.github.dhiraj072.leetcode.solutions.list;

public class IterativeListNodeReverser implements ListNodeReverser {

  @Override
  public ListNode reverse(ListNode node) {

    if (node == null) {

      return node;
    }
    ListNode prev = node;
    ListNode current = node.next;
    ListNode tmp;
    prev.next = null;
    while (current != null) {

      tmp = current.next;
      current.next = prev;
      prev = current;
      current = tmp;
    }
    return prev;
  }
}
