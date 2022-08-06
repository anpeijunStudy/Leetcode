package 剑指offer._018;


import java.util.LinkedList;

/**
 * 删除节点
 */
public class _018 {
}

class Solution {
    public ListNode deleteNode(ListNode head, int val) {

        if (head.val == val) {
            return head.next;
        }
        // 定义一个临时节点
        ListNode temp = head;
        ListNode pre = null;
        // 循环查找
        while (temp != null) {
            if (temp.val == val) {
                break;
            }
            pre = temp;
            temp = temp.next;
        }
        pre.next = temp.next;
        return head;
    }
}


class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
