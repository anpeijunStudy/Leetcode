package leetcode._0._058;


import java.util.LinkedList;

/**
 * 最后一个单词的长度
 */
public class _058 {
}


class Solution {

    /**
     * 最后一个单词的长度
     *
     * @param s
     * @return
     */
    public int lengthOfLastWord(String s) {
        s = s.trim();
        // 从后向前遍历
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                return s.length() - i;
            }
        }

        return s.length();
    }
/*    public int lengthOfLastWord(String s) {
        // 去除首位空格
        s = s.trim();
        // 利用栈
        LinkedList<String> list = new LinkedList<>();
        s += " ";
        StringBuffer buffer = new StringBuffer();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                list.push(buffer.toString());
                buffer = null;
                continue;
            }
            buffer.append(s.charAt(i));
        }

        return list.pop().length();
    }*/
}
