package leetcode._0._014;

/**
 * 最长公共前缀
 */
public class _014 {
}

class Solution {

    /**
     * 得到最长前缀
     *
     * @param strs 传入字符串数组
     * @return 最长字符串
     */
    public String longestCommonPrefix(String[] strs) {

        // 得到字符串的长度
        int length = strs.length;
        // 判断是否存在字串串
        if (length == 0) return "";
        // 假定-最长前缀字符串
        String prefix = strs[0];
        // 循环比较字符串
        for (int i = 1; i < length; i++) {
            int j = 0;
            // 循环条件：后面比较的字符串应该小于公共字符串的长度
            for (; j < prefix.length() && j < strs[i].length(); j++) {
                // 从0开始比较，直到最短字符串或者是不相等的时候
                if (prefix.charAt(j) != strs[i].charAt(j)) {
                    break;
                }
            }
            // 公共前缀就是假定公共字符串到比较字符串的相等位置
            prefix = prefix.substring(0, j);

            // 前缀字符串为空-直接返回-此时不存在
            if (prefix.equals("")) {
                return prefix;
            }
        }

        // 返回公共前缀字符串
        return prefix;
    }
}
