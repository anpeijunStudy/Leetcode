package leetcode._100._101;

/**
 * @author anpeijun
 * @version 1.0
 * @description 对称二叉树
 * @date 2022/08/15/16:57
 */
public class _101 {
}

class Solution {


    public boolean isSymmetric(TreeNode root) {

        // 递归对比
        return recursionContrast(root, root);
    }

    private boolean recursionContrast(TreeNode l1, TreeNode l2) {

        if (l1 == null && l2 == null) return true;
        if (l1 == null || l2 == null) return false;

        return (l1.val == l2.val) && (recursionContrast(l1.left, l2.right)) && (recursionContrast(l1.right, l2.left));
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
