package leetcode._100._136;


import java.util.HashSet;

/**
 * 只出现一次的数字
 */
public class _136 {
}

class Solution {

    /**
     * 数组中只出现一次的数字-哈希表
     *
     * @param nums
     * @return
     */
    /*public int singleNumber(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (!set.add(num)) {
                set.remove(num);
                continue;
            }
            set.add(num);
        }
        if (set.size() != 0) {
            return (int) set.toArray()[0];

        }
        return -1;
    }*/

    /**
     * 使用异或解决
     * 相等的数异或为0，异或0，等于自身
     *
     * @param nums
     * @return
     */
    public int singleNumber(int[] nums) {
        int num = nums[0];
        for (int i = 1; i < nums.length; i++) {
            num = num ^ nums[i];
        }
        return num;
    }
}
