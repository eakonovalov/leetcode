package com.eakonovalov.leetcode._235_LowestCommonAncestor;

import com.eakonovalov.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class MySolution implements Solution {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root.val == p.val || root.val == q.val) {
            return root;
        }
        List<TreeNode> path1 = find(root, p);
        List<TreeNode> path2 = find(root, q);
        int i;
        for (i = 0; i < (path1.size() > path2.size() ? path1 : path2).size(); i++) {
            if (path1.get(i) != path2.get(i)) {
                break;
            }
        }

        return path1.get(i - 1);
    }

    private List<TreeNode> find(TreeNode root, TreeNode node) {
        List<TreeNode> path = new ArrayList<>();
        while (root != null && root.val != node.val) {
            path.add(root);
            if (node.val < root.val) {
                root = root.left;
            } else {
                root = root.right;
            }
        }
        path.add(root);

        return path;
    }
}
