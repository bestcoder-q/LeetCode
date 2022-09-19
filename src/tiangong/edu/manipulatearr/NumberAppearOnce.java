package tjpu.edu.manipulatearr;

import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by Lwq on 2021/10/22 10:39
 * 136. https://leetcode-cn.com/problems/single-number/
 */
public class NumberAppearOnce {
    
    /*
    方法1：使用HashSet
    遍历数组判断，将第一次出现的元素添加到集合中，如果集合中存在（第二次出现），则删除，最后剩下的元素即为出现一次的元素
     */
//    public int singleNumber(int[] nums) {
//        HashSet<Integer> set = new HashSet<>();
//        for (int i = 0; i < nums.length; ++i) {
//            if (set.contains(nums[i])) {
//                set.remove(nums[i]);
//            } else {
//                set.add(nums[i]);
//            }
//        }
//        return set.iterator().next();
//    }
    
    /*
    方法2:使用HashMap
    1.用HashMap存储相应的数字和出现次数
    2.遍历HashMap找到value为1的数
     */
    public int singleNumber(int[] nums) {
        //1.使用HashMap存储相应的数字和出现次数
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; ++i) {
            map.put(nums[i],map.getOrDefault(nums[i],0) + 1);
        }
        //2.遍历HashMap
        for (Integer num : map.keySet()) {
            if (map.get(num) == 2) {
                return num;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2,2,1};
        NumberAppearOnce nao = new NumberAppearOnce();
        System.out.println(nao.singleNumber(nums));
    }
    
    
}
