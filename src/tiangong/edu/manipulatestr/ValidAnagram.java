package tiangong.edu.manipulatestr;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Lwq on 2021/11/22 21:17
 * https://leetcode-cn.com/problems/valid-anagram/
 */
public class ValidAnagram {
    /*
    方法1：哈希表
    自己想到和实现的
    学会使用.equals()比较两个哈希表是否相同（键和所有键对应的值相同）
     */
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> s_map = new HashMap<Character, Integer>();
        Map<Character, Integer> t_map = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); ++i) {
            if (s_map.containsKey(s.charAt(i))) {
                s_map.put(s.charAt(i), s_map.get(s.charAt(i)) + 1);
            } else {
                s_map.put(s.charAt(i), 1);
            }
        }
        for (int j = 0; j < t.length(); ++j) {
            if (t_map.containsKey(t.charAt(j))) {
                t_map.put(t.charAt(j), t_map.get(t.charAt(j)) + 1);
            } else {
                t_map.put(t.charAt(j), 1);
            }
        }
        //判断两个哈希表的键值是否相同
        //注：
        //判断两个哈希表的键以及它们对应的值是否完全相同可以直接使用 .equals()
        return s_map.equals(t_map);
    }


    public static void main(String[] args) {
        String s = "rat";
        String t = "car";
        ValidAnagram validAnagram = new ValidAnagram();
        System.out.println(validAnagram.isAnagram(s, t));
    }
    
}
