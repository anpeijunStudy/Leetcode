package leetcode._0._100;

/**
 * @author anpeijun
 * @version 1.0
 * @description 求相同树
 * @date 2022/08/12/12:25
 */
public class _100 {
}


class Solution {

    /**
     * 求相同树
     *
     * @param p a树
     * @param q b树
     * @return 比较结果
     */
    public boolean isSameTree(TreeNode p, TreeNode q) {

        // 树为空
        if (p == null && q == null) {
            return true;
        }
        // 树不相等
        if (p == null || q == null) {
            return false;
        }
        // 值不相等
        if (p.val != q.val) {
            return false;
        }
        // 深度遍历
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
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
