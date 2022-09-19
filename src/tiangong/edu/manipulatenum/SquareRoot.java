package tiangong.edu.manipulatenum;

/**
 * Created by Lwq on 2021/10/13 20:38
 * https://leetcode-cn.com/problems/sqrtx/
 */
public class SquareRoot {
    /*
    暴力：
    这个方法提交时超出时间限制
     */
//    public int mySqrt(int x) {
//        int i = 0;
//        while (i*i < x) {
//            ++i;
//        }
//        return (i*i <= x)?i:i-1;
//    }

    /*
    二分查找法
     */
    public int mySqrt(int x) {
        //特殊值判断
        //不进行0和1的特殊值判断，计算mid时0会出现在除数上，出现错误
        if (x == 0) {
            return 0;
        }
        if (x == 1) {
            return 1;
        }
        int left = 0, right = x;
        int mid = -1;
        while (left <= right) {
            mid = left + (right - left)/2;
            if (x / mid > mid) {  //注：这里使用mid*mid会溢出，故采用 x/mid
                left = mid + 1;
            } else if (x / mid < mid) {
                right = mid - 1;
            } else {
                return mid;
            }
        }
        return left - 1;
    }

    public static void main(String[] args) {
        SquareRoot sr = new SquareRoot();
        System.out.println(sr.mySqrt(2147395600));
        System.out.println(sr.mySqrt(1000000000));
        System.out.println(sr.mySqrt(1));
    }
    
}
