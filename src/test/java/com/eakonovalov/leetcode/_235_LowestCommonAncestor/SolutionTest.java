package com.eakonovalov.leetcode._235_LowestCommonAncestor;

import com.eakonovalov.leetcode.common.BinaryTreeTraversalTest;
import com.eakonovalov.leetcode.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest extends BinaryTreeTraversalTest {

    @Test
    void lowestCommonAncestor() {
        TreeNode root = create(new Integer[]{6, 2, 8, 0, 4, 7, 9, null, null, 3, 5});
        //assertEquals(new TreeNode(2), new MySolution().lowestCommonAncestor(root, new TreeNode(0), new TreeNode(5)));
        //assertEquals(new TreeNode(6), new MySolution().lowestCommonAncestor(root, new TreeNode(2), new TreeNode(8)));
        assertEquals(new TreeNode(2), new MySolution().lowestCommonAncestor(create(new Integer[]{2, 1}), new TreeNode(2), new TreeNode(1)));
    }
}
