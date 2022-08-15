package leetcode._0._021;

/**
 * @author anpeijun
 * @version 1.0
 * @description 合并两个有序链表
 * @date 2022/08/15/13:54
 */
public class _021 {
}

class Solution {
    /**
     * 合并有序链表
     *
     * @param list1 链表1
     * @param list2 链表2
     * @return 新链表
     */
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // 使用递归来进行合并

        // 判断为空条件-跳出递归
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        if (list1.val < list2.val) {
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeTwoLists(list2.next, list1);
            return list2;
        }
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

