package _300._380;


import java.util.*;

/**
 * O(1) 时间插入、删除和获取随机元素
 */
public class _380 {
    public static void main(String[] args) {
        RandomizedSet obj = new RandomizedSet();
        boolean param_1 = obj.insert(1);
        boolean param_2 = obj.remove(2);
        int param_3 = obj.getRandom();
    }
}

class RandomizedSet {

    Random random;
    List<Integer> nums;
    Map<Integer, Integer> table;


    /**
     * 初始化类
     */
    public RandomizedSet() {
        random = new Random();
        nums = new ArrayList<>();
        table = new HashMap<>();
    }

    /**
     * 添加一个值
     *
     * @param val 添加值
     * @return 添加结果
     */
    public boolean insert(int val) {
        // 是否存在
        if (table.containsKey(val)) {
            return false;
        }
        // 获得值的索引
        int size = nums.size();
        // 添加值
        nums.add(val);
        table.put(val, size);
        return true;
    }

    /**
     * 移除
     *
     * @param val 移除值
     * @return 移除结果
     */

    public boolean remove(int val) {
        // 不存在val
        if (!table.containsKey(val)) {
            return false;
        }

        // 获取val在nums中的索引
        Integer index = table.get(val);
        // 交换删除的位置索引和最后一个
        int last = nums.get(nums.size() - 1);
        nums.set(index, last);

        table.put(last, index);

        nums.remove(nums.size()-1);
        table.remove(val);

        return true;

    }


    /**
     * 获取一个随机值
     *
     * @return 获取随机值
     */
    public int getRandom() {
        return nums.get(random.nextInt(nums.size()));
    }
}
