package com.eakonovalov.leetcode.BinaryTreeTraversal.dfs.postorder;

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
        stack.push(root);

        TreeNode prev = root;
        TreeNode current;
        while (!stack.isEmpty()) {
            current = stack.peek();
            boolean hasChild = (current.left != null || current.right != null);
            boolean isPrevLastChild = (prev == current.right ||
                    (prev == current.left && current.right == null));

            if (!hasChild || isPrevLastChild) {
                current = stack.pop();
                result.add(current.val);
                prev = current;
            } else {
                if (current.right != null) {
                    stack.push(current.right);
                }
                if (current.left != null) {
                    stack.push(current.left);
                }
            }
        }

        return result;
    }
}
