package com.eakonovalov.leetcode._876_MiddleOfLinkedList;

import com.eakonovalov.leetcode.common.ListNode;

public class FastSlowPointerSolution implements Solution {

    @Override
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}
