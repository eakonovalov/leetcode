package com.eakonovalov.leetcode._1480_RunningSumOf1DArray;

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
    void runningSum() {
        int[] nums = {3, 1, 2, 10, 1};
        int[] expected = {3, 4, 6, 16, 17};
        for (Solution solution : solutions) {
            assertArrayEquals(expected, solution.runningSum(nums));
        }
    }
}