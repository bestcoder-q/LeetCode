package tiangong.edu.manipulatearr;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Lwq on 2021/11/23 22:06
 * https://leetcode-cn.com/problems/missing-number/
 * 268.丢失的数字
 */
public class MissingNumber {
    public int findMissingNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        //初始化map
        for (int i = 0; i <= nums.length; ++i) {
            map.put(i, 0);
        }
        for (int i = 0; i < nums.length; ++i) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        for (Map.Entry<Integer, Integer> integerEntry : map.entrySet()) {
            if (map.get(integerEntry.getKey()) == 0) {
                return integerEntry.getKey();
            }
        }
        return -1;
    }

    
    public static void main(String[] args) {
        int[] nums = new int[]{0};
        MissingNumber missingNumber = new MissingNumber();
        System.out.println(missingNumber.findMissingNumber(nums));
    }
    
}
