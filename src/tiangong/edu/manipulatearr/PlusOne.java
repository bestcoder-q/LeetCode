package tjpu.edu.manipulatearr;

/**
 * Created by Lwq on 2021/10/13 11:56
 * https://leetcode-cn.com/problems/plus-one/
 */
public class PlusOne {
    public int[] plus(int[] digits) {
        for (int i = digits.length-1; i >= 0; i--) {
            digits[i]++;
            if (digits[i]%10 != 0) {
                return digits;
            }
            digits[i] = 0;
        }
        digits = new int[digits.length+1];
        digits[0] = 1;
        return digits;
    }


    public static void main(String[] args) {
        int[] digits = new int[]{9,9,9,9};
        PlusOne po = new PlusOne();
        digits = po.plus(digits);
        for (int digit : digits) {
            System.out.println(digit);
        }
    }
    
}
