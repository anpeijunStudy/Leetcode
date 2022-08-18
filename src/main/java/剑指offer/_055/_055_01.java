package 剑指offer._055;


import java.util.LinkedList;

/**
 * @author anpeijun
 * @version 1.0
 * @description 二叉树的深度
 * @date 2022/08/18/15:35
 */
public class _055_01 {
}

class Solutiona {

    /**
     * 二叉树的深度
     *
     * @param root
     * @return
     */
/*    public int maxDepth(TreeNode root) {

        // 深度遍历
        if (root == null) return 0;

        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }*/
    public int maxDepth(TreeNode root) {
        // 使用层序遍历的方式存储层数
        LinkedList<TreeNode> queen = new LinkedList<>();

        queen.add(root);

        int count = 0;
        // 层序遍历
        while (!queen.isEmpty()) {

            // 得到长度
            int size = queen.size();
            for (int i = 0; i < size; i++) {
                TreeNode poll = queen.poll();
                if (poll.left != null) {
                    queen.add(poll.left);
                }
                if (poll.right != null) {
                    queen.add(poll.right);
                }
            }
            count++;
        }
        return count;
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
