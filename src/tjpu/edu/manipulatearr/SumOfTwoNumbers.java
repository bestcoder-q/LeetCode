package tjpu.edu.manipulatearr;

import java.util.Arrays;

/**
 * Created by Lwq on 2021/4/8 19:53
 * https://leetcode-cn.com/problems/two-sum/
 */
public class SumOfTwoNumbers {
    public int[] twoSum(int[] nums, int target){
        int[] loc = new int[2];
        outer: for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    loc[0] = i;
                    loc[1] = j;
                    break outer;
                }
                //System.out.println(i);
                //System.out.println(j);
            }
        }
        return loc;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3, 2, 4};
        SumOfTwoNumbers sumOfTwoNumbers = new SumOfTwoNumbers();
        //sumOfTwoNumbers.twoSum(arr, 4);
        System.out.println(Arrays.toString(sumOfTwoNumbers.twoSum(arr, 6)));
    }
}
