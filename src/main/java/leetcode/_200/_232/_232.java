package leetcode._200._232;


import java.util.Stack;

public class _232 {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();

//        Stack<Integer> stack = new Stack<>();
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//        stack.push(4);
//        System.out.println(stack.pop());
//        stack.push(5);
//        System.out.println(stack.pop());


        myQueue.push(1);
        myQueue.push(2);

        System.out.println(myQueue.pop());
        myQueue.push(5);
        System.out.println(myQueue.pop());

    }
}

class MyQueue {
    Stack<Integer> stackPush;
    Stack<Integer> stackPop;

    public MyQueue() {
        stackPush = new Stack<>();
        stackPop = new Stack<>();
    }

    // 入栈
    public void push(int x) {
        stackPush.push(x);
    }

    // 出栈
    public int pop() {
        if (stackPop.empty()) {
            while (!stackPush.empty()) {
                stackPop.push(stackPush.pop());
            }
        }
        return stackPop.pop();
    }

    public int peek() {
        if (stackPop.isEmpty()) {
            while (!stackPush.empty()) {
                stackPop.push(stackPush.pop());
            }
        }
        return stackPop.peek();
    }

    public boolean empty() {
        return stackPush.isEmpty() && stackPop.isEmpty();
    }
}
