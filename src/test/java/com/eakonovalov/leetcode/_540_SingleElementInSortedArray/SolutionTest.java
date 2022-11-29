package com.eakonovalov.leetcode._540_SingleElementInSortedArray;

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
    void singleNonDuplicate() {
        for (Solution solution : solutions) {
            //assertEquals(2, solution.singleNonDuplicate(new int[]{1, 1, 2, 3, 3, 4, 4, 8, 8}));
            //assertEquals(10, solution.singleNonDuplicate(new int[]{3, 3, 7, 7, 10, 11, 11}));
            //assertEquals(2, solution.singleNonDuplicate(new int[]{1, 1, 2, 3, 3}));
            //assertEquals(2, solution.singleNonDuplicate(new int[]{1, 1, 2}));
            assertEquals(1, solution.singleNonDuplicate(new int[]{1, 2, 2, 3, 3}));
        }
    }
}