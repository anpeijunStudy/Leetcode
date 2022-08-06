package 剑指offer._006;


import javax.xml.soap.Node;
import java.util.LinkedList;
import java.util.Stack;

/**
 * 逆序打印链表
 */
public class _006 {
}


class Solution {
    public int[] reversePrint(ListNode head) {

        // 使用栈的思想-把所有的压入栈
        Stack<Integer> stack = new Stack<>();
        ListNode temp = head;
        while (temp != null) {
            stack.push(temp.val);
            temp = temp.next;
        }

        int size = stack.size();
        int[] ints = new int[size];
        for (int i = 0; i < size; i++) {
            ints[i] = stack.pop();
        }

        return ints;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
