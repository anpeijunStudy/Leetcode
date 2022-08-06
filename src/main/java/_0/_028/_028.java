package _0._028;


/**
 * 实现 strStr()
 */
public class _028 {
}

class Solution {

    /**
     * 找出haystack中存放needle的起始索引
     *
     * @param haystack 大元素
     * @param needle   小元素
     * @return 起始索引
     */
    public int strStr(String haystack, String needle) {
        // 分别求的大小元素的长度
        int hatstackLength = haystack.length();
        int needleLength = needle.length();

        char[] haystackCharArray = haystack.toCharArray();
        char[] needleCharArray = needle.toCharArray();
        // 遍历循环比较
        // 其中最多比较hatstackLength-needleLength+1次
        for (int i = 0; i < (hatstackLength - needleLength) + 1; i++) {
            // 从大元素的每次匹配点和小元素的起始点
            int big = i, small = 0;

            // 进行比较-small下雨小元素的长度并且大小元素比较的元素都相等
            while (small < needleLength && haystackCharArray[big] == needleCharArray[small]) {
                big++;
                small++;
            }

            // 如果比较完毕之后的small长度等于小元素的长度
            // 存在相等，返回大元素下标
            if (small == needleLength) {
                return i;
            }
        }
        return -1;
    }
}
