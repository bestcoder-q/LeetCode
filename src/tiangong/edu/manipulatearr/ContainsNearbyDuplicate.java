package tiangong.edu.manipulatearr;

import java.util.HashMap;

/**
 * Created by Lwq on 2021/11/9 21:55
 * https://leetcode-cn.com/problems/contains-duplicate-ii/
 * 219.存在重复元素（2）
 */
public class ContainsNearbyDuplicate {
    public boolean isContainsNearbyDuplicate(int[] nums, int k) {
        //key存数组中的值，value存索引(因为题目要对索引操作，将索引存到value上容易取)
        HashMap<Integer, Integer> map = new HashMap<>();
        int absDifference = 0;  //两数差的绝对值
        for (int i = 0; i < nums.length; ++i) {
            if (map.containsKey(nums[i])) {
                absDifference = Math.abs(map.get(nums[i]) - i);
                if (absDifference <= k) {
                    return true;
                }
            }
            map.put(nums[i], i);
        }
        return false;
    }


    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,1,2,3};
        ContainsNearbyDuplicate cnd = new ContainsNearbyDuplicate();
        System.out.println(cnd.isContainsNearbyDuplicate(nums, 2));
    }
    
}
