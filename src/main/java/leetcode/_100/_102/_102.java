package leetcode._100._102;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 二叉树的层序遍历
 */
public class _102 {
}

class Solution {

    /**
     * 二叉树的层序遍历
     *
     * @param root 结点
     * @return
     */
    public List<List<Integer>> levelOrder(TreeNode root) {

        // 存储结果
        ArrayList<List<Integer>> lists = new ArrayList<>();
        // 创建队列-存放每一层节点
        LinkedList<TreeNode> queen = new LinkedList<>();

        // 头结点是否为空
        if (root == null) {
            return lists;
        }

        // 将头结点加入到队列中
        queen.add(root);

        // 循环弹出队列中的数
        while (queen.size() > 0) {
            int size = queen.size();
            ArrayList<Integer> list = new ArrayList<>();

            // 队列中此时存储的是每一层结点的个数
            for (int i = 0; i < size; i++) {

                // 弹出节点
                TreeNode pop = queen.poll();
                list.add(pop.val);

                // 判断节点的左右节点
                if (pop.left != null) {
                    queen.add(pop.left);
                }
                if (pop.right != null) {
                    queen.add(pop.right);
                }
            }
            // 添加每一层的循环
            lists.add(list);
        }
        return lists;
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
