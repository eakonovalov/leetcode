package com.eakonovalov.leetcode._206_ReverseLinkedList;

import com.eakonovalov.leetcode.common.ListNode;

public class MySolution implements Solution {

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode result = head;
        head = head.next;
        result.next = null;
        while (head != null) {
            ListNode temp = head;
            head = head.next;
            temp.next = result;
            result = temp;
        }

        return result;
    }
}
