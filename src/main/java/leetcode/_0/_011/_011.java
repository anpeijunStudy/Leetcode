package leetcode._0._011;

/**
 * @author anpeijun
 * @version 1.0
 * @description 盛最多水的容器
 * @date 2022/08/14/14:25
 */
public class _011 {
}


    class Solution {


        /**
         * 盛最多水的容器
         *
         * @param height 盛水的可能性
         * @return 最大容积
         */
        public int maxArea(int[] height) {
            // 使用左右指针去消除最大的可能性
            int left = 0, right = height.length - 1;
            int res = 0;

            // 遍历查找可能性
            while (left < right) {

                // right - left代表的是长度，后面的代表的是高度
                res = height[left] < height[right] ?
                        Math.max(res, (right - left) * height[left++]) :
                        Math.max(res, (right - left) * height[right--]);
            }
            return res;
        }
    }
