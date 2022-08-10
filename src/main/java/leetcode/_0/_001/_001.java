package leetcode._0._001;

import java.util.HashMap;

public class _001 {
}

class Solution {
    public int[] twoSum(int[] nums, int target) {

        // 创建哈希表
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            // 如果存在 传入和减当前数组的值的值-返回
            // containsKey() 方法来检测数据（value）是否存在,
            if (hashMap.containsKey(target - nums[i])) {
                return new int[]{hashMap.get(target - nums[i]),i};
            }
            // 添加值和当前值的索引
            hashMap.put(nums[i], i);
        }

        return null;
    }
}
