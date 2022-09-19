package tjpu.edu.manipulatestr;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lwq on 2021/11/10 21:30
 * https://leetcode-cn.com/problems/valid-palindrome/
 * 125. 验证回文串
 */
public class PalindromeStr {
    public boolean isPalindrome(String s) {
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z' ||
                s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                list.add(s.charAt(i));
            }
            //把大写字母转换成小写存放，方便后面比较
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                list.add((char) (s.charAt(i) + 32));
            }
        }
        int p = 0, q = list.size()-1;
        while (p < q) {
            if (!list.get(p).equals(list.get(q))) {
                return false;
            }
            p++;
            q--;
        }
        return true;
    }


    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        String s2 = "";
        PalindromeStr palindromeStr = new PalindromeStr();
        System.out.println(palindromeStr.isPalindrome(s2));
    }
    
    
}
