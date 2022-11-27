package com.eakonovalov.leetcode._1_TwoSum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final List<Solution> solutions = new ArrayList<>();

    @BeforeEach
    void beforeEach() {
        solutions.add(new MySolution());
        solutions.add(new OptimalSolution());
    }

    @org.junit.jupiter.api.Test
    void twoSum() {
        int[] nums = {3, 3};
        int target = 6;

        for (Solution solution : solutions) {
            int[] result = solution.twoSum(nums, target);
            assertArrayEquals(result, new int[] {0, 1});
        }
    }
}
