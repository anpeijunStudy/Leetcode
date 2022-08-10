package leetcode._0._027;

public class _027 {
}

class Solution {

    /**
     * 原数组移除元素
     *
     * @param nums 带移除数组
     * @param val  移除数字
     * @return 移除之后的下标
     */
    public int removeElement(int[] nums, int val) {
        // 数组长度
        int length = nums.length;

        // 实际存放有效元素的索引
        int index = 0;

        // 遍历对比
        for (int i = 0; i < length; i++) {
            // 不是等待消除的数，则存放在有效位置
            if (nums[i] != val) {
                nums[index++] = nums[i];
            }
        }
        // 返回有效位置的最后一个索引
        return index;
    }
}
