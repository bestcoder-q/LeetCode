package tjpu.edu.manipulatearr;

/**
 * Created by Lwq on 2021/4/9 10:28
 * https://leetcode-cn.com/problems/sum-of-all-odd-length-subarrays/
 */
public class SumOfSubarrays {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        for (int i = 0;i < arr.length;i++){
            for (int j = i;j < arr.length;j++){
                if ((j-i)%2 == 0){
                    int temp = 0;
                    for (int k = i;k<=j;k++){
                        temp = temp + arr[k];
                    }
                    sum = sum + temp;
                }
            }
        }
        return sum;
    }

    
    public static void main(String[] args) {
        int[] arr = new int[]{10,11,12};
        int[] arr2 = new int[]{1,4,2,5,3};
        SumOfSubarrays sumOfSubarrays = new SumOfSubarrays();
        System.out.println(sumOfSubarrays.sumOddLengthSubarrays(arr));
    }
    
}
