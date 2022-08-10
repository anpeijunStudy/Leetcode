package leetcode._0._026;

public class _026 {
    public static void main(String[] args) {
        int[] arrs = new int[]{1, 2, 3, 4, 4, 4, 4, 4, 5};
        new Solution().removeDuplicates(arrs);
    }
}

class Solution {
    /*public int removeDuplicates(int[] nums) {
        // 定义两个索引，j遍历，i等待交换
        int i = 0, j = 1;

        // 遍历数组
        while (j < nums.length) {

            // 如果两数相等-j继续后移直到找见两数不相等
            if (nums[i] == nums[j]) {
                j++;
            } else {
                // 不想等，交换
                nums[++i] = nums[j];
            }
        }
        // 数组长度
        return i + 1;
    } */
    public int removeDuplicates(int[] nums) {
        // 定义两个索引，j遍历，i等待交换
        int i = 0, j = 1;

        // 遍历数组
        while (j < nums.length) {

            // 如果两数相等-j继续后移直到找见两数不相等
            if (nums[i] != nums[j]) {
                // 不想等，交换
                nums[++i] = nums[j];
            }
            j++;

        }
        // 数组长度
        return i + 1;
    }
}

