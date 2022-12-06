package com.eakonovalov.leetcode.BinaryTreeTraversal.dfs.preorder;

import com.eakonovalov.leetcode.BinaryTreeTraversal.Solution;
import com.eakonovalov.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class RecursiveSolution implements Solution {

    private final List<Integer> result = new ArrayList<>();

    @Override
    public List<Integer> traverse(TreeNode root) {
        if (root != null) {
            result.add(root.val);
            traverse(root.left);
            traverse(root.right);
        }

        return result;
    }
}
