package tjpu.edu.manipulatestr;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Lwq on 2021/4/23 21:46
 * https://leetcode-cn.com/problems/word-pattern/
 * 290.单词规律
 * HashMap的使用
 */
public class WordLawUseHashMap {
    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> map1 = new HashMap<>();
        Map<String, Character> map2 = new HashMap<>();
        String[] s_handle = s.split(" ");
        if (pattern.length() != s_handle.length) {
            return false;
        }
        for (int i = 0; i < pattern.length(); ++i) {
            if (map1.containsKey(pattern.charAt(i))) {
                if (!map1.get(pattern.charAt(i)).equals(s_handle[i])) {
                    return false;
                }
            }
            map1.put(pattern.charAt(i), s_handle[i]);
        }
        for (int i = 0; i < s_handle.length; ++i) {
            if (map2.containsKey(s_handle[i])) {
                if (!map2.get(s_handle[i]).equals(pattern.charAt(i))) {
                    return false;
                }
            }
            map2.put(s_handle[i], pattern.charAt(i));
        }
        return true;
    }


    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog dog dog dog";
        WordLawUseHashMap wordLawUseHashMap = new WordLawUseHashMap();
        System.out.println(wordLawUseHashMap.wordPattern(pattern, s));
    }
    
}
