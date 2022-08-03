package _2000._2095;

public class _2095 {
}


class Solution {
    public ListNode deleteMiddle(ListNode head) {
        // 为空或者只有一个头结点
        if (head.next == null || head == null) {
            return null;
        }

        // 使用快慢指针查询中间节点
        // 使用pre代表慢指针的前面
        ListNode fast = head, slow = head, pre = null;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            pre = slow;
            slow = slow.next;
        }

        // pre指向slow的后一个，使slow断裂
        pre.next = pre.next.next;
        return head;
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
