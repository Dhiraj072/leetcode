package com.github.dhiraj072.leetcode.solutions.list;

/**
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 *
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 *
 * Example:
 *
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807.
 *
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class AddTwoNumbers {

  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

    int carryOn = 0;
    int sum = 0;
    int currentSum = 0;
    ListNode head = null;
    ListNode currentNode = null;
    ListNode prevNode = null;
    while(l1 != null || l2 != null) {

      if (l1 != null && l2 != null ) {

        currentSum = l1.val + l2.val + carryOn;
        l1 = l1.next;
        l2 = l2.next;
      } else if (l1 != null) {

        currentSum = l1.val + carryOn;
        l1 = l1.next;
      } else if (l2 != null) {

        currentSum = l2.val + carryOn;
        l2 = l2.next;
      } else {

        break;
      }
      if (currentSum <= 9) {

        currentNode = new ListNode(currentSum);
        carryOn = 0;
      } else {

        currentNode = new ListNode(currentSum % 10);
        carryOn = 1;
      }
      if (prevNode == null)  {

        head = currentNode;
        prevNode = currentNode;
      } else {

        prevNode.next = currentNode;
        prevNode = prevNode.next;
      }
    }
    if (carryOn == 1) {

      prevNode.next = new ListNode(1);
    }
    return head;
  }
}