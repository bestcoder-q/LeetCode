package tiangong.edu.manipulatenum;

/**
 * Created by Lwq on 2021/11/12 17:19
 * https://leetcode-cn.com/problems/power-of-two/
 * 231. 2的幂
 */
public class PowerOfTwo {
    /*
    方法1：
    2的幂一直除以2都能除开，因此一直除以2直到除不开或者得到1为止
     */
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        if (n == 1) {
            return true;
        }
        do {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                return false;
            }
        } while (n != 1);
        return true;
    }
    
    /*
    方法2：位运算
    技巧1：如果n是正整数 且 n & (n-1) == 0 ,那么n就是2的幂
    技巧2：如果n是正整数 且 n & (-n) == n , 那么n就是2的幂
     */
//    public boolean isPowerOfTwo(int n) {
//        //技巧1：
//        return n > 0 && (n & (n-1)) == 0;
//        
//        //技巧2：
//        //return n > 0 && (n & -n) == n;
//    }


    public static void main(String[] args) {
        PowerOfTwo powerOfTwo = new PowerOfTwo();
        System.out.println(powerOfTwo.isPowerOfTwo(0));
    }
    
}
