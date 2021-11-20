package tjpu.edu.manipulatearr;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lwq on 2021/11/19 22:10
 * https://leetcode-cn.com/problems/intersection-of-two-arrays/
 * 349. 两个数组的交集
 */
public class IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < nums1.length; ++i) {
            for (int j = 0; j < nums2.length; ++j) {
                if (nums1[i] == nums2[j]) {
                    if (!list.contains(nums1[i])) {
                        list.add(nums1[i]);
                    }
                    break;
                }
            }
        }
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); ++i) {
            res[i] = list.get(i);
        }
        return res;
    }
}
