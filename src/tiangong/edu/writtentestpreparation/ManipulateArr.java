package tjpu.edu.writtentestpreparation;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Lwq on 2022/9/16 20:42
 */
public class ManipulateArr {
    public Integer[] solve(int[] a) {
        Set<Integer> set = new HashSet<>();
        for (int value : a) {
            set.add(value);
        }
        Integer[] result = new Integer[set.size()];
        set.toArray(result);
        return result;
    }
    
    
    public static void main(String[] args) {
        int[] a = new int[]{1,1,2,2,3};
        ManipulateArr manipulateArr = new ManipulateArr();
        Integer[] solve = manipulateArr.solve(a);
        int[] res = new int[solve.length];
        for (int i = 0; i < solve.length;++i) {
            res[i] = solve[i];
        }
        System.out.println(Arrays.toString(res));
    }
}
