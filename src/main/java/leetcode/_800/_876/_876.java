package leetcode._800._876;

public class _876 {
}


class Solution {

    /**
     * 返回中间节点
     *
     * @param head 头结点
     * @return 中间节点
     */
    public ListNode middleNode(ListNode head) {
        // 定义快慢指针，快指针移动两次，慢指针移动一次
        ListNode fast = head, slow = head, temp = head;
        // 定义临时指针
        while (fast.next != null) {
            slow = temp.next;
            fast = temp.next.next;
        }

        // 如果是偶数，返回的也是第二个节点
        return slow;
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
