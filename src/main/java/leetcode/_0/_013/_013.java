package leetcode._0._013;


/**
 * 罗马数字转整数
 */
public class _013 {
}

class Solution {
    public int romanToInt(String s) {
        // 得到字符数组和长度
        char[] charArray = s.toCharArray();
        int length = charArray.length;

        // num
        int num = 0;

        // 从第二位开始进行比较大小

        int pre = romanNumeralJudgment(charArray[0]);
        for (int i = 1; i < length; i++) {
            int next = romanNumeralJudgment(charArray[i]);

            // 判断前后两数大小
            if (pre < next) {
                num -= pre;
            } else {
                num += pre;
            }

            // 后移
            pre = next;
        }

        return num + pre;
    }

    private int romanNumeralJudgment(char romanNum) {

        // 罗马数字确定
        switch (romanNum) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}
