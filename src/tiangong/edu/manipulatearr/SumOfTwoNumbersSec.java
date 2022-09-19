package tiangong.edu.manipulatearr;

/**
 * Created by Lwq on 2021/11/3 21:59
 * 167. https://leetcode-cn.com/problems/two-sum-ii-input-array-is-sorted/
 * 两数之和 II - 输入有序数组
 */
public class SumOfTwoNumbersSec {
    /*
    方法1：暴力
    时间复杂度O(n^2)
     */
//    public int[] twoSum(int[] numbers, int target) {
//        int[] res = new int[2];
//        for (int i = 0; i < numbers.length; ++i) {
//            for (int j = i+1; j < numbers.length; ++j) {
//                if (numbers[i] + numbers[j] == target) {
//                    res[0] = i+1;
//                    res[1] = j+1;
//                }
//            }
//        }
//        return res;
//    }
    
    /*
        方法2：双指针
        算法步骤：
        1. 初始状态下，令left指向数组的第一个元素，right指向最后一个元素
        2. 进入循环，控制循环退出的条件为left>=right
        3. 在每一次循环中，如果left+right=target,则返回
        4. 若left+right<target, 则left = left +1,继续循环
        5. 若left+right>target, 则right = right -1,继续循环
     */
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length-1;
        int[] res = new int[2];
        while (left < right) {
            if (numbers[left] + numbers[right] == target) {
                res[0] = left + 1;
                res[1] = right + 1;
                break;
            } else if (numbers[left] + numbers[right] < target) {
                left++;
            } else if (numbers[left] + numbers[right] > target) {
                right--;
            }
        }
        return res;
    }
    

    public static void main(String[] args) {
        int[] numbers = new int[]{2,7,11,15};
        SumOfTwoNumbersSec sumOfTwoNumbersSec = new SumOfTwoNumbersSec();
        int[] res = sumOfTwoNumbersSec.twoSum(numbers, 9);
        for (int re : res) {
            System.out.println(re);
        }
    }
    
}
