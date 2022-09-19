package tiangong.edu.manipulatearr;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Lwq on 2021/11/4 12:14
 * https://leetcode-cn.com/problems/majority-element/
 * 169. 多数元素
 */
public class MajorityElement {
    public int findMajorityElement(int[] nums) {
        /*
        方法1：哈希表
         */
        //1.遍历数组将数和对应的出现次数存入哈希表
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; ++i) {
            map.put(nums[i],map.getOrDefault(nums[i],0) + 1);
        }
        //2.找到哈希表中最大的value
        Object maxValue = getMaxValue(map);
        //3.根据哈希表中最大的value找到对应的key
        Object key = getKey(map, (Integer) maxValue);
        return (int) key;
    }
    
    /*
        遍历哈希表寻找最大的value
     */
    private static Object getMaxValue(HashMap<Integer, Integer> map) {
        if (map.size() == 0) {
            return null;
        }
        Collection<Integer> values = map.values();
        Object[] objects = values.toArray();
        Arrays.sort(objects);
        return objects[objects.length - 1];  //返回的是递增排序之后，数组的最后一个元素（最大值）
    }
    
    /*
    根据最大value寻找对应的key
     */
    private static Object getKey(HashMap<Integer, Integer> map, Integer value) {
        int key = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (value.equals(entry.getValue())) {
                key = entry.getKey();
            }
        }
        return key;
    }


    public static void main(String[] args) {
        int[] arr = new int[]{2,2,1,1,1,2,2};
        MajorityElement majorityElement = new MajorityElement();
        int element = majorityElement.findMajorityElement(arr);
        System.out.println(element);
    }
    
    
}
