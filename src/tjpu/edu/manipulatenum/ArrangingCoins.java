package tjpu.edu.manipulatenum;

/**
 * Created by Lwq on 2021/12/9 22:03
 * https://leetcode-cn.com/problems/arranging-coins/
 * 441. 排列硬币
 */
public class ArrangingCoins {
    public int arrangeCoins(int n) {
        int i = 1;
        while ((i*i+i)/2 < n) {
            ++i;
        }
        if ((i*i+i)/2 == n) {
            return i;
        }
        return i-1;
    }


    public static void main(String[] args) {
        ArrangingCoins ac = new ArrangingCoins();
        System.out.println(ac.arrangeCoins(10));
    }
    
}
