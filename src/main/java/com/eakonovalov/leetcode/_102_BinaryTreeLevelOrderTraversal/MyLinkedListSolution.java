package com.eakonovalov.leetcode._102_BinaryTreeLevelOrderTraversal;

import com.eakonovalov.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyLinkedListSolution implements Solution {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        List<Integer> values = new ArrayList<>();
        values.add(root.val);
        result.add(values);

        List<TreeNode> level = new LinkedList<>();
        level.add(root);

        while (nextLevel(level).size() != 0) {
            values = new ArrayList<>();
            for (TreeNode n : level) {
                values.add(n.val);
            }
            result.add(values);
        }


        return result;
    }

    private List<TreeNode> nextLevel(List<TreeNode> nodes) {
        for (int i = nodes.size() - 1; i >= 0; i--) {
            TreeNode node = nodes.remove(i);
            if (node.right != null) {
                nodes.add(i, node.right);
            }
            if (node.left != null) {
                nodes.add(i, node.left);
            }
        }

        return nodes;
    }
}
