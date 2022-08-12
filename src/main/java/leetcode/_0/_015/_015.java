package leetcode._0._015;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author anpeijun
 * @version 1.0
 * @description 三数之和
 * @date 2022/08/11/15:23
 */
public class _015 {
    public static void main(String[] args) {
        int[] ints = new int[]{-1, 0, 1, 2, -1, -4};
        System.out.println(Arrays.toString(new List[]{new Solution().threeSum(ints)}));
    }
}

class Solution {

    /**
     * 三数之和
     *
     * @param nums 求和数组
     * @return 三数之和集合
     */
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        // 判断长度
        if (nums == null || nums.length < 3) return lists;

        // 首先排序-大于0之后的数就不再加入到比较中去
        Arrays.sort(nums);
        // 遍历查找
        for (int i = 0; i < nums.length; i++) {

            // 去重
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            // 大于0之后的数就不再加入到比较中去
            if (nums[i] > 0) break;

            int L = i + 1;
            int R = nums.length - 1;
            while (L < R) {
                int sum = nums[i] + nums[L] + nums[R];
                // 判断和是否为0
                if (sum == 0) {
                    lists.add(Arrays.asList(nums[i], nums[L], nums[R]));
                    // 去重操作
                    while (L < R && nums[L + 1] == nums[L]) L++;
                    while (L < R && nums[R - 1] == nums[R]) R--;

                    L++;
                    R--;
                } else if (sum < 0) {
                    L++;
                } else {
                    R--;
                }

            }
        }
        return lists;
    }
}
