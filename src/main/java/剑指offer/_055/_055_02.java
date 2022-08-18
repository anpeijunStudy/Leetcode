package 剑指offer._055;

/**
 * @author anpeijun
 * @version 1.0
 * @description 平衡二叉树
 * @date 2022/08/18/15:54
 */
public class _055_02 {
}

class Solution {

    /**
     * 平衡二叉树
     *
     * @param root
     * @return
     */
    public boolean isBalanced(TreeNode root) {

        if (root == null) return true;
        return Math.abs(maxDepth(root.left) - maxDepth(root.right)) <= 1&&isBalanced(root.left)&&isBalanced(root.right);
    }

    /**
     * 求出深度
     * @param root
     * @return
     */
    public int maxDepth(TreeNode root) {
        // 深度遍历
        if (root == null) return 0;
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}
