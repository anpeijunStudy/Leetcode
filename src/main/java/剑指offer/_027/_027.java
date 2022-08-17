package 剑指offer._027;

/**
 * @author anpeijun
 * @version 1.0
 * @description 二叉树的镜像
 * @date 2022/08/16/21:35
 */
public class _027 {
}


class Solution {

    /**
     * 二叉树的镜像
     *
     * @param root 链表
     * @return 新节点
     */
    public TreeNode mirrorTree(TreeNode root) {
        // 递归交换左右节点

        // 为空返回
        if (root == null) return null;

        // 递归交换
        // 存储左节点或者是右节点
        TreeNode temp = root.left;

        // 交换节点
        root.left = mirrorTree(root.right);
        root.right = mirrorTree(temp);

        return root;
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
