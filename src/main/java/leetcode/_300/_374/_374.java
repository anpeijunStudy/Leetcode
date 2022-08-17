package leetcode._300._374;

/**
 * @author anpeijun
 * @version 1.0
 * @description 猜数字大小
 * @date 2022/08/17/20:36
 */
public class _374 {
}

class Solution {


    /**
     * 二分查找解决
     *
     * @param n
     * @return
     */
    public int guessNumber(int n) {

        // 左右指针
        int left = 1, right = n;

        while (left < right) {

            int mid = left + (right - left) / 2;

            if (guess(mid) <= 0) right = mid;
            else left = mid + 1;
        }
        return left;
    }

    private int guess(int num) {
        return -1;
    }
}
