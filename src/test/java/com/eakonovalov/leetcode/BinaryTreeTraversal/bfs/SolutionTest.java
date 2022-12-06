package com.eakonovalov.leetcode.BinaryTreeTraversal.bfs;

import com.eakonovalov.leetcode.common.BinaryTreeTraversalTest;
import org.junit.jupiter.api.Test;

import static java.util.List.of;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest extends BinaryTreeTraversalTest {

    @Test
    void traverse() {
        assertEquals(of(4, 2, 8, 1, 3, 7, 9), new IterativeSolution().traverse(create(new Integer[]{4, 2, 8, 1, 3, 7, 9})));
        assertEquals(of(4, 2, 8, 1, 3, 7, 9), new RecursiveSolution().traverse(create(new Integer[]{4, 2, 8, 1, 3, 7, 9})));
    }
}
