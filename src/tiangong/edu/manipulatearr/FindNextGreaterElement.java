package tiangong.edu.manipulatearr;

/**
 * Created by Lwq on 2021/10/26 21:15
 * 496. https://leetcode-cn.com/problems/next-greater-element-i/
 */
public class FindNextGreaterElement {
    
    /*
    法1：暴力
     */
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] nums3 = new int[nums1.length];
        for (int i = 0; i < nums1.length; ++i) {
            int temp = 0;  //标记nums1中的数在nums2中出现的位置
            int flag = 0;  //标记是否有符合条件的数，没有的话nums3数组相应位置值为-1
            for (int j = 0; j < nums2.length; ++j) {
                if (nums1[i] == nums2[j]) {
                    temp = j + 1;
                    break;
                }
            }
            while (temp < nums2.length) {
                if (nums2[temp] > nums1[i]) {
                    nums3[i] = nums2[temp];
                    flag = 1;
                    break;
                }
                temp++;
            }
            if (flag == 0) {
                nums3[i] = -1;
            }
        }
        return nums3;
    }


    public static void main(String[] args) {
        int[] nums1 = new int[]{2,4};
        int[] nums2 = new int[]{1,2,3,4};
        
        FindNextGreaterElement fnge = new FindNextGreaterElement();
        int[] res = fnge.nextGreaterElement(nums1, nums2);
        for (int re : res) {
            System.out.println(re);
        }
    }
    
}
