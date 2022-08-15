package leetcode._0._070;

/**
 * @author anpeijun
 * @version 1.0
 * @description 爬楼梯
 * @date 2022/08/14/19:16
 */
public class _070 {
}

class Solution {
    /**
     * 爬楼器
     *
     * @param n 多少级楼梯
     * @return 可能性
     */
    public int climbStairs(int n) {

        // 斐波那契问题
        int start = 1, end = 1, sum = 1;

        for (int i = 0; i < n; i++) {
            sum = start + end;
            start = end;
            end = sum;
        }
        return start;
    }
}
