package com.eakonovalov.leetcode._98_ValidateBinarySearchTree;

import com.eakonovalov.leetcode.common.TreeNode;

import java.util.Deque;
import java.util.LinkedList;

public class IterativeInorderSolution implements Solution {

    @Override
    public boolean isValidBST(TreeNode root) {
        Deque<TreeNode> stack = new LinkedList<>();
        Integer previous = null;

        while (!stack.isEmpty() || root != null) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            if (previous != null && root.val <= previous) {
                return false;
            }
            previous = root.val;
            root = root.right;
        }

        return true;
    }
}
