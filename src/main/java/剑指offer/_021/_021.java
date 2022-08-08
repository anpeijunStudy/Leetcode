package 剑指offer._021;


/**
 * 调整数组顺序使奇数位于偶数前面
 */
public class _021 {
}
class Solution {
    /**
     * 调整数组顺序使奇数位于偶数前面
     *
     * @param nums 等待调整数组
     * @return 调整之后数组
     */
    public int[] exchange(int[] nums) {
        // 左右指针开始同时遍历交换
        int front = 0, later = nums.length - 1, temp;

        while (front < later) {
            while (front < later && nums[front] % 2 == 1) front++;
            while (front < later && nums[later] % 2 == 0) later--;

            // 交换
            temp = nums[front];
            nums[front] = nums[later];
            nums[later] = temp;
        }

        return nums;
    }
}
