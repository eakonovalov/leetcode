package com.eakonovalov.leetcode._7_ReverseInteger;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    private final List<Solution> solutions = new ArrayList<>();

    @BeforeEach
    void beforeEach() {
        solutions.add(new MathSolution());
    }

    @Test
    void reverse() {
        int[] x =        {321,   1534236469, -2147483648, -1563847412, 1463847412};
        int[] expected = {123,   0,           0,           0,          2147483641};

        for (Solution solution : solutions) {
            for (int i = 0; i < x.length; i++) {
                assertEquals(expected[i], solution.reverse(x[i]));
            }
        }
    }
}
