package com.eakonovalov.leetcode._142_LinkedListCycleII;

import com.eakonovalov.leetcode.common.ListNode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MySolution implements Solution {

    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }

        Set<Integer> set = new HashSet<>();
        while (head != null) {
            if (!set.contains(head.val)) {
                set.add(head.val);
            }
            else {
                return head;
            }
            head = head.next;
        }

        return null;
    }
}
