package tjpu.edu.manipulatearr;

/**
 * Created by Lwq on 2021/4/15 22:45
 * https://leetcode-cn.com/problems/number-of-good-pairs/
 */
public class NumberOfGoodPairs {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
        }
        return count;
    }


    public static void main(String[] args) {
        NumberOfGoodPairs numberOfGoodPairs = new NumberOfGoodPairs();
//        int[] arr = new int[]{1,2,3,1,1,3};
//        int[] arr = new int[]{1,1,1,1};
        int[] arr = new int[]{1, 2, 3};
        System.out.println(numberOfGoodPairs.numIdenticalPairs(arr));
    }

}
