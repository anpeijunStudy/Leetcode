package datastructure.linear;

import java.util.Iterator;

/**
 * @author anpeijun
 * @version 1.0
 * @description 双向链表
 * @date 2022/08/10/17:32
 */
public class DoubleLinkedList<T> implements Iterable<T> {


    /**
     * 头结点
     */
    private Node head;

    /**
     * 尾结点
     */
    private Node last;

    /**
     * 链表的长度
     */
    private int N;

    public DoubleLinkedList() {
        this.head = new Node(null, null, null);
        this.last = head;
        this.N = 0;
    }

    /**
     * 链表为空状态
     *
     * @return 为空状态
     */
    public boolean isEmpty() {
        return N == 0;
    }

    /**
     * 链表置空
     */
    public void clear() {
        last = null;
        head.next = last;
        head.pre = null;
        head.item = null;

        this.N = 0;
    }

    /**
     * 链表长度
     *
     * @return 链表长度
     */
    public int size() {
        return N;
    }

    /**
     * 插入元素
     */
    public void insert(T t) {

        // 尾结点为空
        if (last == null) {
            last = new Node(t, head, null);
            head.next = last;
        } else {

            // 得到尾结点
            Node oldNode = last;

            // 得到新的节点
            Node newNode = new Node(t, oldNode, null);
            oldNode.next = newNode;
            last = newNode;
        }
        N++;
    }

    /**
     * 指定位置插入元素
     */
    public void insert(int index, T t) {

        // 索引大于等于0小于N
        if (index < 0 || index >= N) {
            throw new RuntimeException("位置不合法");
        }

        // 遍历查找位置
        Node temp = head;

        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        // 得到新的节点
        Node node = new Node(t, temp, temp.next);
        temp.next.pre = node;
        temp.next = node;
        // 得到尾结点
        N++;
    }


    /**
     * 获取指定位置的索引
     *
     * @param index 指定位置
     * @return 指定元素
     */
    public T get(int index) {
        if (index < 0 || index > N - 1) throw new RuntimeException("下标越界异常");
        Node temp = head.next;

        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }

        return temp.item;
    }

    /**
     * 找到元素第一次出现的位置
     *
     * @param t 元素
     * @return 元素索引
     */
    public int indexOf(T t) {
        if (t == null) throw new RuntimeException("元素不可以为空");

        Node temp = head.next;

        for (int i = 0; i < N; i++) {
            if (temp.item.equals(t)) {
                return i;
            }
            temp = temp.next;
        }
        // 不存在改元素
        return -1;
    }


    /**
     * 删除指定位置的索引
     *
     * @param index 指定索引
     * @return 删除元素
     */
    public T remove(int index) {
        if (index < 0 || index > N) throw new RuntimeException("索引异常");

        Node temp = head;
        // 找到删除之前的节点
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }

        // 删除位置节点
        Node cur = temp.next;
        // 得到当前位置的后节点
        Node next = cur.next;

        temp.next = next;
        next.pre = temp;
        N--;

        return cur.item;
    }

    /**
     * 首节点
     *
     * @return 首节点的值
     */
    public T firstNode() {
        if (isEmpty()) return null;

        return head.next.item;
    }

    /**
     * 尾结点
     *
     * @return 尾结点的值
     */
    public T lastNode() {
        if (isEmpty()) return null;

        return last.item;
    }

    /**
     * 返回中间节点【两个的话，返回第二个】
     *
     * @return 中间节点的值
     */
    public T getMid() {
        if (head == null) return null;

        // 定义快慢指针
        Node fast = head, slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow.item;
    }

    @Override
    public Iterator<T> iterator() {
        return new DIterator();
    }

    private class DIterator implements Iterator {

        private Node root;

        public DIterator() {
            this.root = head;
        }

        @Override
        public boolean hasNext() {
            return root.next != null;
        }

        @Override
        public Object next() {

            root = root.next;
            return root.item;
        }
    }

    /**
     * 节点类
     */

    private class Node {
        T item;
        Node pre;
        Node next;

        public Node(T item, Node pre, Node next) {
            this.item = item;
            this.pre = pre;
            this.next = next;
        }
    }
}
