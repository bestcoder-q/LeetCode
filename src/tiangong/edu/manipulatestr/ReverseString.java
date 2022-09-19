package tiangong.edu.manipulatestr;

/**
 * Created by Lwq on 2021/11/16 23:43
 * https://leetcode-cn.com/problems/reverse-string/
 * 344. 反转字符串
 */
public class ReverseString {
    public void reverse(char[] s) {
        int i = 0, j = s.length - 1;
        while (i < j) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            ++i;
            --j;
        }
    }

    public static void main(String[] args) {
        char[] s = new char[]{'h','e','l','l','o'};
        ReverseString reverseString = new ReverseString();
        reverseString.reverse(s);
        for (char c : s) {
            System.out.println(c);
        }
    }
    
}
