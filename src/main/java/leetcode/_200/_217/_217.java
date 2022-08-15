package leetcode._200._217;

import java.util.HashSet;

/**
 * @author anpeijun
 * @version 1.0
 * @description 存在重复元素
 * @date 2022/08/14/19:27
 */
public class _217 {
}

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (!set.add(num)) {
                return true;
            }
        }

        return false;
    }
}
