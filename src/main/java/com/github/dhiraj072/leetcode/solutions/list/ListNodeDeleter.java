package com.github.dhiraj072.leetcode.solutions.list;

// https://leetcode.com/explore/interview/card/top-interview-questions-easy/93/linked-list/553/
class ListNodeDeleter {

  void deleteNode(ListNode node) {
    node.val = node.next.val;
    node.next = node.next.next;
  }
}
