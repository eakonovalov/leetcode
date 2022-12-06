package com.eakonovalov.leetcode.BinaryTreeTraversal.dfs.postorder;

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
            traverse(root.right);
            result.add(root.val);
        }

        return result;
    }
}
