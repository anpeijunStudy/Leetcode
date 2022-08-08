package 剑指offer._032;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 二叉树层序遍历
 */
public class _032 {
}

class Solution {

    /**
     * 层序遍历二叉树
     *
     * @param root 根结点
     * @return 数组集合
     */
    public List<List<Integer>> levelOrder(TreeNode root) {

        ArrayList<List<Integer>> lists = new ArrayList<>();
        // 使用栈压入每一层的节点
        LinkedList<TreeNode> treeNodes = new LinkedList<TreeNode>();
        // 头结点是否为空
        if (root == null) {
            return lists;
        }
        //加入头结点
        treeNodes.offer(root);

        while (treeNodes.size() > 0) {
            int size = treeNodes.size();
            ArrayList<Integer> list = new ArrayList<>();
            // 每一层的依次出队列
            for (int i = 0; i < size; i++) {
                // 出队列
                TreeNode poll = treeNodes.poll();
                list.add(poll.val);
                if (poll.left != null) {
                    treeNodes.offer(poll.left);
                }
                if (poll.right != null) {
                    treeNodes.offer(poll.right);
                }
            }
            lists.add(list);
        }
        return lists;
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

