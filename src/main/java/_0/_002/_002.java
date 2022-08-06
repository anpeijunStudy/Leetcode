package _0._002;


/**
 * 两数相加
 */
public class _002 {
}


class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        // 新指针，存放结果
        ListNode pre = new ListNode(0);
        // 临时指针
        ListNode cur = pre;
        // 进位数
        int carry = 0;
        // 循环遍历-两个链表只要有一个不为空就继续
        while (l1 != null || l2 != null) {

            // 链表为空就为0
            int x = l1 == null ? 0 : l1.val;
            int y = l2 == null ? 0 : l2.val;

            // 计算结果
            int sum = x + y + carry;

            // 得出计算之后的进位数
            carry = sum / 10;
            // 得到计算结果的个位数
            sum %= 10;

            // 构建节点
            cur.next = new ListNode(sum);

            // 节点下移
            cur = cur.next;

            // 链表后移
            if (l1 != null)
                l1 = l1.next;
            if (l2 != null)
                l2 = l2.next;

        }
        // 是否还存在一个数
        if (carry == 1) {
            cur.next = new ListNode(carry);
        }

        // 首节点为0
        return pre.next;

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
