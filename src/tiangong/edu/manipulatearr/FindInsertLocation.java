package tjpu.edu.manipulatearr;

/**
 * Created by Lwq on 2021/10/9 16:42
 * https://leetcode-cn.com/problems/search-insert-position/
 */
public class FindInsertLocation {
    public int searchInsert(int[] nums, int target) {
        int i = 0;
        if (nums[nums.length-1] < target) {
            return nums.length;
        }
        while (nums[i] < target) {
            i++;
        }
        return i;
    }
    
    
    /*
    官方题解
    二分查找
    int left = 0, right = nums.length-1;
    while (left <= right) {
        int mid = left + (right-left)/2;
        if (nums[mid] < target) {
            left = mid + 1;
        } else {
            right = mid - 1;
        }
    }
    return left;
    
     */
    
    
    public static void main(String[] args) {
        int[] arr = new int[]{1,3,5,6};
        int[] arr2 = new int[]{1};
        FindInsertLocation findInsertLocation = new FindInsertLocation();
        System.out.println(findInsertLocation.searchInsert(arr, 7));
    }
    
}
