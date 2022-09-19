package tiangong.edu.manipulatenum;

/**
 * Created by Lwq on 2021/12/17 21:52
 * https://leetcode-cn.com/problems/hamming-distance/
 * 461.汉明距离
 */
public class HammingDistance {
    /*
        方法1：
        我的思路是将x和y先转为二进制，放入等长数组中（较短的数前面补0），再遍历数组比较对应位置即可
     */
    public int getHammingDistance(int x, int y) {
        char[] char_x = convertDecimalToBinary(x).toCharArray();
        char[] char_y = convertDecimalToBinary(y).toCharArray();
        int longer_len = Math.max(char_x.length, char_y.length);
        char[] new_char_x = new char[longer_len];
        char[] new_char_y = new char[longer_len];
        
        int p = char_x.length - 1;
        int r = new_char_x.length - 1;
        while (p >= 0) {
            new_char_x[r] = char_x[p];
            p--;
            r--;
        }
        //将新数组的空位置补上 '0' , 注意这里是char类型的数组，定义数组时不会初始化为 '0'
        while (r >= 0) {
            new_char_x[r] = '0';
            r--;
        }
        
        int q = char_y.length - 1;
        int s = new_char_y.length - 1;
        while (q >= 0) {
            new_char_y[s] = char_y[q];
            q--;
            s--;
        }
        while (s >= 0) {
            new_char_y[s] = '0';
            s--;
        }
        
        int hamming_distance = 0;
        for (int i = 0; i < new_char_x.length; ++i) {
            if (new_char_x[i] != new_char_y[i]) {
                hamming_distance++;
            }
        }
        return hamming_distance;
    }
    
    //将十进制数转换成二进制
    public String convertDecimalToBinary(int num) {
        int newNum = 0;  //暂时记录新的二进制位
        String s = "";
        for (int i = num; i >= 1; i = i / 2) {
            if (i % 2 == 0) {
                newNum = 0;
            } else {
                newNum = 1;
            }
            s = newNum + s;
        }
        return s;
    }
    
    /*
        方法2：
        两个整数之间的汉明距离是对应位置上数字不同的位数
        可以使用异或运算解决
        异或运算当且仅当输入位不同时输出为1
        
        注：
        异或运算用 ^
        计算二进制表达中 1 的数量 可以使用内置方法 bitCount()
     */
    public int getHammingDistanceXOR(int x, int y) {
        return Integer.bitCount(x ^ y);
    }
    

    public static void main(String[] args) {
        HammingDistance hd = new HammingDistance();
        //System.out.println(hd.convertDecimalToBinary(1));
        //System.out.println(hd.convertDecimalToBinary(4));

        System.out.println(hd.getHammingDistance(1, 4));

        System.out.println(hd.getHammingDistanceXOR(1, 4));

//        System.out.println(1 ^ 4);
    }
    
}
