package tiangong.edu.manipulatestr;

/**
 * Created by Lwq on 2021/10/13 16:06
 * https://leetcode-cn.com/problems/add-binary/
 */
public class BinarySummation {
    /*
    方法1：
    转换成十进制数运算，将运算结果再转换回二进制
     */
//    public String addBinary(String a, String b) { 
//        return Integer.toBinaryString(Integer.parseInt(a, 2) + Integer.parseInt(b,2));
//    }
    
    /*
    方法2
     */
    public String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0; //carry n. 进位
        StringBuilder builder = new StringBuilder();
        //循环相加两个字符串相同长度的低位数部分
        while (i >= 0 && j >= 0) {
            int sum = carry;
            sum += a.charAt(i--) - '0';
            sum += b.charAt(j--) - '0';
            carry = sum/2;
            builder.append(sum%2);
        }
        //如果a还没遍历完成（a串比b串长）则继续遍历添加a剩余的部分
        while (i >= 0) {
            int sum = carry + a.charAt(i--) - '0';
            carry = sum/2;
            builder.append(sum%2);
        }
        //如果b还没有遍历完成（b串比a串长），则继续遍历添加b的剩余部分
        while (j >= 0) {
            int sum = carry + b.charAt(j--) - '0';
            carry = sum/2;
            builder.append(sum%2);
        }
        //如果carry不等于0还有个进位数没加进去，需要补充
        if (carry == 1) {
            builder.append(carry);
        }
        //反转字符串获得正常结果
        return builder.reverse().toString();
    }
    


    public static void main(String[] args) {
        BinarySummation bs = new BinarySummation();
        System.out.println(bs.addBinary("1010", "1011"));
    }
    
}
