package com.eakonovalov.leetcode._2_AddTwoNumbers;

import com.eakonovalov.leetcode.common.ListNode;

public class MySolution implements Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = l1;
        int reminder = -1;
        while (l1 != null) {
            int sum = l1.val + (l2 != null ? l2.val : 0) + (Math.max(reminder, 0));
            if (sum > 9) {
                reminder = 1;
                sum -= 10;
            } else {
                reminder = 0;
            }
            l1.val = sum;
            if (l1.next == null && l2 != null && l2.next != null) {
                l1.next = l2.next;
                l2.next = null;
            }
            if (l1.next == null && reminder > 0) {
                l1.next = new ListNode(0);
            }
            l1 = l1.next;
            l2 = l2 != null ? l2.next : null;
        }

        return result;
    }
}
