package tiangong.edu.manipulatearr;

import java.util.Arrays;

/**
 * Created by Lwq on 2021/4/12 9:57
 * https://leetcode-cn.com/problems/da-yin-cong-1dao-zui-da-de-nwei-shu-lcof/
 */
public class PrintNDigits {
    public int[] printNumbers(int n) {
        int arrLength = (int) (Math.pow(10,n) - 1);
        int[] arr = new int[arrLength];
        for (int i = 1; i < Math.pow(10,n); i++) {
            arr[i-1] = i;
        }
        return arr;
    }


    public static void main(String[] args) {
        PrintNDigits printNDigits = new PrintNDigits();
        System.out.println(Arrays.toString(printNDigits.printNumbers(1)));
    }
    
    
}
