package tjpu.edu.manipulatestr;

/**
 * Created by Lwq on 2021/4/26 9:46
 * https://leetcode-cn.com/problems/to-lower-case/
 * <p>
 * 字符类型大小写字母和数字的ASCII码值的范围
 * a-z:97-122   A-Z:65-90   0-9:48-57
 */
public class ConvertToLowercase {
    public String toLowerCase(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        String[] resArr = new String[str.length()];
        char[] charArr = new char[str.length()];
        for (int i = 0; i < str.length(); ++i) {
            charArr[i] = str.charAt(i); //将字符串类型转换成char,字符型 （方便进行大小写转换）
            if (charArr[i] <= 90 && charArr[i] >= 65) { //字符为A-Z时转换（+32），其它情况不能 +32
                charArr[i] += 32;
            }
            resArr[i] = String.valueOf(charArr[i]);
        }
        return String.join("", resArr);
    }

    /**
     * 解法2 思路相同，只是对字符串和字符之间的处理转换较为简化
     */
    public String toLowerCase2(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        char[] ch = str.toCharArray();
        for (int i = 0; i < str.length(); ++i) {
            if (ch[i] >= 'A' && ch[i] <= 'Z') {
                ch[i] += 32;
            }
        }
        return String.valueOf(ch);
    }


    public static void main(String[] args) {
        ConvertToLowercase ctl = new ConvertToLowercase();
        //String arr = "HeLlo";
        String arr = "Ahello123KZ";
        //String arr = null;
        System.out.println(ctl.toLowerCase(arr));
    }


}
