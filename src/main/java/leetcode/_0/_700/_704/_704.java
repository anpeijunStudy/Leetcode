package leetcode._0._700._704;


/**
 * 二分查找
 */
public class _704 {
}

class Solution {

    /**
     * 二分查找
     *
     * @param nums   待产找数组
     * @param target 目标值
     * @return 目标值索引
     */
    public int search(int[] nums, int target) {

        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
//        // 递归查找
//        int search = recursionSearch(nums, target, 0, nums.length - 1);
//        return search;
    }

    private int recursionSearch(int[] nums, int target, int left, int right) {

        // 递归结束
        if (left > right) return -1;

        // 获取中间值索引
        int mid = (left + right) / 2;
        // 开始查找
        if (nums[mid] > target) { // 左边递归
            return recursionSearch(nums, target, left, mid - 1);
        } else if (nums[mid] < target) {// 右边递归
            return recursionSearch(nums, target, mid + 1, right);
        } else {
            return mid;
        }
    }
}
