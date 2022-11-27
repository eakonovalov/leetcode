package com.eakonovalov.leetcode._2_AddTwoNumbers;

import com.eakonovalov.leetcode._2_AddTwoNumbers.Solution.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final List<Solution> solutions = new ArrayList<>();

    @BeforeEach
    void beforeEach() {
        solutions.add(new MySolution());
    }

    @Test
    void addTwoNumbers() {
        ListNode l1 = create(new int[] {9, 9, 9, 9, 9, 9, 9});
        ListNode l2 = create(new int[] {9, 9, 9, 9});
        int[] expected = {8, 9, 9, 9, 0, 0, 0, 1};

        for (Solution solution : solutions) {
            ListNode result = solution.addTwoNumbers(l1, l2);

            int i = 0;
            while (result != null) {
                assertEquals(expected[i], result.val);
                result = result.next;
                i++;
            }
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