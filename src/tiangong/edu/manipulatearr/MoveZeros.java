package tiangong.edu.manipulatearr;

/**
 * Created by Lwq on 2021/11/17 21:54
 * https://leetcode-cn.com/problems/move-zeroes/
 * 283. 移动 0
 */

/*
    定义一个指针i在前面找0，另一个指针j紧随其后找它后面第一个可以与其交换的非0数
 */
public class MoveZeros {
    public void move(int[] nums) {
        int i = 0, j = i + 1;
        while (j < nums.length) {
            if (nums[i] == 0) {
                if (nums[j] != 0) {
                    nums[i] = nums[j];
                    nums[j] = 0;
                    ++i;
                    j = i + 1;
                } else if (nums[j] == 0){
                    ++j;
                }
            } else if (nums[i] != 0) {
                ++i;
                j = i + 1;
            }
        }
    }


    public static void main(String[] args) {
        int[] arr = new int[]{0,1,1,0};
        MoveZeros moveZeros = new MoveZeros();
        moveZeros.move(arr);
        for (int value : arr) {
            System.out.println(value);
        }
    }
    
}
