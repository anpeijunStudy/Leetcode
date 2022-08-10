package leetcode._300._342;


/**
 * 4的幂数
 */
public class _342 {
}

class Solution {
    public boolean isPowerOfFour(int n) {
        // 如果一个数是4的幂数，那么这个输一定可以被符合2，并且求模3等于1
        return n > 0 && (n & (n - 1)) == 0 && n % 3 == 1;
    }
}
