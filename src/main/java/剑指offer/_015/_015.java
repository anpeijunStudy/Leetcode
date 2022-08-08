package 剑指offer._015;


/**
 * 判断二进制中的1
 */
public class _015 {
}

class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {

        int nums = 0;

        while (n != 0) {
            n &= (n - 1);
            nums++;

        }

        return nums;
    }
}
