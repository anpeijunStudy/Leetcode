package datastructure.linear;

import java.util.ArrayList;

public class SequenceListDemo {
    public static void main(String[] args) {
        SequenceList<String> list = new SequenceList<String>(5);

        list.insert("1");
        list.insert("2");
        list.insert("4");
        list.insert(2, "3");
        list.insert("5");

        for (String s : list) {
            System.out.println(s);
        }
    }
}
