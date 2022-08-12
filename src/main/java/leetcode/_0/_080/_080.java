package leetcode._0._080;

/**
 * @author anpeijun
 * @version 1.0
 * @description 给你一个有序数组 nums ，请你 原地 删除重复出现的元素，
 * 使得出现次数超过两次的元素只出现两次 ，返回删除后数组的新长度。
 * @date 2022/08/12/13:43
 */
public class _080 {
    public static void main(String[] args) {
        int[] ints = {1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 4, 5, 6, 6, 7};
        int removeDuplicates = new Solution().removeDuplicates(ints);

        for (int i = 0; i < removeDuplicates; i++) {
            System.out.println(ints[i]);
        }
    }
}

class Solution {
    /**
     * 给你一个有序数组 nums ，请你 原地 删除重复出现的元素，
     * 使得出现次数超过两次的元素只出现两次 ，返回删除后数组的新长度
     *
     * @param nums 比较数组
     * @return 数组长度
     */
    public int removeDuplicates(int[] nums) {
        return removeNums(nums, 1);
    }

    /**
     * 通用解
     *
     * @param nums 比较数组
     * @param k    保留位数
     * @return 返回长度
     */
    private int removeNums(int[] nums, int k) {

        // 自增数
        int retainNum = 0;

        for (int num : nums) {
            // 前面的比较是为了填充前k个数而进行的比较||后面的比较才是真正的比较，相等则覆盖
            if (retainNum < k || nums[retainNum - k] != num) {
                nums[retainNum++] = num;
            }
        }
        return retainNum;
    }
}
