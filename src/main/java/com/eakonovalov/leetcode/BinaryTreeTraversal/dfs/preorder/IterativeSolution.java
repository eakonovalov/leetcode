package com.eakonovalov.leetcode.BinaryTreeTraversal.dfs.preorder;

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

        TreeNode current;
        while(!stack.isEmpty()) {
            current = stack.pop();
            result.add(current.val);

            if(current.right != null) {
                stack.push(current.right);
            }
            if(current.left != null) {
                stack.push(current.left);
            }
        }

        return result;
    }
}
