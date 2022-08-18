package 剑指offer._058;

/**
 * @author anpeijun
 * @version 1.0
 * @description 左旋转字符串
 * @date 2022/08/18/0:49
 */
public class _058_02 {
}

class sSolution {

    /**
     * 左旋转字符串
     *
     * @param s
     * @param n
     * @return
     */
/*    public String reverseLeftWords(String s, int n) {
        return s.substring(n, s.length()) + s.substring(0, n);
    }*/
    public String reverseLeftWords(String s, int n) {

        StringBuilder builder = new StringBuilder();
        for (int i = n; i < s.length(); i++) {
            builder.append(s.charAt(i));
        }
        for (int i = 0; i < n; i++) {
            builder.append(s.charAt(i));
        }

        return builder.toString();
    }
}
