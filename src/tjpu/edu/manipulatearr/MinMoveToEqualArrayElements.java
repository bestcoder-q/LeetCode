package tjpu.edu.manipulatearr;

/**
 * Created by Lwq on 2021/12/7 22:31
 * https://leetcode-cn.com/problems/minimum-moves-to-equal-array-elements/
 * 453. 最小操作次数使数组元素相等
 */

/*
方法1：常规方法，但是超时
 */
public class MinMoveToEqualArrayElements {
    public int minMoves(int[] nums) {
        int count = 0;
        while (!isAllNumberEqual(nums)) {
            int max_index = findMax(nums);  //找到最大的数对应的index
            //addOne(nums, max_index);
            reduceOne(nums, max_index);
            count++;
        }
        return count;
    }
    //判断数组中的元素是否全部相等
    public boolean isAllNumberEqual(int[] nums) {
        for (int i = 1; i < nums.length; ++i) {
            if (nums[0] != nums[i]) {
                return false;
            }
        }
        return true;
    }
    //找最大的数，返回最大的数对应的下标
    public int findMax(int[] nums) {
        int max = nums[0];
        int max_index = 0;
        for (int i = 1; i < nums.length; ++i) {
            if (nums[i] > max) {
                max = nums[i];
                max_index = i;
            }
        }
        return max_index;
    }
    //除最大的数之外，全部加1
    public void addOne(int[] nums, int max_index) {
        for (int i = 0; i < nums.length; ++i) {
            if (i != max_index) {
                nums[i]++;
            }
        }
    }
    //最大的数减1（这样相当于除了最大的数全部+1）
    public void reduceOne(int[] nums, int max_index) {
        nums[max_index]--;
    }
    
    /*
    方法2：
    要计算让数组中所有元素相等的操作数，我们只需要计算将数组中所有元素都减少到数组中元素最小值所需的操作数
    n−1                          n−1
    ∑ nums[i]−min(nums)∗n     =>  ∑ (nums[i]−min(nums))
    i=0                          i=0
     */
    public int minMoves2(int[] nums) {
        int count = 0;
        int min = findMin(nums);
        for (int num : nums) {
            count = count + (num - min);
        }
        return count;
    }
    //找到数组中最小的数
    public int findMin(int[] nums) {
        int min = nums[0];
        for (int i = 1; i < nums.length; ++i) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        return min;
    }
    
    
    
    public static void main(String[] args) {
        int[] nums = {1,2,3,5};
        MinMoveToEqualArrayElements mmteae = new MinMoveToEqualArrayElements();
        int res = mmteae.minMoves2(nums);
        System.out.println(res);
    }
    
}
