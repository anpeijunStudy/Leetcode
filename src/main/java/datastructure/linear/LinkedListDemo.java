package datastructure.linear;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.insert(1);
        list.insert(2);
        list.insert(4);
        list.insert(5);
        list.insert(6);
        list.insert(2, 3);

        System.out.println(list.remove(2));
        System.out.println("迭代器遍历");
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}
