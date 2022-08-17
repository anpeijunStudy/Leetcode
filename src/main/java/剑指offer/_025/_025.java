package 剑指offer._025;

/**
 * @author anpeijun
 * @version 1.0
 * @description TODO
 * @date 2022/08/16/20:21
 */
public class _025 {
}

class Solution {


    /**
     * 排序链表
     *
     * @param l1 链表1
     * @param l2 链表2
     * @return 新链表
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        // 判断链表是否为空-当递归的链表为空的时候返回不为空的链表
        if (l1 == null) return l2;

        if (l2 == null) return l1;

        // 比较大小-递归链接
        if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l2.next, l1);
            return l2;
        }
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

