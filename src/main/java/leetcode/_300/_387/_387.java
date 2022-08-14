package leetcode._300._387;

import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * @author anpeijun
 * @version 1.0
 * @description 第一次字符串
 * @date 2022/08/13/23:38
 */
public class _387 {
}

class Solution {

    /**
     * 第一个只出现一次的字符
     *
     * @param s 字符串
     * @return 索引
     */
    public int firstUniqChar(String s) {

        HashMap<Character, Boolean> map = new LinkedHashMap<>();

        char[] chars = s.toCharArray();
        for (char str : chars) {
            map.put(str, !map.containsKey(str));
        }
        for (int i = 0; i < s.length(); i++) {
            if (map.get(chars[i])) {
                return i;
            }
        }
        return -1;
    }
}
