package leetcode._0._050;

/**
 * @author anpeijun
 * @version 1.0
 * @description Pow(x, n)
 * @date 2022/08/14/17:13
 */
public class _050 {
    public static void main(String[] args) {
//        System.out.println(Math.pow(2, -2));

//        System.out.println(Math.abs(-3));
//        System.out.println(new Solution().myPow(2, -2));
//        System.out.println(Math.pow(-2, 0));

        System.out.println(8 >> 1);
    }
}

class Solution {

    /**
     * Pow(x, n)
     *
     * @param x
     * @param n
     * @return
     */
    public double myPow(double x, int n) {
        if (x == 0.0f) return 0.0f;

        // 计算结果
        double res = 1.0;

        // 数字越界异常
        long number = n;

        // 考虑n小于0
        if (number < 0) {
            x = 1 / x;
            number = -number;
        }

        // 进行计算
        while (number > 0) {
            // number为1的时候计算
            if ((number & 1) == 1) res *= x;

            // 存储x平方值
            x *= x;
            number /= 2;
        }
        return res;
    }
}

