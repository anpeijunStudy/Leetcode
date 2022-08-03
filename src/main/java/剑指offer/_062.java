package 剑指offer;

import java.util.ArrayList;

public class _062 {
}

class Solution {
    public int lastRemaining(int n, int m) {
        // 约瑟夫问题
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(i);
        }

        int index = 0;
        while (n > 1) {
            index = (index + m - 1) % n;
            list.remove(index);
            n--;
        }

        return list.get(0);
    }

}
