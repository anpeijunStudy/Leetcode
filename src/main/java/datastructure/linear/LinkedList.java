package datastructure.linear;

import java.util.Iterator;

public class LinkedList<T> implements Iterable<T> {

    /**
     * 头结点
     */
    private Node head;

    /**
     * 链表个数
     */
    private int N;

    /**
     * 初始化链表
     */
    public LinkedList() {
        this.head = new Node(null, null);
        this.N = 0;
    }

    /**
     * 链表长度
     *
     * @return
     */
    public int size() {
        return N;
    }

    /**
     * 链表是否为空
     *
     * @return 链表为空状态
     */
    public boolean isEmpty() {
        return N == 0;
    }

    /**
     * 获取链表的index处索引值
     *
     * @param index 索引
     * @return 链表值
     */
    public T get(int index) {
        if (index < 0 || index > N - 1) {
            return null;
        }
        // 定义临时节点
        Node temp = head.next;

        // 遍历查找到节点
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }

        return temp.item;
    }

    /**
     * 添加元素
     */
    public void insert(T t) {
        // 查找到最后一个节点
        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        // 构建节点
        temp.next = new Node(t, null);
        N++;
    }

    /**
     * 指定位置前添加索引
     *
     * @param index 指定索引
     * @param t     添加元素
     */
    public void insert(int index, T t) {
        if (index < 0 || index > N - 1) {
            System.out.println("添加索引越界");
            return;
        }

        Node temp = head;
        for (int i = 0; i <= index - 1; i++) {
            temp = temp.next;
        }

        // 当前节点之后的节点
        Node next = temp.next;
        temp.next = new Node(t, next);
        N++;
    }

    /**
     * 删除指定位置处的元素
     *
     * @param index 指定索引
     * @return 删除元素
     */
    public T remove(int index) {
        if (index < 0 || index > N - 1) {
            System.out.println("删除索引越界");
            return null;
        }

        // 定义临时节点-找到删除节点的前一个节点
        Node temp = head;

        for (int i = 0; i <= index - 1; i++) {
            temp = temp.next;
        }

        // 获取当前节点
        Node cur = temp.next;
        // 删除指定元素
        temp.next = cur.next;
        N--;

        return cur.item;
    }

    /**
     * 查找元素出现的第一次索引
     *
     * @return 第一次出现索引
     */
    public int indexOf(T item) {
        // 定义临时节点
        Node temp = head.next;

        for (int i = 0; i < N - 1; i++) {
            if (temp.item.equals(item)) {
                return i;
            }
            temp = temp.next;
        }

        return -1;
    }

    @Override
    public Iterator<T> iterator() {
        return new Lterator();
    }

    private class Lterator implements Iterator<T> {

        private Node root;

        public Lterator() {
            this.root = head;
        }

        @Override
        public boolean hasNext() {
            return root.next != null;
        }

        @Override
        public T next() {
            root = root.next;
            return root.item;
        }
    }

    /**
     * 节点类
     */
    private class Node {
        T item;
        Node next;

        public Node(T item, Node next) {
            this.item = item;
            this.next = next;
        }
    }
}
