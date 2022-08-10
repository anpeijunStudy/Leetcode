package 剑指offer._058;


import java.util.LinkedList;

/**
 * 翻转单词顺序
 */
public class _058 {
    public static void main(String[] args) {
        System.out.println(new Solution().reverseWords("                             "));
    }
}

class Solution {

    /**
     * 翻转单词顺序
     *
     * @param s 单子
     * @return 翻转之后的字符串
     */
    /*public String reverseWords(String s) {

        if (s == null || s.equals("")) {
            return "";
        }
        // 使用栈的思想-先进后出
        s += ' ';// 防止最后一个元素不能入栈
        LinkedList<String> queen = new LinkedList<>();

        StringBuffer builder = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                queen.push(builder.toString());
                builder = new StringBuffer();
                continue;
            }
            builder.append(s.charAt(i));
        }

        // 出栈
        builder = new StringBuffer();
        while (queen.size() > 0) {
            String pop = queen.pop();
            if (pop.equals("")) {
                continue;
            }
            builder.append(pop + " ");

        }
        if (builder.equals("") || builder.length() == 0) {
            System.out.println("ssssssssss");
            return "";
        }


//        builder.deleteCharAt(builder.length() - 1);
        builder.delete(builder.length() - 1, builder.length() );
//        System.out.println((builder.length() - 1)-(builder.length() - 1));
        return builder.toString();
    }*/


    /**
     * 快慢指针来解决
     *
     * @param s
     * @return
     */
    public String reverseWords(String s) {
        // 删除首位空格
        s = s.trim();
        if (s == null || s.equals("")) {
            return "";
        }
        // 可变字符串存储
        StringBuffer buffer = new StringBuffer();
        // 定义快慢指针，倒序遍历
        int pre = s.length() - 1, next = pre;

        while (pre >= 0) {
            // 查找每一个单词
            while (pre>=0&&s.charAt(pre) != ' ') pre--;
            // 添加单词
            buffer.append(s.substring(pre + 1, next + 1) + " ");
            // 去除空格
            while (pre>=0&&s.charAt(pre) == ' ') pre--;

            next = pre;
        }

        // 去除空格
        return buffer.toString().trim();
    }
}

