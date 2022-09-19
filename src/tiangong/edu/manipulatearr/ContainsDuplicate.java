package tiangong.edu.manipulatearr;

import java.util.HashSet;

/**
 * Created by Lwq on 2021/11/9 21:36
 * https://leetcode-cn.com/problems/contains-duplicate/
 * 217.存在重复元素
 */
public class ContainsDuplicate {
    /*
    方法1：哈希表
    时间复杂度：O(n)
    空间复杂度：O(n)
     */
    public boolean isContainsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }

    /*
    方法2；可以先对数组排序，排序之后相同的数字肯定连着出现
    代码略
     */

    /*
    测试
     */
    public static void main(String[] args) {
        int[] nums = new int[]{1};
        ContainsDuplicate cd = new ContainsDuplicate();
        System.out.println(cd.isContainsDuplicate(nums));
    }
    
}
