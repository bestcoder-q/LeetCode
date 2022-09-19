package tjpu.edu.manipulatearr;

/**
 * Created by Lwq on 2021/4/14 23:21
 * https://leetcode-cn.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/
 */
public class SeparateDigits {
    public int subtractProductAndSum(int n) {
        int originN = n;
        int count = 0;
        int sum = 0;
        int product = 1;
        while (n >= 1) {
            n = n / 10;
            count++;
        }
        int[] arr = new int[count];
        for (int i = 0; i < count; i++) {
            arr[i] = originN % 10;
            originN = originN / 10;
        }

        for (int j = 0; j < arr.length; j++) {
            sum = sum + arr[j];
            product = product * arr[j];
        }
        return product - sum;
    }


    public static void main(String[] args) {
        SeparateDigits separateDigits = new SeparateDigits();
        System.out.println(separateDigits.subtractProductAndSum(1));
    }

}
