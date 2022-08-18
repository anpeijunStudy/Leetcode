package 剑指offer._057;

import java.util.ArrayList;

/**
 * @author anpeijun
 * @version 1.0
 * @description 和为 s 的连续正数序列
 * @date 2022/08/18/16:50
 */
public class _057_02 {
}

class Solution {

    /**
     * 和为 s 的连续正数序列
     *
     * @param target
     * @return
     */
    public int[][] findContinuousSequence(int target) {
        // 滑动窗口
        int left = 1, right = 2, sum = 3;
        // 存储结果
        ArrayList<int[]> list = new ArrayList<>();

        while (left < right) {
            if (sum == target) {
                int[] ints = new int[right - left + 1];
                for (int i = left; i <= right; i++) {
                    ints[i - left] = i;
                }
                // 添加到集合
                list.add(ints);
            }

            // 左指针相加
            if (sum >= target) {
                sum -= left;
                left++;
            } else {
                right++;
                sum += right;
            }
        }
        return list.toArray(new int[0][]);
    }
}
