package leetcode._100._187;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author anpeijun
 * @version 1.0
 * @description 重复的DNA序列
 * @date 2022/08/18/20:46
 */
public class _187 {
}

class Solution {

    /**
     * 重复的DNA序列
     *
     * @param s
     * @return
     */
    public List<String> findRepeatedDnaSequences(String s) {

        // 储存结果
        ArrayList<String> list = new ArrayList<>();
        // 滑动窗口
        HashMap<String, Integer> hashMap = new HashMap<>();

        // 遍历
        for (int i = 0; i < s.length() - 10; i++) {

            String substring = s.substring(i, i + 10);

            int current = hashMap.getOrDefault(substring, 0);

            if (current == 1) list.add(substring);
            hashMap.put(substring, current + 1);
        }

        return list;
    }
}
