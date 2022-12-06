package com.eakonovalov.leetcode.common;

import java.util.Deque;
import java.util.LinkedList;

public class BinaryTreeTraversalTest {

    public TreeNode create(Integer[] values) {
        TreeNode root = new TreeNode(values[0]);
        Deque<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        for (int i = 1; i < values.length; i = i + 2) {
            TreeNode n = queue.poll();
            assert n != null;
            Integer leftValue = values[i];
            Integer rightValue = values.length > i + 1 ? values[i + 1] : null;
            if (leftValue != null) {
                n.left = new TreeNode(leftValue);
                queue.add(n.left);
            }
            if (rightValue != null) {
                n.right = new TreeNode(rightValue);
                queue.add(n.right);
            }
        }

        return root;
    }
}
