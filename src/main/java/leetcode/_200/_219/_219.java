package leetcode._200._219;

import java.util.HashSet;

/**
 * @author anpeijun
 * @version 1.0
 * @description 存在重复元素 II
 * @date 2022/08/18/17:32
 */
public class _219 {
}

class Solution {

    /**
     * 存在重复元素 II
     * <p>
     * 类似建立一个滑动窗口-用来满足条件
     *
     * @param nums
     * @param k
     * @return
     */
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) return true;

            set.add(nums[i]);

            if (set.size() > k) set.remove(nums[i - k]);
        }

        return false;
    }
}

