package com.eakonovalov.leetcode._79_WordSearch;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {

    private final List<Solution> solutions = new ArrayList<>();

    @BeforeEach
    void beforeEach() {
        solutions.add(new MySolution());
    }

    @Test
    void exist() {
        char[][] board1 = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        char[][] board2 = {{'a', 'a'}};
        char[][] board3 = {{'A','B','C','E'},{'S','F','E','S'},{'A','D','E','E'}};
        String word1 = "ABCB";
        String word2 = "SEE";
        String word3 = "ABCCED";
        String word4 = "aaa";
        String word5 =  "ABCESEEEFS";

        for (Solution solution : solutions) {
            assertFalse(solution.exist(board1, word1));
            assertTrue(solution.exist(board1, word2));
            assertTrue(solution.exist(board1, word3));
            assertFalse(solution.exist(board2, word4));
            assertTrue(solution.exist(board3, word5));
        }
    }
}