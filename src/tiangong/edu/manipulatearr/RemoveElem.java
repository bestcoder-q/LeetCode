package tjpu.edu.manipulatearr;

/**
 * Created by Lwq on 2021/10/7 21:17
 * https://leetcode-cn.com/problems/remove-element/
 */
public class RemoveElem {
    public int removeElement(int[] nums, int val) {
        int i = 0, j = nums.length;
        while (i < j) {
            if (nums[i] == val) {
                if (nums[j-1] != val) {
                    nums[i] = nums[j-1];
                    j--;
                    i++;
                } else {
                    j--;
                }
            } else {
                i++;
            }
        }
        return i;
    }
    
    //官方题解
    /*
    class Solution {
        public int removeElement(int[] nums, int val) {
            int left = 0;
            int right = nums.length;
            while (left < right) {
                if (nums[left] == val) {
                    nums[left] = nums[right - 1];
                    right--;
                } else {
                    left++;
                }
            }
            return left;
        }
    }
     */
    

    public static void main(String[] args) {
        int[] arr = new int[]{3,2,2,3};
        int[] arr2 = new int[]{0,1,2,2,3,0,4,2};
        int[] arr3 = new int[]{1};
        
        RemoveElem removeElem = new RemoveElem();
        System.out.println(removeElem.removeElement(arr3, 1));
    }
    
}
