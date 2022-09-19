package tiangong.edu.manipulatearr;

/**
 * Created by Lwq on 2021/4/10 17:16
 * https://leetcode-cn.com/problems/water-bottles/
 */
public class ChangeWine {
    public int numWaterBottles(int numBottles, int numExchange) {
        int sum = 0; //记录能喝酒的总数
        int remainder = 0; //记录直接兑换后剩余的空瓶子数
        int originBottles = numBottles;
        if (numBottles >= numExchange){ //如果第一次买酒数目至少能够兑换一瓶酒，进入循环去计算，如果不能，则总喝酒数就是第一次买的酒数（即一次也不能兑换的情况）
            while (numBottles >= numExchange){
                sum = sum + numBottles + (numBottles/numExchange);
                //除了第一次的numBottles是可以直接喝的酒，可以直接加进去，之后的numBottles都是空瓶子数，需要换成酒，上面加上了这个numBottles，需要减去
                if (numBottles < originBottles){
                    sum = sum - numBottles;
                }
                remainder = numBottles % numExchange;
                numBottles = (numBottles/numExchange) + remainder;
            }
        } else { //一次也不能兑换的情况
            sum = numBottles;
        }
        return sum;
    }

    /**
     * 下面代码和我的思路相同，只是更加简化
     */
//    public int numWaterBottles(int numBottles, int numExchange) {
//        int total = numBottles;
//        while (numBottles >= numExchange) {
//            //change表示的是兑换成酒的数量
//            int change = numBottles / numExchange;
//            //total再加上兑换的酒
//            total += change;
//            //瓶子数量变为兑换成酒的数量加上没有兑换成酒的数量
//            numBottles = change + numBottles % numExchange;
//        }
//        return total;
//    }
    
    
    public static void main(String[] args) {
        ChangeWine changeWine = new ChangeWine();
        System.out.println(changeWine.numWaterBottles(300, 6));
    }
    
    
}
