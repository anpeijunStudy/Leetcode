package leetcode._0._053;

/**
 * @author anpeijun
 * @version 1.0
 * @description 最大子数组和
 * @date 2022/08/14/19:30
 */
public class _053 {
    public static void main(String[] args) {
        int[] ints = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int array = new Solution().maxSubArray(ints);

        System.out.println(array);
    }
}

    class Solution {

        /**
         * 最大子数组和
         *
         * @param nums 数字集合
         * @return 最大值
         */
        public int maxSubArray(int[] nums) {
            // ans结果
            int ans = nums[0];
            int sum = 0;

            // 遍历数组
            for (int num : nums) {
                if (sum > 0) sum += num;
                else sum = num;
                ans = Math.max(sum, ans);
            }

            return ans;
        }
    }
