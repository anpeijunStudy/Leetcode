package leetcode._0._094;


import java.util.ArrayList;
import java.util.List;

/**
 * 二叉树的中序遍历
 */
public class _094 {
}

class Solution {
    /**
     * 递归中序遍历
     *
     * @param root 结点
     * @return 遍历结果
     */
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        inorder(root, list);
        return list;
    }

    /**
     * 递归遍历中序
     *
     * @param root 结点
     * @param list 结果集合
     */
    private void inorder(TreeNode root, ArrayList<Integer> list) {
        if (root == null) {
            return;
        }
        if (root.left != null) {
            inorder(root.left, list);
        }
        list.add(root.val);

        if (root.right != null) {
            inorder(root.right, list);
        }
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
