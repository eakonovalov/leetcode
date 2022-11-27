package com.eakonovalov.leetcode._9_PalindromeNumber;

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
        solutions.add(new StringSolution());
    }

    @Test
    void isPalindrome() {
        int[] x =            {121,   123};
        boolean[] expected = {true,  false};

        for (Solution solution : solutions) {
            for (int i = 0; i < x.length; i++) {
                assertEquals(expected[i], solution.isPalindrome(x[i]));
            }
        }
    }
}