package 剑指offer._027._039;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author anpeijun
 * @version 1.0
 * @description 数组中出现次数超过一半的数字
 * @date 2022/08/16/23:53
 */
public class _039 {
    public static void main(String[] args) {

        int[] ints = {1, 2, 3, 4, 5, 4, 4, 4, 4, 3, 3, 3, 4, 5, 6};
        new Solution().majorityElement(ints);
    }
}

class Solution {


    /**
     * 数组中出现次数超过一半的数字
     *
     * @param nums 比较数组
     * @return 众数
     */
/*    public int majorityElement(int[] nums) {

        // 哈希表遍历存储key-存储数字，value-存储次数
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int num : nums) {
            if (!hashMap.containsKey(num)) {
                hashMap.put(num, 1);
            } else {
                hashMap.put(num, hashMap.get(num) + 1);
            }
        }

        int max = -1;
        // 遍历取出最大值
        Iterator<Integer> iterator = hashMap.keySet().iterator();
        while (iterator.hasNext()) {
            Integer key = iterator.next();
            if (max == -1 || hashMap.get(key) > hashMap.get(max)) {
                max = key;
            }
        }


        return max;
    }*/
/*    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }*/
    public int majorityElement(int[] nums) {

        // 众数一定是最多的，此时遍历，从第一个元素开始假定为众数，然后一次遍历，如果相等就加1，反之减1
        // 最后存在的肯定是众数
        int sum = 0, mode = 0;
        for (int num : nums) {
            if (sum == 0) mode = num;
            sum += mode == num ? 1 : -1;
        }
        return mode;
    }

}
