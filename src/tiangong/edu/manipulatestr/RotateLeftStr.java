package tiangong.edu.manipulatestr;

/**
 * Created by Lwq on 2021/4/22 10:20
 * https://leetcode-cn.com/problems/zuo-xuan-zhuan-zi-fu-chuan-lcof/
 */
public class RotateLeftStr {
    public String reverseLeftWords(String s, int n) {
        String strArr[] = s.split("");
        String tempArr[] = new String[n];
        for (int i = 0; i < n; i++) {
            tempArr[i] = strArr[i];
        }
        for (int j = 0; j < s.length() - n; j++) {
            strArr[j] = strArr[j + n];
        }
        for (int k = s.length() - n, x = 0; k < s.length(); k++, x++) {
            strArr[k] = tempArr[x];
        }
//        for (int y = 0; y < strArr.length; y++) {
//            System.out.println(strArr[y]);
//        }
        //join和split是相反操作，split将字符串拆分到数组，join将数组中的元素组合起来
        return String.join("", strArr);
    }


    public static void main(String[] args) {
        RotateLeftStr rotateLeftStr = new RotateLeftStr();
        System.out.println(rotateLeftStr.reverseLeftWords("lrloseumgh", 6));
    }

}
