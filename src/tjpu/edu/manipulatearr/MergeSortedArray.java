package tjpu.edu.manipulatearr;

import java.util.Arrays;

/**
 * Created by Lwq on 2021/10/19 10:31
 * 88. https://leetcode-cn.com/problems/merge-sorted-array/
 */
public class MergeSortedArray {
    /*
    法1：
    思路：先将nums2中的元素全部放到nums1后面，再对数组进行一次排序
     */
//    public void merge(int[] nums1, int m, int[] nums2, int n) {
//        //1.将nums2中的元素全部放到nums1中
//        for (int i = m,j = 0; i < m+n&&j < n; i++,j++) {
//            nums1[i] = nums2[j];
//        }
//        //System.arraycopy(nums2,0,nums1,m,n);  //使用工具类进行数组复制
//        
//        //2.对含有nums2元素的nums1进行排序
//        bubbleSort(nums1);
//        //Arrays.sort(nums1);  //使用工具类进行数组排序（使用的是快排）
//    }
    /*
    冒泡排序
     */
    public void bubbleSort(int[] nums) {
        for (int i = nums.length - 1; i > 0; --i) {
            for (int j = 0; j < i; ++j) {
                if (nums[j] > nums[j+1]) {
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
    }


    /*
    法2：双指针，从前向后
    思路：
    这种方法需要额外的一个数组保存nums1的元素
    分别用两个指针遍历两个数组（nums1_copy和nums2），将指针指向的数小的元素复制到nums1中
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums1_copy = new int[m];
        System.arraycopy(nums1,0,nums1_copy,0,m);
        int p1 = 0;
        int p2 = 0;
        int p = 0;
        while (p1 < m && p2 < n) {
            if (nums1_copy[p1] <= nums2[p2]) {
                nums1[p] = nums1_copy[p1];
                p++;
                p1++;
            } else {
                nums1[p] = nums2[p2];
                p++;
                p2++;
            }
        }
        if (p1 < m) {
            System.arraycopy(nums1_copy,p1,nums1,p,m-p1);
        }
        if (p2 < n) {
            System.arraycopy(nums2,p2,nums1,p,n-p2);
        }
    }
    
    /*
    法3：双指针，从后向前
     */
//    public void merge(int[] nums1, int m, int[] nums2, int n) {
//        int p1 = m-1;
//        int p2 = n-1;
//        int p = m+n-1;
//        while (p1 >= 0 && p2 >= 0) {
//            nums1[p--] = (nums1[p1] < nums2[p2])?nums2[p2--]:nums1[p1--];
//        }
//    }
    


    public static void main(String[] args) {
        int[] nums1 = new int[]{1,2,3,0,0,0};
        int[] nums2 = new int[]{2,5,6};
        MergeSortedArray msa = new MergeSortedArray();
        msa.merge(nums1,3,nums2,3);
        for (int value : nums1) {
            System.out.print(value + " ");
        }
    }
    
    
}
