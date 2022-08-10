package leetcode._100._145;


import java.util.ArrayList;
import java.util.List;

/**
 * 后续遍历
 */
public class _145 {
}

class Solution {
    /**
     * 递归后序遍历
     *
     * @param root 结点
     * @return 遍历结果
     */
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        epiloguer(root, list);
        return list;
    }

    /**
     * 递归后历中序
     *
     * @param root 结点
     * @param list 结果集合
     */
    private void epiloguer(TreeNode root, ArrayList<Integer> list) {
        if (root == null) {
            return;
        }
        if (root.left != null) {
            epiloguer(root.left, list);
        }

        if (root.right != null) {
            epiloguer(root.right, list);
        }
        list.add(root.val);

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
