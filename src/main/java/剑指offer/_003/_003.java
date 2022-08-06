package 剑指offer._003;


import java.util.HashSet;

/**
 * 返回重复数字
 */
public class _003 {
    public static void main(String[] args) {
        int[] ints = {1, 1, 2, 3, 4};
        System.out.println(new Solution().findRepeatNumber(ints));
    }
}

class Solution {

    /*
     */

    /**
     * 使用哈希表解决时间复杂度设空间复杂度都是O(n)
     *
     * @param nums
     * @return
     *//*
    public int findRepeatNumber(int[] nums) {

        // 哈希表存储
        HashSet<Integer> integers = new HashSet<>();

        // 如果是返回所有的数，可以用数组去存储所有相同的数
        for (int num : nums) {
            // 存在相同的数，就返回
            if (!integers.add(num)) {
                return num;
            }
        }
        return -1;
    }*/
    public int findRepeatNumber(int[] nums) {


        // 遍历数组
        int i = 0;
        while (i < nums.length) {

            // 数字和索引相等的话退出
            if (nums[i] == i) {
                i++;
                continue;
            }

            // 将要交换的地方存在相等数，直接返回值
            // 也就是num[num[i]]的数和num相等
            if (nums[nums[i]] == nums[i]) {
                return nums[i];
            }

            // 交换
            int tmp = nums[i];
            nums[i] = nums[tmp];
            nums[tmp] = tmp;

        }
        return -1;
    }

}
