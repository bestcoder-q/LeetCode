package tjpu.edu.manipulatearr;

/**
 * Created by Lwq on 2021/4/26 22:46
 * https://leetcode-cn.com/problems/zai-pai-xu-shu-zu-zhong-cha-zhao-shu-zi-lcof/
 */
public class DigitalCounting {
    
    /**
     * 使用[1,4] , 4 测试有错误
     */
    public int search(int[] nums, int target) {
        int count = 0;
        if (nums.length > 1) {
            for (int i = 0; i < nums.length - 1; ) {
                if (nums[i] == target) {
                    do {
                        ++count;
                        ++i;
                    } while (nums[i] == target && i < nums.length - 1);
                    if (nums[i] == target) {
                        ++count;
                    }
                    break; //因为数组排好序的，相同的连续数字结束后跳出for循环即可
                }
                ++i;
            }
        } else if (nums.length == 1) {
            if (nums[0] == target) {
                count = 1;
            }
        }

        return count;
    }

    /**
     * 二分法
     */
    
    
    
    
    

    /*
        暴力遍历计数
     */
    public int search2(int[] nums, int target) {
        int count = 0;
        for (int num : nums) {
            if (num == target) {
                count++;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        DigitalCounting dc = new DigitalCounting();
        int[] arr = new int[]{5, 7, 7, 8, 8, 10, 4, 4, 4, 4, 4, 4, 4};
        int[] arr2 = new int[]{5, 7, 7, 8, 8, 10};
        int[] arr3 = new int[]{1,4};
        System.out.println(dc.search(arr3, 4));
    }
    

}
