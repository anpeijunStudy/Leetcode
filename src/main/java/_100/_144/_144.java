package _100._144;


import java.util.ArrayList;
import java.util.List;

/**
 * 二叉树前序遍历
 */
public class _144 {
}
class Solution {
    /**
     * 递归前序遍历
     *
     * @param root 结点
     * @return 遍历结果
     */
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        preorder(root, list);
        return list;
    }

    /**
     * 递归遍历前序
     *
     * @param root 结点
     * @param list 结果集合
     */
    private void  preorder(TreeNode root, ArrayList<Integer> list) {
        if (root == null) {
            return;
        }

        list.add(root.val);

        if (root.left != null) {
            preorder(root.left, list);
        }

        if (root.right != null) {
            preorder(root.right, list);
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
