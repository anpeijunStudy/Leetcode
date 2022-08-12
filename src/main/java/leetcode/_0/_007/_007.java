package leetcode._0._007;


/**
 * 整数反转
 */
public class _007 {
    public static void main(String[] args) {
        System.out.println(new Solution().reverse(-321));
    }
}

class Solution {


    /**
     * 整数反转
     *
     * @param x 整数
     * @return 反转之后的数
     */
    public int reverse(int x) {
        int revnum = 0;


        while (x != 0) {
            // 求模
            int pop = x % 10;

            // 判断溢出
            if (revnum > Integer.MAX_VALUE / 10 || (revnum == Integer.MAX_VALUE / 10 && pop > 7))
                return 0;
            if (revnum < Integer.MIN_VALUE / 10 || (revnum == Integer.MIN_VALUE / 10 && pop < -8))
                return 0;

            // 反转之后的值
            revnum = revnum * 10 + pop;
            x /= 10;

        }
        return revnum;
    }
     /*   public int reverse(int x) {

        int ans = 0;

        while (x != 0) {
            int pop = x % 10;
            if (ans > Integer.MAX_VALUE / 10 || (ans == Integer.MAX_VALUE / 10 && pop > 7))
                return 0;
            if (ans < Integer.MIN_VALUE / 10 || (ans == Integer.MIN_VALUE / 10 && pop < -8))
                return 0;

            ans = ans * 10 + pop;
            x /= 10;
        }
        return ans;
    }*/
}
