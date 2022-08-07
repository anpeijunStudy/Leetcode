package _200._344;

public class _344 {
}

class Solution {
    public void reverseString(char[] s) {

        int length = s.length;

        // 交换第一个和最后一个的元素，依次加加和减减，N/2
        for (int left = 0, right = length - 1; left < right; left++, right--) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
        }
    }
}
