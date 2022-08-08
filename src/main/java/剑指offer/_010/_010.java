package 剑指offer._010;


import java.util.HashMap;
import java.util.Map;

/**
 * 斐波那契数列
 */
public class _010 {
    public static void main(String[] args) {
        System.out.println(new Solution().fib(5));
    }

}

class Solution {

    Map<Integer, Integer> map = new HashMap<>();

    /**
     * 得到n的斐波那契数列值
     *
     * @param n 第几项
     * @return 斐波那契数值
     */
   /* public int fib(int n) {
        // recursion(n); 超时

        // 记忆递归
        if (n < 2) {
            return n;
        }
        if (map.get(n) != null) {
            return map.get(n);
        }

        int sum = (fib(n - 1) + fib(n - 2))%1000000007;
        map.put(n, sum);
        return sum;
    }*/


    /**
     * 循环解决
     *
     * @param n
     * @return
     */

    public int fib(int n) {

        int pre = 0, next = 1, sum = 0;
        for (int i = 0; i < n; i++) {
            sum = (pre + next) % 1000000007;
            pre = next;
            next = sum;
        }

        return pre;
    }

    /**
     * 递归
     *
     * @param n
     * @return
     */
    private int recursion(int n) {
        if (n <= 1) {
            return n;
        }
        return (recursion(n - 1) + recursion(n - 2)) % 1000000007;
    }
}
