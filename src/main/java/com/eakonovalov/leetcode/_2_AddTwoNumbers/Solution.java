package com.eakonovalov.leetcode._2_AddTwoNumbers;

public interface Solution {

    ListNode addTwoNumbers(ListNode l1, ListNode l2);

    class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
