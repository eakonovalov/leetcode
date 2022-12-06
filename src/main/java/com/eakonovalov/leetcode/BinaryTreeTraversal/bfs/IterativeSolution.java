package com.eakonovalov.leetcode.BinaryTreeTraversal.bfs;

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

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        TreeNode current;
        while (!queue.isEmpty()) {
            current = queue.poll();
            result.add(current.val);
            if (current.left != null) {
                queue.add(current.left);
            }
            if (current.right != null) {
                queue.add(current.right);
            }
        }

        return result;
    }
}
