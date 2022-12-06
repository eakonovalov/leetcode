package com.eakonovalov.leetcode.BinaryTreeTraversal.dfs.inorder;

import com.eakonovalov.leetcode.BinaryTreeTraversal.Solution;
import com.eakonovalov.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class RecursiveSolution implements Solution {

    private final List<Integer> result = new ArrayList<>();

    @Override
    public List<Integer> traverse(TreeNode root) {
        if (root != null) {
            traverse(root.left);
            result.add(root.val);
            traverse(root.right);
        }

        return result;
    }
}
