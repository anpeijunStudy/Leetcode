package _0._020;

import java.util.Stack;

public class _020 {
}

class Solution {
    public boolean isValid(String s) {
        // 判断字符串是否为空
        if (s.isEmpty()) {
            return true;
        }

        // 定义栈
        Stack<Character> stack = new Stack<Character>();

        // 遍历字符串
        for (char c : s.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.empty() || c != stack.pop())
                return false;
        }


        // 判断栈是否为空
        if (stack.empty())
            return true;
        return false;
    }
}
