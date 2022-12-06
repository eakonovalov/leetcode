package com.eakonovalov.leetcode._876_MiddleOfLinkedList;

import com.eakonovalov.leetcode.common.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void middleNode() {
        ListNode l = create(new int[]{1, 2, 3, 4, 5});
        int[] expected = {3, 4, 5};

        ListNode result = new FastSlowPointerSolution().middleNode(l);

        int i = 0;
        while (result != null) {
            assertEquals(expected[i], result.val);
            result = result.next;
            i++;
        }
    }

    private ListNode create(int[] arr) {
        ListNode result = null;
        for (int i = arr.length - 1; i >= 0; i--) {
            result = new ListNode(arr[i], result);
        }

        return result;
    }
}