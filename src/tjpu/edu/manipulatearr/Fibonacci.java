package tjpu.edu.manipulatearr;

/**
 * Created by Lwq on 2021/4/23 23:01
 * https://leetcode-cn.com/problems/fibonacci-number/
 */
public class Fibonacci {
    /*
        递归方法解决fibonacci数列
        注：使用递归注意设置正确的递归出口
        递归方法的时间复杂度太高
     */
    public int fib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fib(n-1) + fib(n-2);
    }
    
    /*
        解法2:动态规划
        由于斐波那契数列存在递推关系，因此可以使用动态规划求解
        动态规划的状态转移方程是递推关系：F(n)=F(n−1)+F(n−2)
        边界条件为F(0) 和 F(1)
        由于 F(n) 只和 F(n-1) 与 F(n−2) 有关，因此可以使用「滚动数组思想」把空间复杂度优化成 O(1)
     */
    public int fib2(int n) {
        if (n < 2) {
            return n;
        }
        int p = 0, q = 0, r = 1;
        for (int i = 2; i <= n; ++i) {
            p = q;
            q = r;
            r = p + q;
        }
        return r;
    }
    
    
    
    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        //测试递归方法
        System.out.println(fibonacci.fib(4));
        //测试动态规划方法
        System.out.println(fibonacci.fib2(4));
    }
    
}
