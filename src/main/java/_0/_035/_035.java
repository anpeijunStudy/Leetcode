package _0._035;


/**
 * 数字起始位置
 */
public class _035 {
}

class Solution {

    /**
     * 给定一个排序数组和一个目标值，在数组中找到目标值，
     * 并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
     * 二分查找解决时间复杂度需要控制在O(nlogn)
     *
     * @param nums   排序数组
     * @param target 目标值
     * @return 索引
     */
    public int searchInsert(int[] nums, int target) {

        int left = 0, right = nums.length - 1;

        while (left <= right) {

            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
}
