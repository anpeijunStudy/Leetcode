package 剑指offer._052;

/**
 * @author anpeijun
 * @version 1.0
 * @description 两个链表的第一个公共节点
 * @date 2022/08/17/14:47
 */
public class _052 {
}


class Solution {

    /**
     * 两个链表的第一个公共节点
     *
     * @param headA
     * @param headB
     * @return
     */
    ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        // 定义临时节点
        ListNode l1 = headA, l2 = headB;

        // 遍历查找-两房的长度就相当了，此时只需要考虑是否相交，相交退出
        while (l1 != l2) {
            l1 = l1 == null ? headB : l1.next;
            l2 = l2 == null ? headA : l2.next;
        }

        return l2;
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

