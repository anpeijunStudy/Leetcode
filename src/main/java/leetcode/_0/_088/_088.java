package leetcode._0._088;

/**
 * @author anpeijun
 * @version 1.0
 * @description 合并有序数组
 * @date 2022/08/15/14:22
 */
public class _088 {
}

class Solution {

    /**
     * 合并有序数组
     * 从后遍历
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int length1 = m - 1;
        int length2 = n - 1;

        // 数组nums的长度
        int length = m + n - 1;
        while (length2 >= 0) {
            // 依次比较两个数组中的最大值
            nums1[length--] = nums1[length1] > nums2[length2] ? nums1[length1--] : nums2[length2--];
        }

        // 讲nums2中的剩余数字拷贝到nums1中去
        System.arraycopy(nums2,0,nums1,0,length2+1);
    }
}
