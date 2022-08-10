package leetcode._100._141;


import java.util.HashSet;

/**
 * 判断链表是否为环形
 */
public class _141 {
}

class Solution {
    /*public boolean hasCycle(ListNode head) {

        // 使用快慢指针解决问题
        ListNode fast = head, slow = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            // 快慢指针相等
            if (slow.equals(fast)) {
                return true;
            }
        }

        return false;
    }*/

    public boolean hasCycle(ListNode head) {
        // 使用哈希表解决
        HashSet<ListNode> listNodes = new HashSet<ListNode>();

        while (head != null) {
            if (!listNodes.add(head)) {
                return true;
            }
            head = head.next;

        }
        return false;
    }

}


class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}
