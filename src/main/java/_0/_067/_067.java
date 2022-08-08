package _0._067;

/**
 * 二进制求和
 */
public class _067 {
    public static void main(String[] args) {
        System.out.println(new Solution().addBinary("11", "1"));
    }
}

class Solution {

    /**
     * 二进制求和
     *
     * @param a A字符串
     * @param b B字符串
     * @return 和
     */
    public String addBinary(String a, String b) {
        StringBuilder builder = new StringBuilder();
        // 是否存在进位
        int carry = 0;
        // 循环添加-每个字符串从后向前想加，不存在时赋值为0
        for (int i = a.length() - 1, j = b.length() - 1; i >= 0 || j >= 0; i--, j--) {
            int sum = carry;
            //
            int x = i >= 0 ? a.charAt(i) - '0' : 0;
            int y = j >= 0 ? b.charAt(j) - '0' : 0;
            sum += (x + y);
            // 求模
            builder.append(sum % 2);
            // 取余
            carry = sum / 2;


        }
        // 反转字符串，转普通字符串
        if (carry == 1) builder.append(carry);
        return builder.reverse().toString();
    }
}
