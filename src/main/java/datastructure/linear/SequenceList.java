package datastructure.linear;


import java.util.Iterator;

/**
 * 顺序表
 */
public class SequenceList<T> implements Iterable<T> {

    /**
     * 存放元素
     */
    private T[] items;

    /**
     * 记录线性表的长度
     */
    private int N;

    /**
     * 顺序表初始化
     *
     * @param size 顺序表大小
     */
    public SequenceList(int size) {
        items = (T[]) new Object[size];
        this.N = 0;
    }


    /**
     * 顺序表长度
     *
     * @return 顺序表长度
     */
    public int size() {
        return N;
    }

    /**
     * 顺序表是否为空
     *
     * @return 为空状态
     */
    public boolean isEmpty() {
        return N == 0;
    }

    /**
     * 顺序表返回元素
     *
     * @param index 索引
     * @return 返回元素
     */
    public T get(int index) {
        index(index);
        return items[index];
    }

    /**
     * 添加元素
     *
     * @param item 添加元素
     */
    public void insert(T item) {

        // 数组已满，直接扩容
        if (N == items.length) {
            resize(items.length * 2);
        }

        // 添加元素
        items[N++] = item;
    }

    /**
     * 指定位置处添加索引
     *
     * @param index 索引
     * @param item  元素
     */
    public void insert(int index, T item) {

        if (index < 0 || index > N) {
            throw new RuntimeException("索引越界异常");
        }
        // 数组已满，直接扩容
        if (N == items.length) {
            resize(items.length * 2);
        }

        // 先将所有的index及以后的元素后移
        for (int i = N; i >= index; i--) {
            items[i] = items[i - 1];
        }

        // 添加元素
        items[index] = item;
        N++;
    }

    /**
     * 删除指定位置处的item
     *
     * @param index 指定位置
     * @return 删除元素
     */
    public T remove(int index) {
        // 判断
        index(index);
        // 记录index处的位置
        T temp = items[index];

        // 删除元素-将index处后面的元素全部前移除
        for (int i = index; i < N - 1; i++) {
            items[i] = items[i + 1];
        }
        N--;
        // 判断是否需要缩容
        if (N == items.length / 4) {
            resize(items.length / 2);
        }

        return temp;
    }

    /**
     * 元素第一次出现的位置
     *
     * @param item 查找元素
     * @return 元素第一次索引
     */
    public int indexOf(T item) {

        if (item == null) {
            throw new RuntimeException("查找异常");
        }
        for (int i = 0; i < N; i++) {
            // 存在相等数
            if (item == items[i]) {
                return i;
            }
        }
        return -1;
    }

    /**
     * 索引越界异常问题
     *
     * @param index 索引
     */
    public void index(int index) {
        if (index < 0 || index >= N) {
            throw new RuntimeException("索引越界异常");
        }
    }

    /**
     * 顺序表扩容
     *
     * @param newSize 顺序表新的大小
     */
    public void resize(int newSize) {
        // 存放原数组
        T[] original = items;
        // items扩容
        items = (T[]) new Object[newSize];
        // 拷贝
        for (int i = 0; i < N; i++) {
            items[i] = original[i];
        }
    }


    /**
     * 迭代器
     *
     * @return
     */
    @Override
    public Iterator<T> iterator() {
        return new SIterator();
    }

    private class SIterator implements Iterator<T> {
        private int num;

        public SIterator() {
            this.num = 0;
        }

        @Override
        public boolean hasNext() {
            return num < N;
        }

        @Override
        public T next() {
            return items[num++];
        }
    }
}
