package 剑指offer._050;


import java.util.HashMap;
import java.util.TreeSet;

/**
 * 第一次出现一次的字符
 */
public class _050 {
}

class Solution {

    /**
     * 第一个只出现一次的字符
     *
     * @param s 比较字符串
     * @return 第一次字符
     */
    public char firstUniqChar(String s) {


        if (s.length() == 0) {
            return ' ';
        }
        // 遍历哈希表
        HashMap<Character, Boolean> table = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            table.put(s.charAt(i), !table.containsKey(s.charAt(i)));
        }
        for (int i = 0; i < s.length(); i++) {
            if (table.get(s.charAt(i))) {
                return s.charAt(i);
            }
        }

        return ' ';
    }


}
