package tiangong.edu.manipulatearr;

import java.util.*;

/**
 * Created by Lwq on 2021/12/5 23:47
 * https://leetcode-cn.com/problems/find-all-numbers-disappeared-in-an-array/
 * 448. 找到所有数组中消失的数字
 */
public class DisappearedNumbers {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        //初始化哈希表
        for (int i = 1; i <= nums.length; ++i) {
            map.put(i, 0);
        }
        for (int i = 0; i < nums.length; ++i) {
            map.put(nums[i], map.getOrDefault(nums[i],0) + 1);
        }
        for (Map.Entry<Integer, Integer> next : map.entrySet()) {
            if (map.get(next.getKey()) == 0) {
                list.add(next.getKey());
            }
        }
        return list;
    }


    public static void main(String[] args) {
        int[] nums = new int[]{1,1};
        DisappearedNumbers dn = new DisappearedNumbers();
        List<Integer> res = dn.findDisappearedNumbers(nums);
        for (Integer re : res) {
            System.out.println(re);
        }
    }
    
}
