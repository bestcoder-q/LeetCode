package tjpu.edu.manipulatearr;

/**
 * Created by Lwq on 2021/11/18 11:36
 * https://leetcode-cn.com/problems/third-maximum-number/
 * 414.第三大的数
 */
public class ThirdMaximumNumber {
    public int thirdMax(int[] nums) {
        long first = Long.MIN_VALUE, second = Long.MIN_VALUE, third = Long.MIN_VALUE;
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] > first) {
                third = second;
                second = first;
                first = nums[i];
            } else if (nums[i] < first && nums[i] > second) {
                third = second;
                second = nums[i];
            } else if (nums[i] < second && nums[i] > third) {
                third = nums[i];
            }
        }
        return (int) (third != Long.MIN_VALUE ? third : first);
    }


    public static void main(String[] args) {
        int[] nums = new int[]{4,4,3,1};
        ThirdMaximumNumber tmn = new ThirdMaximumNumber();
        System.out.println(tmn.thirdMax(nums));
    }
    
}
