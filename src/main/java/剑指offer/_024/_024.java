package 剑指offer._024;


import java.util.List;

/**
 * 反转链表
 */
public class _024 {
}

class Solution {

    /**
     * 反转链表
     *
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head) {

        // 定义一个交换节点
        ListNode reversal = null;
        // 临时节点
        ListNode temp = head;

        while (temp != null) {
            ListNode cur = temp;

            temp.next = reversal;
            reversal = temp;

            temp = cur.next;
        }
        return reversal;
    }

}


class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
