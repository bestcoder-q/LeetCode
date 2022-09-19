package tiangong.edu.manipulatestr;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lwq on 2021/11/11 21:12
 * https://leetcode-cn.com/problems/summary-ranges/
 * 228.汇总区间
 */
public class SummaryRanges {
    public List<String> doSummaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();
        if (nums.length == 1) {
            list.add(nums[0] + "");
        }
        int p = 0, q = 1;
        while (p < nums.length && q < nums.length) {
            while (nums[q] - nums[p] == q - p && q < nums.length - 1) {
                q++;
            }
            if (q == nums.length - 1 && nums[q] - nums[p] == q - p) {  //结束条件是因为q走到了最后
                list.add(nums[p] + "->" + nums[q]);
                break;
            } else if (nums[p] == nums[q-1]) {  //只有一个连续元素
                list.add(nums[p] + "");
            } else {  //有至少两个连续元素，需要加 ->
                list.add(nums[p] + "->" + nums[q-1]);
            }
            p = q;
            if (p == nums.length - 1) {  //p == nums.length - 1说明只剩一个元素了，再执行q = p + 1会有空指针
                list.add(nums[p] + "");
                break;
            } else {
                q = p + 1;
            }
        }
        return list;
    }


    public static void main(String[] args) {
        int[] nums = new int[]{0,1,2,4,5,7};
        int[] nums2 = new int[]{0,2,3,4,6,8,9};
        int[] nums3 = new int[]{-1};
        SummaryRanges summaryRanges = new SummaryRanges();
        List<String> list = summaryRanges.doSummaryRanges(nums2);
        for (String s : list) {
            System.out.println(s);
        }
    }
    
}
