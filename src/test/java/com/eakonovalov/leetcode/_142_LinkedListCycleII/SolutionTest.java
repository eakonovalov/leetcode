package com.eakonovalov.leetcode._142_LinkedListCycleII;

import com.eakonovalov.leetcode.common.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void detectCycle() {
        ListNode l = create(new int[]{3, 2, 0, -4}, 1);
        assertEquals(2, new MySolution().detectCycle(l).val);
    }

    private ListNode create(int[] arr, int pos) {
        ListNode result = null;
        ListNode end = null;
        for (int i = arr.length - 1; i >= 0; i--) {
            result = new ListNode(arr[i], result);
            if (end == null) {
                end = result;
            }
            if (i == pos) {
                end.next = result;
                System.out.println("end.next.val=" + end.next.val);
            }
        }

        return result;
    }
}