package 剑指offer._030;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

/**
 * @author anpeijun
 * @version 1.0
 * @description 包含min函数的栈
 * @date 2022/08/17/15:43
 */
public class _030 {
}

class MinStack {

    private Deque<Integer> minStack, stack;

    /**
     * initialize your data structure here.
     */
    public MinStack() {
        stack = new LinkedList<Integer>();
        minStack = new LinkedList<Integer>();
    }

    public void push(int x) {
        stack.push(x);
        if (minStack.isEmpty()||minStack.peek()>=x){
            minStack.push(x);
        }
    }

    public void pop() {

        // 满足最小值栈相等弹出
        if (stack.pop().equals(minStack.peek())) {
            minStack.pop();
        }

    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        return minStack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.min();
 */
