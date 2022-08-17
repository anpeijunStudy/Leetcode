package 剑指offer._053._053_02;

/**
 * @author anpeijun
 * @version 1.0
 * @description 0～n-1中缺失的数字
 * @date 2022/08/17/17:20
 */
public class _053_02 {
}

class Solution {

    /**
     * 0～n-1中缺失的数字
     *
     * @param nums
     * @return
     */
    /*    public int missingNumber(int[] nums) {
        if(nums.length==1&&nums[0]==1) return 0;else if(nums.length==1&&nums[0]==0) return 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] == nums[i] + 1) {
                continue;
            }
            return nums[i] + 1;
        }
        if(nums[0]!=0) return 0;


        return nums[nums.length-1]+1;
    }*/

    // 二分查找
    public int missingNumber(int[] nums) {

        // 定义左右指针
        int left = 0, right = nums.length-1;

        // 二分查找
        while (left <= right) {
            int mid = (left + right) / 2;
            if (mid == nums[mid]) left = mid + 1;
            else right = mid - 1;
        }

        return left;
    }
}
