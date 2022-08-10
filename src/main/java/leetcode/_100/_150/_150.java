package leetcode._100._150;

import java.util.Stack;

/**
 * 后缀表达式
 */
public class _150 {
}

class Solution {
    public int evalRPN(String[] tokens) {
        // 创建一个栈，存放数
        Stack<Integer> integerStack = new Stack<>();
        // 遍历集合将数据存放到栈
        for (int i = 0; i < tokens.length; i++) {
            String token = tokens[i];
            // 判断是数还是符号，如果是数的话，压栈，反之出栈两个数进行计算
            Integer o1;
            Integer o2;
            Integer result;
            switch (token) {
                case "+":
                    o1 = integerStack.pop();
                    o2 = integerStack.pop();
                    result = o1 + o2;
                    integerStack.push(result);
                    break;
                case "-":
                    o1 = integerStack.pop();
                    o2 = integerStack.pop();
                    result = o2 - o1;
                    integerStack.push(result);
                    break;
                case "*":
                    o1 = integerStack.pop();
                    o2 = integerStack.pop();
                    result = o1 * o2;
                    integerStack.push(result);
                    break;
                case "/":
                    o1 = integerStack.pop();
                    o2 = integerStack.pop();
                    result = o2 / o1;
                    integerStack.push(result);
                    break;
                default:
                    integerStack.push(Integer.valueOf(token));
            }
        }
        return integerStack.pop();
    }
}
