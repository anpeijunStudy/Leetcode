package 剑指offer._029;

/**
 * @author anpeijun
 * @version 1.0
 * @description 顺时针打印矩阵
 * @date 2022/08/17/12:34
 */
public class _029 {
    public static void main(String[] args) {

    }
}

class Solution {
    /**
     * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字。
     *
     * @param matrix 矩阵
     * @return 矩阵数组
     */
    public int[] spiralOrder(int[][] matrix) {

        // 判断
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) return new int[0];

        // 顺时针读取数组
        int left = 0, right = matrix[0].length - 1, up = 0, bottom = matrix.length - 1;
        int x = 0;// 新数组的自增量
        // 定义新的数组
        int[] nums = new int[(right + 1) * (bottom + 1)];

        // 遍历循环矩阵
        while (true) {
            // 从左到右
            for (int i = left; i <= right; i++) {
                nums[x++] = matrix[up][i];
            }
            if (++up > bottom) break; // 上部大于下部-退出循环-否则加一，使不再参加下一次循环

            // 从上到下
            for (int i = up; i <= bottom; i++) {
                nums[x++] = matrix[i][right];
            }
            if (left > --right) break;

            // 从右到左
            for (int i = right; i >= left; i--) {
                nums[x++] = matrix[bottom][i];
            }
            if (up > --bottom) break; // 上大于下

            // 从下到上
            for (int i = bottom; i >= up; i--) {
                nums[x++] = matrix[i][left];
            }
            if (++left > right) break;
        }

        return nums;
    }
}
