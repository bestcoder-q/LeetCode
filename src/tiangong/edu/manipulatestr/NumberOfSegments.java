package tiangong.edu.manipulatestr;

/**
 * Created by Lwq on 2021/12/6 21:54
 * https://leetcode-cn.com/problems/number-of-segments-in-a-string/
 * 434. 字符串中的单词数
 */
public class NumberOfSegments {
    public int countSegments(String s) {
        int count = 0;  //记录非空字符串个数
        if (s.length() == 0) {
            return 0;
        }
        String[] res = s.split(" ");
        for (String re : res) {
            if (!re.equals("")) {
                count++;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        String s = ", , , ,        a, eaefa";
        //String s = "    foo    bar";
        NumberOfSegments numberOfSegments = new NumberOfSegments();
        System.out.println(numberOfSegments.countSegments(s));
    }
    
}
