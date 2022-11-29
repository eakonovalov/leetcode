package com.eakonovalov.leetcode._724_FindPivotIndex;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    private final List<Solution> solutions = new ArrayList<>();

    @BeforeEach
    void beforeEach() {
        solutions.add(new MySolution());
    }

    @Test
    void pivotIndex() {
        int[] nums = {1, 7, 3, 6, 5, 6};
        int[] nums2 = {2, 1, -1};
        int[] nums3 = {-1, -1, 0, 0, -1, -1};
        int[] nums4 = {-1, -1, 0, 1, 1, 0};
        for (Solution solution : solutions) {
            assertEquals(3, solution.pivotIndex(nums));
            assertEquals(0, solution.pivotIndex(nums2));
            assertEquals(2, solution.pivotIndex(nums3));
            assertEquals(5, solution.pivotIndex(nums4));
        }
    }
}