package tiangong.edu.manipulatestr;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Lwq on 2021/12/11 21:55
 * https://leetcode-cn.com/problems/longest-palindrome/
 * 409. 最长回文串
 */
public class LongestPalindrome {
    
    /*
    开始我的思路是将字符串的所有字串和它们的排列情况全部找到，然后挨个去判断是不是回文串
    显然这种做法复杂度太高
    
    答案思路：贪心
    -回文串的本质：（可能除去一个字母外）其它字母都出现偶数次
    -最长回文串的构成：使所有字母尽可能多的出现偶数次+1次，（如果此时还有字母没用完）
    注：
    题目只是让我们找最长回文串的长度，找到需要用多少字母构成这个串即可，这个回文串具体是什么样子，我们不需要管
     */
    public int findLongestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int count = 0;
        for (int i = 0; i < s.length(); ++i) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() >= 2) {
                if (entry.getValue() % 2 == 0) {
                    count += entry.getValue();
                } else {
                    count += entry.getValue() - 1;
                }
            }
        }
        if (count == s.length()) {
            return count;
        }
        return count + 1;
    }
    
    //反转字符串（这个方法用不到了）
    public boolean isPalindrome(String s) {
        String s_reverse = new StringBuilder(s).reverse().toString();
        return s.equals(s_reverse);
    }


    public static void main(String[] args) {
        String s = "abccccdd";
        LongestPalindrome lp = new LongestPalindrome();
        System.out.println(lp.findLongestPalindrome(s));
    }
    
}
