package 剑指offer._017;


/**
 * 打印n位数
 */
public class _017 {
}

class Solution {


    public int[] printNumbers(int n) {
        int pow = (int) Math.pow(10, n);
        int[] array = new int[pow];

        for (int i = 1; i < pow; i++) {
            array[i] = i;
        }

        return array;
    }
}
