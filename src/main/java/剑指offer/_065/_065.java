package 剑指offer._065;


/**
 * 不用加减乘除做加法
 */
public class _065 {
    public static void main(String[] args) {
        new Solution().add(2, 3);
    }
}

class Solution {

    /**
     * 不用加减乘除做加法
     *
     * @param a a, b 均可能是负数或 0
     * @param b a, b 均可能是负数或 0
     * @return 计算结果
     */
    public int add(int a, int b) {
        int sum = a + b;
        return sum;
    }
}
