package leetcode._0._083;

import javax.xml.soap.Node;

/**
 * @author anpeijun
 * @version 1.0
 * @description 删除排序链表中的重复元素
 * @date 2022/08/12/14:22
 */
public class _083 {
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1, null);
        ListNode listNode2 = new ListNode(1, null);
        ListNode listNode3 = new ListNode(1, null);
        ListNode listNode4 = new ListNode(1, null);
        ListNode listNode5 = new ListNode(2, null);

        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;

        ListNode listNode = new Solution().deleteDuplicates(listNode1);


    }
}

class Solution {

    /**
     * 删除排序链表中的重复元素
     *
     * @param head 根节点
     * @return 新链表
     */

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;
        // 一次遍历
        ListNode temp = head;
        while (temp.next != null) {
            // 上面的是用来比较并且调换temp.next的属性
            if (temp.val == temp.next.val) {
                temp.next = temp.next.next;
            } else {
                // temp位移
                temp = temp.next;
            }
        }
        return head;
    }
    // 超出时间限制
    /*    public ListNode deleteDuplicates(ListNode head) {

        if (head == null) return null;
        // 新链表
        ListNode newHead = head;
        // 建立临时节点
        ListNode oldTemp = head, newTemp = newHead;

        // 遍历旧的链表
        while (oldTemp.next != null) {
            oldTemp = oldTemp.next;
            if (!(oldTemp.val == newTemp.val)) {
                newTemp = newTemp.next;
                oldTemp.next = oldTemp;
                oldTemp = oldTemp.next;
            }
            newTemp = newTemp.next;
        }
        return newHead;
    }*/
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

