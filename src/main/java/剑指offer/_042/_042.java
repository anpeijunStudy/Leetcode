package 剑指offer._042;

/**
 * @author anpeijun
 * @version 1.0
 * @description 连续子数组的最大和
 * @date 2022/08/17/16:33
 */
public class _042 {
    public static void main(String[] args) {
        int[] ints = {3, -1, 6, -2, -3, 7};
        System.out.println(new Solution().maxSubArray(ints));
    }
}

class Solution {

    /**
     * 连续子数组的最大和
     *
     * @param nums 等待求和数组
     * @return 最大和
     */
    public int maxSubArray(int[] nums) {
        // 定义返回的数-数组已经限制为一定存在一个数
        // 定义最大和
        int res = nums[0], sum = 0;

        // 遍历循环数组
        for (int num : nums) {

            // 如果和大于0的话，继续求最大和
            if (sum > 0) sum += num;
            // 反之，最大和等于当前数字
            else sum = num;
            // 比较每次，得出最大和
            res = Math.max(res, sum);
        }

        return res;
    }
}
