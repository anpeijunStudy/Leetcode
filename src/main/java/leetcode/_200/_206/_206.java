package leetcode._200._206;

public class _206 {
}

class Solution {
    public ListNode reverseList(ListNode head) {
        // 定义反转链表
        ListNode prev = null;
        // 定义临时链表
        ListNode curr = head;

        while (curr != null) {
            // 存放当前链表的后续链表，防止断裂
            ListNode next = curr.next;

            // 将存放当前链表存放到反转链表之前
            curr.next = prev;

            // 存放当前链表 指向 反转列表
            prev = curr;

            // 回归
            curr = next;
        }
        return prev;
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
