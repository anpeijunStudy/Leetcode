package leetcode._300._383;

public class _383 {
}


class Solution {
    /**
     * 给你两个字符串：ransomNote 和 magazine ，判断 ransomNote
     * 能不能由 magazine 里面的字符构成。如果可以，返回 true ；否则
     * 返回 false 。magazine 中的每个字符只能在 ransomNote 中使用一次。
     *
     * @param ransomNote
     * @param magazine
     * @return
     */
    public boolean canConstruct(String ransomNote, String magazine) {

        // 长度判断
        if (ransomNote.length() > magazine.length()) {
            return false;
        }

        // 构建两个数据进行比较
        int[] ran = new int[26];
        int[] mag = new int[26];

        // 分别遍历循环
        for (int i = 0; i < ransomNote.length(); i++) {
            ran[ransomNote.charAt(i) - 'a']++;
        }
        for (int i = 0; i < magazine.length(); i++) {
            mag[magazine.charAt(i) - 'a']++;
        }

        for (int i = 0; i < mag.length; i++) {
            if (ran[i] > mag[i]) {
                return false;
            }
        }

        return true;
    }
}
