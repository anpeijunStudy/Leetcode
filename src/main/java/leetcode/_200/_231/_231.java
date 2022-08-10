package leetcode._200._231;


/**
 * 2的幂数
 */
public class _231 {
}

class Solution {
    /**
     * 判断是否为2的幂数
     *
     * @param n 判断数
     * @return 判断结果
     */
    public boolean isPowerOfTwo(int n) {

        // N为2的幂数的话，恒存在n&n-1=0
        return n > 0 && (n & (n - 1)) == 0;
    }
}
