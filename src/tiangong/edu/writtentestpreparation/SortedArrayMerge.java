package tiangong.edu.writtentestpreparation;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Lwq on 2022/9/20 12:09
 * 两个有序数组合并
 *  输入描述：
 * 	数组A,以及数组A元素数量
 * 	数组B,以及数组B元素数量
 * 	A=[1,6,7,0,0,0], m=3
 * 	B=[2,4,6], n=3
 * 	输出描述
 * 	合并后的数组A
 * 	A=[1,2,4,6,6,7];
 *
 * 	样例输入：
 * 	m=2,n=2
 * 	1,3
 * 	2,4
 * 	样例输出：
 * 	1 2 3 4
 */
public class SortedArrayMerge {
    public void merge(int[] a, int[] b, int m, int n) {
        for(int i = m, j = 0; i < m+n; ++i, ++j) {
            a[i] = b[j];
        }
        Arrays.sort(a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String s1 = str1.split(",")[0].split("=")[1];  //根据输入取到m的值
        String s2 = str1.split(",")[1].split("=")[1];  //根据输入取到n的值
        int m = Integer.parseInt(s1);
        int n = Integer.parseInt(s2);
        String str2 = sc.nextLine();
        String[] s3 = str2.split(",");
        String str3 = sc.nextLine();
        String[] s4 = str3.split(",");
        int[] arr1 = new int[m+n];
        int[] arr2 = new int[n];
        for (int i = 0; i < s3.length; ++i) {
            arr1[i] = Integer.parseInt(s3[i]);
        }
        for (int j = 0; j < s4.length; ++j) {
            arr2[j] = Integer.parseInt(s4[j]);
        }
        SortedArrayMerge sortedArrayMerge = new SortedArrayMerge();
        sortedArrayMerge.merge(arr1, arr2, m, n);
        for (int i = 0; i < arr1.length; ++i) {
            //下面的判断是为了让最后一个输出后面没有空格
            if (i < arr1.length - 1) {  //表示不是最后一个元素
                System.out.print(arr1[i] + " ");
            } else {  //表示是最后一个元素
                System.out.print(arr1[i]);
            }
        }
        sc.close();
    }
    
}
