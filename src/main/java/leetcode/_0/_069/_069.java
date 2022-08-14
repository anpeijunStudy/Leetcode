package leetcode._0._069;

/**
 * @author anpeijun
 * @version 1.0
 * @description x 的平方根
 * @date 2022/08/14/16:19
 */
public class _069 {
}

class Solution {

    /**
     * 求出x的算术平方根
     *
     * @param x 等待被求的数
     * @return x的算术平方根
     */
    public int mySqrt(int x) {
        if (x < 0) return -1;

        // 使用二分查找
        int left = 0, right = x, ans = -1;

        // 开始二分查找
        while (left <= right) {
            // 中间值
            int mid = left + (right - left) / 2;

            // 判断
            if ((long) mid * mid < x) {
                ans = mid;
                left = mid + 1;
            } else if ((long) mid * mid == x) {
                return mid;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }
}

