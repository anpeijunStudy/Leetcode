package 剑指offer._009;


import java.util.Stack;

/**
 * 两个栈实现队列
 */
public class _009 {
}

class CQueue {

    Stack<Integer> stack1, stack2;

    public CQueue() {
        stack1 = new Stack<Integer>();
        stack2 = new Stack<Integer>();
    }


    /**
     * 队列
     *
     * @param value
     */
    public void appendTail(int value) {
        stack1.push(value);

    }

    public int deleteHead() {
        // 判断stack2是否为空
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        if (stack2.isEmpty()) {
            return -1;
        }
        return stack2.pop();
    }
}
