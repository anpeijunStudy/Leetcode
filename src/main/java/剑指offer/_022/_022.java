package 剑指offer._022;

public class _022 {
}

class Solution {

    /**
     * 查找倒数第K个节点
     *
     * @param head
     * @param k
     * @return
     */
/*    public ListNode getKthFromEnd(ListNode head, int k) {

        // 首先计算链表的长度
        int length = 0;
        ListNode temp = head;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        temp = head;
        for (int i = 0; i < (length - k); i++) {
            temp = temp.next;
        }
        return temp;
    }*/

    /**
     * 使用两个指针来完成
     *
     * @param head
     * @param k
     * @return
     */
    public ListNode getKthFromEnd(ListNode head, int k) {
        // 节点a先走k步数，再和b节点一起走，b节点的next就是倒数k节点
        ListNode a = head, b = head;

        for (int i = 0; i < k; i++) {
            a = a.next;
        }

        while (a!=null){
            a=a.next;
            b=b.next;
        }

        return b;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
