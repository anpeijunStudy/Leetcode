package 剑指offer._011;


import java.util.Arrays;

/**
 * 旋转数组
 */
public class _011 {
}

class Solution {

    /**
     * 旋转数组的最小数字
     *
     * @param numbers 旋转之后的数组
     * @return 旋转的数字
     */
    public int minArray(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[0];
    }
}
