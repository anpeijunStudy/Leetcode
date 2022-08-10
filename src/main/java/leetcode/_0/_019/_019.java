package leetcode._0._019;

public class _019 {
}


class Solution {

    /**
     * 删除链表的倒数第 N 个结点
     * 使用快慢指针来解决
     *
     * @param head 根结点
     * @param n    倒数索引
     * @return 移除之后的节点
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {

        // 定义之前节点和遍历节点
        ListNode pre = new ListNode(0);
        pre.next = head;
        ListNode a = pre, b = pre;

        for (int i = 0; i < n; i++) {
            a = a.next;
        }
        while (a.next != null) {
            a = a.next;
            b = b.next;
        }

        b.next = b.next.next;
        return pre.next;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
