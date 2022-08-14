package leetcode._0._006;

import java.util.ArrayList;

/**
 * @author anpeijun
 * @version 1.0
 * @description Z字转换
 * @date 2022/08/14/0:09
 */
public class _006 {
    public static void main(String[] args) {
        System.out.println(new Solution().convert("PAYPALISHIRING", 3));
    }
}


class Solution {

    /**
     * Z字转换
     *
     * @param s
     * @param numRows
     * @return
     */
    public String convert(String s, int numRows) {

        // 判断字符串长度
        if (numRows < 2) return s;
        // 建立一个数组，存放每层的数,取数组长度和字符串的长度的最小值
        ArrayList<StringBuilder> list = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            list.add(new StringBuilder());
        }

        //遍历存放字符
        int i = 0, flag = -1;
        for (char c : s.toCharArray()) {
            list.get(i).append(c);
            if (i == 0 || i == numRows - 1) flag = -flag;
            i += flag;
        }


        // 整合字符串
        StringBuilder builder = new StringBuilder();
        for (StringBuilder str : list) {
            builder.append(str);
        }


        // 返回
        return builder.toString();
    }
}
