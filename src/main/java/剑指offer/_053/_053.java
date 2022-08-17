package 剑指offer._053;

import java.util.HashMap;

/**
 * @author anpeijun
 * @version 1.0
 * @description 在排序数组中查找数字 I
 * @date 2022/08/17/16:52
 */
public class _053 {
}

class Solution {
    /**
     * 在排序数组中查找数字 I
     *
     * @param nums
     * @param target
     * @return
     */
    /*    public int search(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int num : nums) {
            if (!hashMap.containsKey(num)) {
                hashMap.put(num, 1);
            } else {
                hashMap.put(num, hashMap.get(num) + 1);
            }
        }

        if (hashMap.containsKey(target)) {
            return hashMap.get(target);
        } else {
            return -1;
        }
    }*/

    // 遍历查找
    /*    public int search(int[] nums, int target) {
        int number = 0;

        for (int num : nums) {

            if (num > target) break;
            if (num == target) {
                number++;
            }
        }

        return number;
    }*/

    // 二分查找
    public int search(int[] nums, int target) {
        // 左右指针
        int left = 0, right = nums.length - 1;
        // 数字和
        int count = 0;
        while (left < right) {
            int mid = (left + right) / 2;

            if (nums[mid] >= target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        while (left < nums.length && nums[left++] == target) {
            count++;
        }

        return count;
    }
}
