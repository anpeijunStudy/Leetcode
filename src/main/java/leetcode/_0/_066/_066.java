package leetcode._0._066;


import java.util.Arrays;

/**
 * 最高位数字加一
 */
public class _066 {
    public static void main(String[] args) {
       int[] ints = new int[]{9,9,9,9,9,9};
        int[] ints1 = new Solution().plusOne(ints);
        System.out.println(Arrays.toString(ints1));
    }
}

class Solution {


    /**
     * 最高位数字加一
     *
     * @param digits
     * @return
     */
    public int[] plusOne(int[] digits) {

        // 求出数组的长度
        int length = digits.length;

        // 遍历+1
        for (int i = length - 1; i >= 0; i--) {

            digits[i] += 1;
            // 加1之后不等于10，直接返回
            if (digits[i] / 10 == 0) {
                return digits;
            }
            // 等于10
            digits[i] = digits[i] % 10;
        }

        // 这个数组循环完毕代表第一个数也是9，需要多一位存储1
        digits = new int[length + 1];
        digits[0] = 1;

        return digits;
    }
}
