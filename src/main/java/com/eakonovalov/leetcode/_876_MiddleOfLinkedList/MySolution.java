package com.eakonovalov.leetcode._876_MiddleOfLinkedList;

import com.eakonovalov.leetcode.common.ListNode;

import java.util.ArrayList;
import java.util.List;

public class MySolution implements Solution {

    public ListNode middleNode(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        List<ListNode> list = new ArrayList<>();
        while (head != null) {
            list.add(head);
            head = head.next;
        }

        return list.get(list.size() / 2);
    }
}
