package 剑指offer._028;

/**
 * @author anpeijun
 * @version 1.0
 * @description 对称的二叉树
 * @date 2022/08/16/21:19
 */
public class _028 {
}

class Solution {

    /**
     * 对称的二叉树
     *
     * @param root 比较的二叉树
     * @return 是否相对
     */
    public boolean isSymmetric(TreeNode root) {
        return symmetry(root, root);
    }

    private boolean symmetry(TreeNode l1, TreeNode l2) {
        if (l1 == null && l2 == null) return true;
        if (l1 == null || l2 == null) return false;

        return (l1.val == l2.val)
                && (symmetry(l1.left, l2.right))
                && (symmetry(l1.right, l2.left));

    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}
