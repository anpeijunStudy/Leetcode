package leetcode._600._633;

/**
 * @author anpeijun
 * @version 1.0
 * @description 平方数之和
 * @date 2022/08/14/16:58
 */
public class _633 {
    public static void main(String[] args) {
        System.out.println((long) Math.sqrt(5));
    }
}

class Solution {

    /**
     * 平方数之和
     *
     * @param c
     * @return 返回是否存在
     */
    public boolean judgeSquareSum(int c) {
        if (c < 0) return false;

        // 求出c的平方根，最小右边数
        long left = 0;
        long right = (long) Math.sqrt(c);

        while (left <= right) {

            long sum = left * left + right * right;

            if (sum == c) {
                return true;
            } else if (sum > c) {
                right--;
            } else {
                left++;
            }
        }
        return false;
    }
}
