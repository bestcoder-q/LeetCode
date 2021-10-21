package tjpu.edu.manipulatearr;

/**
 * Created by Lwq on 2021/4/12 23:55
 * https://leetcode-cn.com/problems/na-ying-bi/
 */
public class TakeCoins {
    public int minCount(int[] coins) {
        int count = 0;
        for (int i = 0; i < coins.length; i++) {
            if (coins[i] > 0) {
                do {
                    coins[i] = coins[i] - 2;
                    count++;
                }while (coins[i] >= 2);
                if (coins[i] == 1) {
                    coins[i] = coins[i] - 1;
                    count++;
                }
            }
        }
        return count;
    }
    
    
    /*补充题解*/
//    class Solution {
//        public int minCount(int[] coins) {
//            int count = 0;
//            for(int i = 0;i<coins.length;i++){
//                count +=coins[i]/2;
//                //取模,如果是奇数则coins[i]%2会等于1
//                count +=coins[i]%2;
//            }
//            return count;
//        }
//    }
    
    
    public static void main(String[] args) {
        TakeCoins takeCoins = new TakeCoins();
        int[] coins = new int[]{2,3,10};
        System.out.println(takeCoins.minCount(coins));
    }
    
}
