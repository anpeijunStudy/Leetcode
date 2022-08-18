package 剑指offer._061;

import java.util.HashSet;

/**
 * @author anpeijun
 * @version 1.0
 * @description 扑克牌中的顺子
 * @date 2022/08/18/0:57
 */
public class _061 {
}

class Solution {
    public boolean isStraight(int[] nums) {
        // 添加牌
        HashSet<Integer> set = new HashSet<>();

        // 记录最大最小牌
        int max = 0, min = 0;
        for (int num : nums) {
            if (num == 0) continue;
            max = Math.max(max, num);
            min = Math.min(min, num);
            if (!set.add(num)) return false;
        }
        return max - min < 5;
    }
}
