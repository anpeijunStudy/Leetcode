package _0._009;

import static com.sun.xml.internal.bind.WhiteSpaceProcessor.replace;

public class _009 {
}

class Solution {

    public boolean isPalindrome(int x) {
        //边界判断
        if (x < 0) return false;
        int div = 1;
        // 求出x是几位数
        while (x / div >= 10) {
            div *= 10;
        }

        // 循环进行比较左右值
        while (x > 0) {
            int left = x / div;
            int right = x % 10;

            // 左右不相等
            if (left != right) {
                return false;
            }
            x = (x % div) / 10;
            div /= 100;
        }
        return true;
    }
/*
    //内置Api，不建议使用
    // 反转之后转成数字进行再次比较
    public boolean isPalindrome(int x) {
        if (x<0){
            return false;
        }
        Long value = Long.valueOf(new StringBuffer(x + "").reverse().toString());

        if (value == x) {
            return true;
        }

        return false;
    }*/
}
