package tjpu.edu.manipulatestr;

/**
 * Created by Lwq on 2021/4/20 14:23
 * https://leetcode-cn.com/problems/implement-strstr/
 */
public class PositioningStr {
    public int strStr(String haystack, String needle) {
        //使用split将字符串拆分存入数组中
        String[] arr1 = haystack.split("");
        String[] arr2 = needle.split("");
        int count = 0;
        int loc = 0;
        //注：下面的判断不能使用 arr2.length == 0,空字符串也有长度，为1
        if (needle.length() == 0) {
            return 0;
        } else if (haystack.length() < needle.length()) {
            return -1;
        } else {
            //注：如果arr1剩下的长度小于arr2，就不再需要判断了，注意循环终止条件（两次提交错误都是数组越界，arr2[j].equals(arr1[i + j])）
            for (int i = 0; i <= arr1.length - arr2.length; i++) {
                if (arr1[i].equals(arr2[0])) {
                    for (int j = 0; j < arr2.length; j++) {
                        if (arr2[j].equals(arr1[i + j])) {
                            count++;
                        }
                    }
                }
                if (count == arr2.length) {
                    loc = i;
                    break;
                } else {
                    count = 0;
                }
            }
            if (count == arr2.length) {
                return loc;
            } else {
                return -1;
            }
        }
    }


    public static void main(String[] args) {
        PositioningStr positioningStr = new PositioningStr();
        System.out.println(positioningStr.strStr("mississippi", "issipi"));
        //System.out.println(positioningStr.strStr("hello", "ll"));
    }


}

