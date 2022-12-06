package com.eakonovalov.leetcode.BinaryTreeTraversal.dfs.inorder;

import com.eakonovalov.leetcode.BinaryTreeTraversal.Solution;
import com.eakonovalov.leetcode.common.TreeNode;

import java.util.*;

public class IterativeSolution implements Solution {

    @Override
    public List<Integer> traverse(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Deque<TreeNode> stack = new LinkedList<>();

        TreeNode current = root;
        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }

            TreeNode top = stack.pop();
            result.add(top.val);
            current = top.right;
        }

        return result;
    }
}
