package leetcode._0._008;


/**
 * 字符串转整数
 */
public class _008 {
    public static void main(String[] args) {
        new Solution().myAtoi("42");
    }
}

class Solution {
    public int myAtoi(String s) {
        // 转字符数组
        char[] chars = s.toCharArray();
        int length = chars.length;

        // 遍历消除前导空格
        int index = 0;
        while (index < length && chars[index] == ' ') index++;

        if (length == index) return 0;


        // 记录正负
        int sign = 1;
        char firstChar = chars[index];
        if (firstChar == '+') {
            index++;
        } else if (firstChar == '-') {
            index++;
            sign = -1;
        }

        //遍历字符串，遇见数字加入-否则跳出
        int res = 0;
        while (index < length) {
            char currChar = chars[index];
            // 不合法的情况
            if (currChar > '9' || currChar < '0') {
                break;
            }

            // 题目中说：环境只能存储 32 位大小的有符号整数，因此，需要提前判：断乘以 10 以后是否越界
            if (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && (currChar - '0') > Integer.MAX_VALUE % 10)) {
                return Integer.MAX_VALUE;
            }
            if (res < Integer.MIN_VALUE / 10 || (res == Integer.MIN_VALUE / 10 && (currChar - '0') > -(Integer.MIN_VALUE % 10))) {
                return Integer.MIN_VALUE;
            }

            // 合法的情况下，才考虑转换，每一步都把符号位乘进去
            res = res * 10 + sign * Integer.valueOf(String.valueOf(currChar));
//            res = res * 10 + sign * (currChar -'0');
            index++;
        }

        return res;
    }
}
