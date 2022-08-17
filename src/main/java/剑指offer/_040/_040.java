package 剑指offer._040;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author anpeijun
 * @version 1.0
 * @description 最小的k个数
 * @date 2022/08/17/0:45
 */
public class _040 {
    public static void main(String[] args) {
        int[] ints = {3, 2, 1};
        System.out.println(Arrays.toString(new Solution().getLeastNumbers(ints, 1)));
        ;
    }
}

class Solution {

    /**
     * 最小的k个数
     *
     * @param arr
     * @param k
     * @return
     */
    // 不重复的最小值
    /*public int[] getLeastNumbers(int[] arr, int k) {
        Set<Integer> set = new TreeSet<Integer>();

        for (int num : arr) {
            set.add(num);
        }

        int[] ints = new int[k];
        for (Integer integer : set) {
            ints[--k] =integer;
            if (k == 0) break;
        }
        return ints;
    }*/

    public int[] getLeastNumbers(int[] arr, int k) {

        Arrays.sort(arr);
        int[] ints = new int[k];
        System.arraycopy(arr,0,ints,0,k);
        return ints;
    }
}
