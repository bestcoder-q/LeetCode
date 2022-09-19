package tjpu.edu.manipulatearr;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Lwq on 2021/12/15 21:21
 * https://leetcode-cn.com/problems/degree-of-an-array/
 * 697.数组的度
 */
public class DegreeOfArray {
    public int findShortestSubArray(int[] nums) {
        List<Integer> keyList = getNumDecideDegreeOfArray(nums);
        int degreeOfArray = keyList.get(keyList.size() - 1);  //keyList中存放的最后一个元素是数组的度，将其取出，并删掉这个元素
        keyList.remove(keyList.size() - 1);
        
        int min_length = 0;
        for (Integer it : keyList) {
            int length = 0;
            for (int i = 0; i < nums.length; ++i) {
                if (nums[i] == it) {
                    int start = i;
                }
//                length = 
            }
        }
        
        return -1;
    }
    
    //求数组的度是由哪个数字决定的
    //数组的度不一定由一个数字决定，如果两个数字出现次数相同，后续寻找子数组长度时需要比较
    public List<Integer> getNumDecideDegreeOfArray(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        //找到哈希表中最大的value和它对应的key（不一定有一个）
        int max_value = 0;
        List<Integer> keyList = new ArrayList<Integer>();  //用于存最大的value对应的key（不一定只有一个）
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() >= max_value) {
                if (entry.getValue() == max_value) {
                    keyList.add(entry.getKey());
                } else {
                    max_value = entry.getValue();
                    keyList.clear();  //说明之前存的key对应的value不是最大的，将链表清空即可
                    keyList.add(entry.getKey());
                }
            }
        }
        //将顺便求出来的数组的度放到keyList的最后一个
        keyList.add(max_value);
        return keyList;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,2,3,1,4,2,3,3};
        DegreeOfArray degreeOfArray = new DegreeOfArray();
        List<Integer> keyList = degreeOfArray.getNumDecideDegreeOfArray(nums);
        for (Integer it : keyList) {
            System.out.println(it);
        }
    }
    
}
