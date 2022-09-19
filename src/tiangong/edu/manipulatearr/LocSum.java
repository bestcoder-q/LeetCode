package tjpu.edu.manipulatearr;

import java.util.Arrays;

/**
 * Created by Lwq on 2021/4/29 9:47
 * https://leetcode-cn.com/problems/he-wei-sde-liang-ge-shu-zi-lcof/
 */
public class LocSum {
    /*
        此方法超时
     */
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        int flag = 0;
        if (nums.length == 1) {
            return null;
        }
        out:
        for (int i = 0; i < nums.length - 1; ++i) {
            for (int j = i + 1; j < nums.length; ++j) {
                if (nums[i] + nums[j] == target) {
                    res[0] = nums[i];
                    res[1] = nums[j];
                    flag = 1;
                    break out;
                }
            }
        }
        if (flag == 1) {
            return res;
        } else {
            return null;
        }
    }


    /**
     * 对撞双指针方法（重要）注意本题是有序数组
     */
    public int[] twoSum2(int[] nums, int target) {
        int i = 0, j = nums.length - 1;
        int[] res = new int[2];
        int flag = 0;
        while (i < j && flag == 0) {
            if (nums[i] + nums[j] < target) {
                i++;
            } else if (nums[i] + nums[j] > target) {
                j--;
            } else if (nums[i] + nums[j] == target) {
                res[0] = nums[i];
                res[1] = nums[j];
                flag = 1;
            }
        }
        if (flag == 1) {
            return res;
        } else {
            return null;
        }
    }


    public static void main(String[] args) {
        //int[] nums = new int[]{5,10,26,30,31,47,60};
        int[] nums = new int[]{10, 26, 30, 31, 47, 60};
        LocSum locSum = new LocSum();
        System.out.println(Arrays.toString(locSum.twoSum2(nums, 40)));
    }

}
