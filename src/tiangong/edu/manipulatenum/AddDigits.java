package tiangong.edu.manipulatenum;

/**
 * Created by Lwq on 2021/11/22 22:10
 * https://leetcode-cn.com/problems/add-digits/
 * 258. 各位相加
 */
public class AddDigits {
    /*
    方法1：双层while循环
     */
    public int addDigits(int num) {
        while (num >= 10) {
            int now = 0;
            while (num != 0) {
                now = now + (num % 10);
                num = num / 10;
            }
            num = now;
        }
        return num;
    }
    
    /*
    方法2：递归
     */
//    public int addDigits(int num) {
//        int sum = 0;
//        while (num != 0) {
//            sum = sum + (num % 10);
//            num = num /10;
//        }
//        if (sum % 10 == sum) {
//            return sum;
//        } else {
//            return addDigits(sum);
//        }
//    }
    

    public static void main(String[] args) {
        AddDigits ad = new AddDigits();
        System.out.println(ad.addDigits(632));
    }
    
}
