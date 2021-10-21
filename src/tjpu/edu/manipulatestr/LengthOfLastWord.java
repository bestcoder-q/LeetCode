package tjpu.edu.manipulatestr;

/**
 * Created by Lwq on 2021/10/13 10:27
 * https://leetcode-cn.com/problems/length-of-last-word/
 */
public class LengthOfLastWord {
    /*
    反向遍历
    题目要求得到字符串中最后一个单词的长度，可以反向遍历字符串，寻找最后一个单词并计算其长度。
     */
    public int calculateLength(String s) {
        int lastLength = 0;
        for (int i = s.length()-1; i >=0; i--) {
            if (s.charAt(i) == ' ' && lastLength == 0) { //字符串末尾有空格的情况
                continue;
            } else if (s.charAt(i) == ' ' && lastLength != 0) {
                break;
            }
            lastLength++;
        }
        return lastLength;
    }


    public static void main(String[] args) {
        String s = "Hello World";
        String s2 = "   fly me   to   the moon  ";
        String s3 = "luffy is still joyboy";
        LengthOfLastWord lengthOfLastWord = new LengthOfLastWord();
        System.out.println(lengthOfLastWord.calculateLength(s2));
    }
    
}
