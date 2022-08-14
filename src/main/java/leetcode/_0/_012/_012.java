package leetcode._0._012;

/**
 * @author anpeijun
 * @version 1.0
 * @description 12. 整数转罗马数字
 * @date 2022/08/14/15:05
 */
public class _012 {
}

class Solution {

    /**
     * 整数转罗马数字
     *
     * @param num 整数
     * @return 罗马数字
     */
    public String intToRoman(int num) {
        // 把阿拉伯数字与罗马数字可能出现的所有情况和对应关系，放在两个数组中，并且按照阿拉伯数字的大小降序排列
        int[] nums = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romans = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        // 定义可变字符串，存放罗马数字
        StringBuilder builder = new StringBuilder();

        // 定义对比索引
        int index = 0;

        // 遍历循环，直到num被比较完毕
        while (num > 0) {

            // 循环对比存放数字每一位的对应的罗马数字直到num为0
            while (num >= nums[index]) {
                // 存放对应的罗马数字
                builder.append(romans[index]);
                // 每存放一个就减去当前已经存放完毕的值
                num -= nums[index];
            }
            index++;
        }
        return builder.toString();
    }
}
