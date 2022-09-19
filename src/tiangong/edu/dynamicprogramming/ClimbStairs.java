package tiangong.edu.dynamicprogramming;

/**
 * Created by Lwq on 2021/10/15 12:08
 * https://leetcode-cn.com/problems/climbing-stairs/
 */
public class ClimbStairs {
    /*
    方法1：
    递归
    注意此方法在LeetCode提交会超出时间限制
     */
//    public int climb(int n) {
//        if (n == 1) {
//            return 1;
//        }
//        if (n == 2) {
//            return 2;
//        }
//        return climb(n-1) + climb(n-2);
//    }
    
    /*
    方法2
    优化的递归
    记忆化递归   
     */
//    public int climbStairs(int n) {
//        int[] memo = new int[n+1];
//        return climbStairsMemo(n, memo);
//    }
//    public int climbStairsMemo(int n, int[] memo) {
//        if (memo[n] > 0) {
//            return memo[n];
//        }
//        if (n == 1) {
//            memo[n] = 1;
//        } else if (n == 2) {
//            memo[n] = 2;
//        } else {
//            //n==2和n==1时不能执行下面的代码，会出现memo[-1]这种数组越界的情况，memo[1]和memo[2]需要人工赋值
//            memo[n] = climbStairsMemo(n-1, memo) + climbStairsMemo(n-2, memo);
//        }
//        return memo[n];
//    }
    
    
    /*
    方法3：
    动态规划
    时间复杂度：O(n)
    空间复杂度：O(n)
     */
//    public int climbStairs(int n) {
//        if (n == 1) {
//            return 1;
//        }
//        int[] dp = new int[n+1];
//        dp[1] = 1;
//        dp[2] = 2;
//        for (int i = 3; i <= n; i++) {
//            dp[i] = dp[i-1] + dp[i-2];
//        }
//        return dp[n];
//    }
    
    
    /*
    方法4：
    动态规划(优化)
    用滚动数组记录状态，将空间复杂度优化为O(1)
     */
    public int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }
        int first = 1;
        int second = 2;
        for (int i = 3; i <= n; i++) {
            int third = first + second;
            first = second;
            second = third;
        }
        return second;
    }
    
    
    public static void main(String[] args) {
        ClimbStairs cs = new ClimbStairs();
        System.out.println(cs.climbStairs(6));
    }
    
    
}
