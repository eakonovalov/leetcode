package com.eakonovalov.leetcode._13_RomanToInt;

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
        solutions.add(new MySolution2());
        solutions.add(new OptimalByComplexitySolution());
        solutions.add(new OptimalByComplexitySolution2());
    }

    @Test
    void romanToInt() {
        for (Solution solution : solutions) {
            assertEquals(19, solution.romanToInt("XIX"));
            assertEquals(69, solution.romanToInt("LXIX"));
        }
    }
}