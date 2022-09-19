package tiangong.edu.manipulatestr;

import java.util.HashMap;

/**
 * Created by Lwq on 2021/11/8 12:25
 * 205.同构字符串
 * https://leetcode-cn.com/problems/isomorphic-strings/
 */
public class IsomorphicStr {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> mapS = new HashMap<>();
        HashMap<Character, Character> mapT = new HashMap<>();
        for (int i = 0; i < s.length(); ++i) {
            //同一个键如果对应两个值说明不同构
            //注意:一定要用两个哈希表，判断两个字符串分别做键的情况，这对应下面两个if
            //如果只用s做键，s = "badc"  t = "baba" 会返回true
            if (mapS.containsKey(s.charAt(i))) {
                if (!mapS.get(s.charAt(i)).equals(t.charAt(i))) {
                    return false;
                }
            }
            if (mapT.containsKey(t.charAt(i))) {
                if (!mapT.get(t.charAt(i)).equals(s.charAt(i))) {
                    return false;
                }
            }
            mapS.put(s.charAt(i), t.charAt(i));
            mapT.put(t.charAt(i), s.charAt(i));
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "egg";
        String t = "add";
        IsomorphicStr isomorphicStr = new IsomorphicStr();
        boolean res = isomorphicStr.isIsomorphic(s, t);
        System.out.println(res);
    }
    
    
}
