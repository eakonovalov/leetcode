package com.eakonovalov.leetcode._98_ValidateBinarySearchTree;

import com.eakonovalov.leetcode.common.BinaryTreeTraversalTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest extends BinaryTreeTraversalTest {

    @Test
    void isValidBST() {
        assertTrue(new MySolution().isValidBST(create(new Integer[]{4, 2, 8, 1, 3, 7, 9})));
    }
}
