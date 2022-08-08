package _300._326;


/**
 * 3的幂数
 */
public class _326 {

}

class Solution {
    public boolean isPowerOfThree(int n) {

        return n > 0 && 1162261467 % n == 0;
    }
}
