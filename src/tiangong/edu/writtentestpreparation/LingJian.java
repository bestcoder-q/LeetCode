package tiangong.edu.writtentestpreparation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Lwq on 2022/9/19 16:58
 */
public class LingJian {
    public int findMin(int[] a) {
        int min = a[0];
        for (int i = 0; i < a.length - 1; ++i) {
            if (a[i] < a[0]) {
                min = a[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int num = 0;
        List<Integer> list = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        list.add(s.nextInt());
        
        int[] a1 = new int[list.get(1)];
        for (int i = 0; i < a1.length; ++ i) {
            a1[i] = s.nextInt();
        }
        System.out.println(a1.length);
    }
    
}
