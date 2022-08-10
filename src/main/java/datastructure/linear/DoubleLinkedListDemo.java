package datastructure.linear;

public class DoubleLinkedListDemo {
    public static void main(String[] args) {
        DoubleLinkedList<Integer> linkedList = new DoubleLinkedList<>();

        linkedList.insert(1);
        linkedList.insert(3);
        linkedList.insert(1, 2);
        linkedList.insert(4);
        linkedList.insert(5);
        linkedList.insert(7);
        linkedList.insert(5, 6);


        System.out.println("迭代器遍历链表：");
        for (Integer integer : linkedList) {
            System.out.println(integer);
        }

//        System.out.println("删除6元素：" + linkedList.remove(5));
        System.out.println("元素5的索引：" + linkedList.indexOf(5));
        System.out.println("首节点：" + linkedList.firstNode());
        System.out.println("首节点：" + linkedList.lastNode());
        System.out.println("中间值："+linkedList.getMid());
    }
}
