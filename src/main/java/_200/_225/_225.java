package _200._225;


import java.util.LinkedList;
import java.util.Queue;

/**
 * 队列模拟栈
 */
public class _225 {
}

class MyStack {

    private Queue<Integer> queue;

    public MyStack() {
        queue = new LinkedList<>();
    }

    public void push(int x) {
        // 压入队列的时候交换顺序使之成为栈

        // 先得到队列的的大小
        int size = queue.size();

        queue.offer(x);

        for (int i = 0; i < size; i++) {
            queue.offer(queue.poll());
        }
    }

    public int pop() {
        return queue.poll();
    }

    public int top() {
        return queue.peek();
    }

    public boolean empty() {
        return queue.isEmpty();
    }
}

