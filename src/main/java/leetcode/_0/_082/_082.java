package leetcode._0._082;

import javax.xml.soap.Node;

/**
 * @author anpeijun
 * @version 1.0
 * @description 删除排序链表中的重复元素 II
 * @date 2022/08/12/15:27
 */
public class _082 {
}

class Solution {

    /**
     * 给定一个已排序的链表的头 head ，
     * 删除原始链表中所有重复数字的节点，只留下不同的数字 。返回 已排序的链表 。
     *
     * @param head 根节点
     * @return 新链表
     */
    public ListNode deleteDuplicates(ListNode head) {

        // 判断
        if (head == null) {
            return null;
        }

        // 创建一个头结点为空的链表-定义临时节点
        ListNode listNode = new ListNode(0, head);
        ListNode temp = listNode;

        while (temp.next != null && temp.next.next != null) {
            // 上面的是用来比较并且调换temp.next的属性
            if (temp.next.val == temp.next.next.val) {
                int val = temp.next.val;
                while (temp.next != null && temp.next.val == val) {
                    temp.next = temp.next.next;
                }
            } else {
                temp = temp.next;
            }
        }
        return listNode.next;
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
