package com.eakonovalov.leetcode._98_ValidateBinarySearchTree;

import com.eakonovalov.leetcode.common.TreeNode;

public class RecursiveWithValidRangeSolution implements Solution {

    private boolean validate(TreeNode root, Integer lo, Integer hi) {
        if (root == null) {
            return true;
        }
        if (lo != null && root.val <= lo) {
            return false;
        }
        if (hi != null && root.val >= hi) {
            return false;
        }

        return validate(root.left, lo, root.val) && validate(root.right, root.val, hi);
    }

    public boolean isValidBST(TreeNode root) {
        return validate(root, null, null);
    }
}
