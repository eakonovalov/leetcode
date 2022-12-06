package com.eakonovalov.leetcode.BinaryTreeTraversal.bfs;

import com.eakonovalov.leetcode.BinaryTreeTraversal.Solution;
import com.eakonovalov.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class RecursiveSolution implements Solution {

    private final List<Integer> result = new ArrayList<>();

    @Override
    public List<Integer> traverse(TreeNode root) {
        if (root != null) {
            traverse(List.of(root), result);
        }

        return result;
    }

    private void traverse(List<TreeNode> level, List<Integer> result) {
        List<TreeNode> next = new ArrayList<>();
        for (TreeNode node : level) {
            result.add(node.val);
            if (node.left != null) {
                next.add(node.left);
            }
            if (node.right != null) {
                next.add(node.right);
            }
        }
        if (next.size() > 0) {
            traverse(next, result);
        }
    }
}
