package tiangong.edu.manipulatearr;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lwq on 2021/12/5 22:06
 * https://leetcode-cn.com/problems/fizz-buzz/
 * 412.FizzBuzz
 */
public class FizzBuzz {
    public List<String> writeFizzBuzz(int n) {
        List<String> list = new ArrayList<String>();
        for (int i = 1; i <= n; ++i) {
            if (i % 3 == 0 && i % 5 == 0) {
                list.add("FizzBuzz");
            } else if (i % 3 == 0) {
                list.add("Fizz");
            } else if (i % 5 == 0) {
                list.add("Buzz");
            } else {
                list.add(i + "");
            }
        }
        return list;
    }


    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        List<String> res = fizzBuzz.writeFizzBuzz(15);
        for (String re : res) {
            System.out.println(re);
        }
    }
    
}
