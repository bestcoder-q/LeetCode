package tiangong.edu.manipulatearr;

/**
 * Created by Lwq on 2021/4/11 21:57
 * https://leetcode-cn.com/problems/three-consecutive-odds/
 */
public class OddArray {
    public boolean threeConsecutiveOdds(int[] arr) {
        int i = 0;
        int flag = 0;
        while (i + 2 <= arr.length - 1) {
            if (arr[i] % 2 != 0 && arr[i + 1] % 2 != 0 && arr[i + 2] % 2 != 0) {
                flag = 1;
                break;
            }
            i++;
        }
        if (flag == 1) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 2};
        OddArray oddArray = new OddArray();
        System.out.println(oddArray.threeConsecutiveOdds(arr));
    }


}
