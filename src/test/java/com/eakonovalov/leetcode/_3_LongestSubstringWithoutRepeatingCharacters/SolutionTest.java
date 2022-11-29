package com.eakonovalov.leetcode._3_LongestSubstringWithoutRepeatingCharacters;

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
    void lengthOfLongestSubstring() {
        for (Solution solution : solutions) {
            assertEquals(3, solution.lengthOfLongestSubstring("abcabcbb"));
            assertEquals(1, solution.lengthOfLongestSubstring(" "));
            assertEquals(1, solution.lengthOfLongestSubstring("au"));
        }
    }
}