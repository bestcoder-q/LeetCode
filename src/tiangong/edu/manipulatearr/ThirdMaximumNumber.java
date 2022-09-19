package tiangong.edu.manipulatearr;

import java.util.TreeSet;

/**
 * Created by Lwq on 2021/11/18 11:36
 * https://leetcode-cn.com/problems/third-maximum-number/
 * 414.第三大的数
 */
public class ThirdMaximumNumber {
    /*
        方法1：
        分别定义三个变量，first,second,third ，分别记录最大的数，第二大的数和第三大的数，**注意将三个变量初始化为Long.MIN_VALUE**
     */
//    public int thirdMax(int[] nums) {
//        long first = Long.MIN_VALUE, second = Long.MIN_VALUE, third = Long.MIN_VALUE;
//        for (int i = 0; i < nums.length; ++i) {
//            if (nums[i] > first) {
//                third = second;
//                second = first;
//                first = nums[i];
//            } else if (nums[i] < first && nums[i] > second) {
//                third = second;
//                second = nums[i];
//            } else if (nums[i] < second && nums[i] > third) {
//                third = nums[i];
//            }
//        }
//        return (int) (third != Long.MIN_VALUE ? third : first);
//    }
    
    /*
        方法2：有序集合
        关键是通过这个方法学会有序集合TreeSet的使用
        
        我们可以遍历数组，同时用一个**有序集合**来维护数组中前三大的数。
        具体做法是每遍历一个数，就将其插入有序集合，若有序集合的大小超过 3，就删除集合中的最小元素。
        这样可以保证有序集合的大小至多为 3，且遍历结束后，若有序集合的大小为 3，其最小值就是数组中第三大的数；
        若有序集合的大小不足 3，那么就返回有序集合中的最大值。
     */
    public int thirdMax(int[] nums) {
        TreeSet<Integer> s = new TreeSet<Integer>();
        for (int num : nums) {
            s.add(num);
            if (s.size() > 3) {
                s.remove(s.first());
            }
        }
        return s.size() == 3 ? s.first() : s.last();
    }


    public static void main(String[] args) {
        int[] nums = new int[]{4,4,3,1};
        ThirdMaximumNumber tmn = new ThirdMaximumNumber();
        System.out.println(tmn.thirdMax(nums));
    }
    
}
