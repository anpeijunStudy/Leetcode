package leetcode._0._003;


import java.util.HashMap;
import java.util.HashSet;

/**
 * 无重复字符的最长子串
 */
public class _003 {
}

class Solution {

    /**
     * 查找无重复字符串的长度
     *
     * @param s 查找字符串
     * @return 长度
     */
    public int lengthOfLongestSubstring(String s) {
        if (s.length() < 1) return 0;

        HashMap<Character, Integer> map = new HashMap<>();

        // 存放最大长度和滑动指针左窗口
        int max = 0, left = 0;

        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                left = Math.max(left, map.get(s.charAt(i)) + 1);
            }
            map.put(s.charAt(i), i);
            max = Math.max(max, i - left + 1);
        }

        return max;
    }

/*    // 解决失败
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> characters = new HashSet<>();

        int index = 0, sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (!characters.add(s.charAt(i))) {
                characters.clear();
                characters.add(s.charAt(i));
                index = 1;
                continue;
            }
            characters.add(s.charAt(i));
            index++;
            sum = sum > index ? sum : index;
        }
        return sum;
    }*/
}
