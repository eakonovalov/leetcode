package com.eakonovalov.leetcode._21_MergeTwoSortedLists;

import com.eakonovalov.leetcode.common.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void mergeTwoLists() {
        ListNode l1 = create(new int[]{1, 2, 4});
        ListNode l2 = create(new int[]{1, 3, 4});
        int[] expected = {1, 1, 2, 3, 4, 4};

        ListNode result = new MySolution().mergeTwoLists(l1, l2);

        int i = 0;
        while (result != null) {
            assertEquals(expected[i], result.val);
            result = result.next;
            i++;
        }
    }

    @Test
    void mergeTwoLists2() {
        ListNode l1 = create(new int[]{2});
        ListNode l2 = create(new int[]{1});
        int[] expected = new int[]{1, 2};

        ListNode result = new MySolution().mergeTwoLists(l1, l2);

        int i = 0;
        while (result != null) {
            assertEquals(expected[i], result.val);
            result = result.next;
            i++;
        }
    }

    @Test
    void mergeTwoLists3() {
        ListNode l1 = create(new int[]{5});
        ListNode l2 = create(new int[]{1, 2, 4});
        int[] expected = new int[]{1, 2, 4, 5};

        ListNode result = new MySolution().mergeTwoLists(l1, l2);

        int i = 0;
        while (result != null) {
            assertEquals(expected[i], result.val);
            result = result.next;
            i++;
        }
    }

    @Test
    void mergeTwoLists4() {
        ListNode l1 = create(new int[]{-9, 3});
        ListNode l2 = create(new int[]{5, 7});
        int[] expected = new int[]{-9, 3, 5, 7};

        ListNode result = new MySolution().mergeTwoLists(l1, l2);

        int i = 0;
        while (result != null) {
            assertEquals(expected[i], result.val);
            result = result.next;
            i++;
        }
    }

    @Test
    void mergeTwoLists5() {
        ListNode l1 = create(new int[]{-8, 2, 3});
        ListNode l2 = create(new int[]{-4});
        int[] expected = new int[]{-8, -4, 2, 3};

        ListNode result = new MySolution().mergeTwoLists(l1, l2);

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