package tjpu.edu.manipulatenum;

import java.util.HashSet;

/**
 * Created by Lwq on 2021/11/9 10:30
 * https://leetcode-cn.com/problems/happy-number/
 * 202.快乐数
 */

/*
    思路：找出过程中的重复数字避免进入无限循环
    方法1：集合法
 */
public class HappyNumber {
    //将n的各位数求平方和的方法
    public int bitSquareSum(int n) {
        int sum = 0, last;
        while (n > 0) {
            last = n % 10;
            sum = sum + last*last;
            n = n/10;
        }
        return sum;
    }
    
    /*
    - 初始化集合set,把n加入set
    - 把n替换为它每个位置上的数字的平方和，并加入set
    - 重复这个过程一直到出现数字1时返回true，或者新出现的数字已经存在set中时返回false
     */
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        set.add(n); //将最初的n放入set集合
        while (n != 1) {
            n = bitSquareSum(n);
            if (set.contains(n)) {
                return false;
            }
            set.add(n);
        }
        return true;
    }
    
    
    /*
        方法2：快慢指针法
        算法步骤：
        1.初始化两个数slow和fast为n
        2.在slow不等于fast的情况下，每次slow转换一次，fast转换两次
        3.当slow等于fast时，如果slow==1 则n是快乐数，否则不是
     */
//    public boolean isHappy(int n) {
//        int slow = n, fast = n;
//        //这里do while 循环派上用场了，因为要先执行一次循环体中的内容，第二次是否需要执行才根据判断条件决定
//        do {
//            slow = bitSquareSum(slow);
//            fast = bitSquareSum(fast);
//            fast = bitSquareSum(fast);
//        } while (slow != fast);
//        return slow == 1;
//    }
    
    
    public static void main(String[] args) {
        //测试求数字各位平方和的方法
        int n = 123;
        HappyNumber happyNumber = new HappyNumber();
        System.out.println(happyNumber.bitSquareSum(n));
        
        //测试判断快乐数的方法
        boolean res = happyNumber.isHappy(19);
        System.out.println(res);
    }
    
}
