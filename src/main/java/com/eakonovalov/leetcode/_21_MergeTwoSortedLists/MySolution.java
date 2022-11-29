package com.eakonovalov.leetcode._21_MergeTwoSortedLists;

import com.eakonovalov.leetcode.common.ListNode;

public class MySolution implements Solution {

    @Override
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        if (list1.val > list2.val) {
            ListNode temp = list1;
            list1 = list2;
            list2 = temp;
        }
        ListNode result = list1;
        while (list2 != null) {
            while (list1.next != null && list2 != null && list1.next.val > list2.val) {
                ListNode temp1 = list1.next;
                ListNode temp2 = list2.next;
                list2.next = temp1;
                list1.next = list2;
                list2 = temp2;
            }
            while (list1.next != null && list2 != null && list1.next.val <= list2.val) {
                list1 = list1.next;
            }
            if (list2 != null && list2.next == null) {
                list2.next = list1.next;
                list1.next = list2;
                return result;
            }
            if (list1.next == null) {
                list1.next = list2;
                return result;
            }
        }

        return result;
    }
}
