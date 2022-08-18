package 剑指offer._065;


/**
 * 不用加减乘除做加法
 */
public class _065 {
    public static void main(String[] args) {
//        System.out.println((8 & 2) >> 1);

        System.out.println(new Solution().add(8,2));
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
        while (b != 0) { // 当进位为 0 时跳出
            int c = (a & b) << 1;  // c = 进位
            a ^= b; // a = 非进位和
            b = c; // b = 进位
        }
        return a;
    }
}
