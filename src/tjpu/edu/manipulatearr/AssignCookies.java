package tjpu.edu.manipulatearr;

import java.util.Arrays;

/**
 * Created by Lwq on 2021/12/16 22:58
 * https://leetcode-cn.com/problems/assign-cookies/
 * 455。分发饼干
 */
public class AssignCookies {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int p = 0, q = 0, count = 0;
        while (q < s.length && p < g.length) {
            if (s[q] >= g[p]) {
                q++;  //q指向的饼干已经被分发（最小的饼干）
                p++;  //需求最小的人已经被发了饼干
                count++;
            } else {
                q++;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        int[] g = new int[]{1,2};
        int[] s = new int[]{1,2,3};
        AssignCookies ac = new AssignCookies();
        System.out.println(ac.findContentChildren(g, s));
    }
    
}
