package com.eakonovalov.leetcode._205_IsomorphicStrings;

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
    void isIsomorphic() {
        for (Solution solution : solutions) {
            assertTrue(solution.isIsomorphic("paper", "title"));
            assertFalse(solution.isIsomorphic("badc", "baba"));
        }
    }
}