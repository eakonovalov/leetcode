package com.eakonovalov.leetcode._102_BinaryTreeLevelOrderTraversal;

import com.eakonovalov.leetcode.common.BinaryTreeTraversalTest;
import org.junit.jupiter.api.Test;

import static java.util.List.of;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest extends BinaryTreeTraversalTest {

    @Test
    void levelOrder() {
        assertEquals(of(of(3), of(9, 20), of(15, 7)), new MyLinkedListSolution().levelOrder(create(new Integer[]{3, 9, 20, null, null, 15, 7})));
    }
}
