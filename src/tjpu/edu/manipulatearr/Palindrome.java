package tjpu.edu.manipulatearr;

/**
 * Created by Lwq on 2021/4/15 19:48
 * https://leetcode-cn.com/problems/palindrome-number/
 */
public class Palindrome {
    public boolean isPalindrome(int x) {
        int originX = x;
        if (x > 0) {
            int count = 0; //记录要判断的数的位数
            while (x >= 1) { //求出要判断的数的位数，知道了位数，才能定义数组去放数字的每位数
                x = x / 10;
                count++;
            }
            int[] arr = new int[count];
            for (int i = 0; i < arr.length; i++) { //将要判断的数的每位分开放到数组里
                arr[i] = originX % 10;
                originX = originX / 10;
            }
            for (int j = 0, k = arr.length - 1; j <= arr.length / 2; j++, k--) { //判断是否是回文数
                if (arr[j] != arr[k]) {
                    return false;
                }
            }
            return true;
        } else if (x == 0) {
            return true;
        }
        return false; // x < 0 的情况，不是回文数
    }


    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        System.out.println(palindrome.isPalindrome(121));
    }

}
