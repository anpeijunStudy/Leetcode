package leetcode._100._142;

/**
 * 环形链表的入口
 */
public class _142 {
}


class Solution {

/*    // 使用哈希表
    public ListNode detectCycle(ListNode head) {

        HashSet<ListNode> set = new HashSet<>();

        while (head != null) {
            if (!set.add(head)) {
                return head;
            }
            head = head.next;
        }
        return null;
    }*/

    // 使用快慢指针
    public ListNode detectCycle(ListNode head) {

        // 定义临时节点和快慢指针
        ListNode fast = head, slow = head, temp = null;

        // 查看是否有环形链表
        while (true) {

            // 不是环形链表
            if (fast == null || fast.next == null) {
                return null;
            }

            slow = slow.next;
            fast = fast.next.next;

            // 快慢指针相等
            if (slow == fast) {
                break;
            }
        }

        temp = head;
        // 临时指针与慢指针相等的时候
        while (slow != temp) {
            temp = temp.next;
            slow = slow.next;
        }

        return temp;
    }

    // 使用快慢指针
/*    public ListNode detectCycle(ListNode head) {
        ListNode fast = head, slow = head;
        while (true) {
            if (fast == null || fast.next == null) return null;
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) break;
        }
        fast = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return fast;
    }*/
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}
