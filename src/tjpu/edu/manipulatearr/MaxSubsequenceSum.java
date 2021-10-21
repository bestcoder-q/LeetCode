package tjpu.edu.manipulatearr;

/**
 * Created by Lwq on 2021/10/11 11:41
 * https://leetcode-cn.com/problems/maximum-subarray/
 */
public class MaxSubsequenceSum {
    /*
    贪心法
     */
    public int maxSubArray(int[] nums) {
        int result = nums[0]; //记录最大和(注意result不要初始化为0，这样数组只有负数时会出错)
        int sum = 0; //记录当前和
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            result = Math.max(result, sum);
            if (sum < 0) {
                sum = 0;
            }
        }
        return result;
    }
    
    /*
    动态规划
     */
//    public int maxSubArray(int[] nums) {
//        int pre = 0, maxAns = nums[0];
//        for (int num : nums) {
//            pre = Math.max(pre+num, num);
//            maxAns = Math.max(maxAns, pre);
//        }
//        return maxAns;
//    }
    

    public static void main(String[] args) {
        int[] arr = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        int[] arr2 = new int[]{-1};
        MaxSubsequenceSum mss = new MaxSubsequenceSum();
        System.out.println(mss.maxSubArray(arr2));
    }
    
    
}
