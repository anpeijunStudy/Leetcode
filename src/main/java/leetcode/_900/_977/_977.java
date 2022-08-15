package leetcode._900._977;

import java.util.Arrays;

/**
 * @author anpeijun
 * @version 1.0
 * @description 有序数组的平方
 * @date 2022/08/15/16:00
 */
public class _977 {
}

class Solution {

    /**
     * 暴力法-可以解决问题，但是时间过长
     *
     * @param nums
     * @return
     */
/*    public int[] sortedSquares(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) Math.pow(nums[i], 2);
        }

        Arrays.sort(nums);
        return nums;

    }*/

    /**
     * 定义左右指针进行比较存放，最大的数，一定是数组的最左或者是最右
     *
     * @param nums
     * @return
     */
    public int[] sortedSquares(int[] nums) {
        int length = nums.length;

        int[] ints = new int[length];

        for (int pos = length - 1, left = 0, right = length - 1; left < right; ) {
            if (nums[left] * nums[left] > nums[right] * nums[right]) {
                ints[pos] = nums[left] * nums[left];
                left++;
            } else {
                ints[pos] = nums[right] * nums[right];
                right--;
            }
            pos--;
        }

        return ints;
    }
}
