package leetcode._0._004;


import java.util.Arrays;

/**
 * 寻找两个正序数组的中位数
 */
public class _004 {
    public static void main(String[] args) {
        int[] ints2 = {2};
        int[] ints1 = {1, 3};
        System.out.println(new Solution().findMedianSortedArrays(ints1, ints2));
    }
}


class Solution {

/**
 * 寻找两个正序数组的中位数
 *
 * @param nums1
 * @param nums2
 * @return
 */
public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        // 合并输出
        int[] ints = new int[nums1.length + nums2.length];
        for (int i = 0; i < nums1.length; i++) {
        ints[i] = nums1[i];
        }
        for (int i = 0; i < nums2.length; i++) {
        ints[nums1.length + i] = nums2[i];
        }
        Arrays.sort(ints);

        System.out.println(Arrays.toString(ints));
        return ints.length % 2 == 1 ? (double) ints[ints.length / 2] : ((double) ints[ints.length / 2 - 1] + (double) ints[ints.length / 2]) / 2;
        }
        }
