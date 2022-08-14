package leetcode._300._367;

/**
 * @author anpeijun
 * @version 1.0
 * @description 有效的完全平方数
 * @date 2022/08/14/16:47
 */
public class _367 {
}

class Solution {
    /**
     * 有效的完全平方数
     *
     * @param num
     * @return
     */
    public boolean isPerfectSquare(int num) {
        // 判断
        if (num < 0) return false;

        // 二分查找
        int left = 0, right = num;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if ((long) mid * mid == num) {
                return true;
            } else if ((long) mid * mid > num) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return false;
    }
}
