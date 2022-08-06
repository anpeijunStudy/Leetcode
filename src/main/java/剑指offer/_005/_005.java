package 剑指offer._005;


/**
 * 字符组替换
 */
public class _005 {
}

class Solution {


    /**
     * 可变字符串替换
     * StringBuffer线程安全
     * StringBuilder线程不安全，但是速度快
     *
     * @param s
     * @return
     */
    public String replaceSpace(String s) {
        StringBuilder strings = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == ' ') {
                strings.append("%20");
            } else {
                strings.append(s.charAt(i));
            }
        }

        return String.valueOf(strings);
    }
}
