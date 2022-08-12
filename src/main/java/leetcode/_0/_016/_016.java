package leetcode._0._016;

import java.util.Arrays;

/**
 * @author anpeijun
 * @version 1.0
 * @description 三数之和近似值，假定只有一个解
 * @date 2022/08/11/16:56
 */
public class _016 {
    public static void main(String[] args) {

    }
}

class Solution {

    /**
     * 三数之和近似值，假定只有一个解
     *
     * @param nums   数值数组
     * @param target 目标值
     * @return 解
     */
    public int threeSumClosest(int[] nums, int target) {
        // 此时已经假定必然有解，所以不判断
        // 排序
        Arrays.sort(nums);
        // 假定返回值
        int res = nums[0] + nums[1] + nums[2];
        // 遍历
        for (int i = 0; i < nums.length; i++) {
            // 左右指针进行计算
            int L = i + 1, R = nums.length - 1;
            while (L < R) {
                int sum = nums[i] + nums[L] + nums[R];

                // 计算值减去目标值的绝对值，晓得更接近
                if (Math.abs(target - sum) < Math.abs(target - res)) {
                    res = sum;
                }
                if (sum < target) {
                    L++;
                } else if (sum > target) {
                    R--;
                } else {
                    return res;
                }
            }
        }

        return res;
    }
}
