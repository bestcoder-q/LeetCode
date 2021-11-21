package tjpu.edu.manipulatestr;

/**
 * Created by Lwq on 2021/11/16 20:42
 * https://leetcode-cn.com/problems/add-strings/
 * 415. 字符串相加
 */
public class AddStrings {
    /*
        自己的做法和实现：
        将两个字符串的每一个数分别放到一个数组中，（转换为int类型存放）
        再定义一个数组用来存储结果（注意这个数组多一位，因为可能存在相加后位数增加的情况）
     */
    public String addString(String num1, String num2) {
        int arr_length = Math.max(num1.length(), num2.length());
        int[] num1_arr = new int[arr_length];
        int[] num2_arr = new int[arr_length];
        int[] num3_arr = new int[arr_length + 1]; //可能两数相加和多一位
        for (int j = num1.length() - 1, loc = num1_arr.length - 1; j >= 0; --j, --loc) {
            num1_arr[loc] = num1.charAt(j) - '0';
        }
        for (int j = num2.length() - 1, loc = num2_arr.length - 1; j >= 0; --j, --loc) {
            num2_arr[loc] = num2.charAt(j) - '0';
        }
        
        int p = arr_length - 1;
        while (p >= 0) {
            if (num3_arr[p+1] + num1_arr[p] + num2_arr[p] < 10) {
                //这里num3_arr[p+1]位置上原来的数也要加上，因为之前如果有进位的情况，会保存在这里
                num3_arr[p+1] = num3_arr[p+1] + (num1_arr[p] + num2_arr[p]);
            } else {  //有进位的情况
                num3_arr[p+1] = (num3_arr[p+1] + num1_arr[p] + num2_arr[p]) % 10;
                num3_arr[p] = num3_arr[p] + 1;
            }
            p--;
        }
        //因为存储结果的数组是多一位的，所以第一个数可能是0，这里做一下判断
        int start;
        if (num3_arr[0] == 0) {
            start = 1;
        } else {
            start = 0;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = start; i < num3_arr.length; ++i) {
            sb.append(num3_arr[i]);
        }
        return sb.toString();
    }


    public static void main(String[] args) {
        String num1 = "584";
        String num2 = "18";
        AddStrings addStrings = new AddStrings();
        String s = addStrings.addString(num1, num2);
        System.out.println(s);
    }
    
}
