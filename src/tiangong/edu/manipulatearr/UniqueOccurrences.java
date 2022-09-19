package tiangong.edu.manipulatearr;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by Lwq on 2021/4/13 23:33
 * https://leetcode-cn.com/problems/unique-number-of-occurrences/
 * 
 * 注意通过本题学习for循环的另一种遍历方式
 * 
 * 本题利用哈希表解决
 * 首先使用哈希表记录每个数字的出现次数，然后利用新的哈希表统计不同的出现次数的数目
 * 如果不同的出现次数的数目等于不同数字的数目，则返回true，否则返回false
 */
public class UniqueOccurrences {
    public boolean uniqueOccurrences(int[] arr) { 
        Map<Integer, Integer> occur = new HashMap<>();
        for (int i : arr) {
            occur.put(i,occur.getOrDefault(i,0) + 1);
        }
        Set<Integer> times = new HashSet<>();
        for (Map.Entry<Integer, Integer> x : occur.entrySet()) {
            times.add(x.getValue());
        }
//        System.out.println(occur.size());
//        System.out.println(times.size());
        return times.size() == occur.size();
    }


    public static void main(String[] args) {
        int[] arr = new int[]{-3,0,1,-3,1,1,1,-3,10,0};
        int[] arr2 = new int[]{1,2};
        UniqueOccurrences uo = new UniqueOccurrences();
        System.out.println(uo.uniqueOccurrences(arr));
    }
    

}
