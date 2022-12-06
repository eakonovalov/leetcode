package com.eakonovalov.leetcode._98_ValidateBinarySearchTree;

import com.eakonovalov.leetcode.common.TreeNode;

public class RecursiveInorderSolution implements Solution {

    private Integer previous;

    @Override
    public boolean isValidBST(TreeNode root) {
        return inorder(root);
    }

    private boolean inorder(TreeNode current) {
        if (current == null) {
            return true;
        }
        if (!inorder(current.left)) {
            return false;
        }
        if (previous != null && current.val <= previous) {
            return false;
        }
        previous = current.val;

        return inorder(current.right);
    }
}
