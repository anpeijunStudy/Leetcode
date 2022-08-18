package leetcode._200._209;

import sun.security.util.Length;

import java.util.Arrays;

/**
 * @author anpeijun
 * @version 1.0
 * @description 长度最小的子数组
 * @date 2022/08/18/21:27
 */
public class _209 {
    public static void main(String[] args) {
        int[] ints = {2, 3, 1, 2, 4, 3};
        System.out.println(new Solution().minSubArrayLen(7, ints));
    }
}

/*class Solution {

    public int minSubArrayLen(int target, int[] nums) {
        // 滑动窗口解决
        int left = 0, right = 1, sum = nums[0] + nums[1];
        // 最小长度
        int lenght = Integer.MAX_VALUE;

        while (right <= nums.length - 1) {
            if (sum == target) {
                System.out.println(nums[left] + "----" + nums[right]);

                int count = 0;
                for (int i = left; i <= right; i++) {
                    count++;
                }
                lenght = Math.min(count, lenght);

            }
            if (sum >= target) {
                sum -= nums[left];
                left++;
            } else {

                if (right==nums.length-1) break;
                right++;
                sum += nums[right];
            }
        }
        return lenght == Integer.MAX_VALUE ? 0 : lenght;
    }
}*/

class Solution {
    public int minSubArrayLen(int s, int[] nums) {

        if (nums.length == 0) return 0;

        int length = Integer.MAX_VALUE;
        int start = 0, end = 0;
        int sum = 0;

        while (end < nums.length) {
            sum += nums[end];

            while (sum >= s) {
                length = Math.min(length, end - start + 1);

                sum -= nums[start];
                start++;
            }
            end++;
        }
        return length == Integer.MAX_VALUE ? 0 : length;
    }
}

