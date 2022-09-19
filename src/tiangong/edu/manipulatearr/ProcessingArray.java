package tiangong.edu.manipulatearr;

/**
 * Created by Lwq on 2021/4/18 23:39
 * 下面有两道题，同类型
 */
public class ProcessingArray {

    /**
     * https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/
     * 下面的算法可以实现无序数组的去重复项
     * 注:开始没注意题目条件是有序数组，这样应该有更简单的实现
     */
    public int removeDuplicates(int[] nums) {
        int count = nums.length;
        for (int i = 0; i < count; i++) {
            for (int j = i + 1; j < count; j++) {
                if (nums[i] == nums[j]) {
                    for (int k = j; k < count - 1; k++) {
                        nums[k] = nums[k + 1];
                    }
                    count--;
                    //这里注意加一个j--的目的，当出现了重复元素并且执行上面的删除操作后，就不需要j++操作了，这里提前执行一次j--即可
                    j--;
                }
            }
        }
        for (int x = 0; x < count; x++) {
            System.out.print(nums[x] + " ");
        }
        return count;
    }

    /**
     * 这道题是上面题的变式，难度较高一点
     * https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array-ii/
     */
    public int removeDuplicatesVariant(int[] nums) {
        int count = nums.length - 1; //开始我定义count = nums.length，这样当数组没有重复元素的时候会出现数组越界
        int number;
        if (nums.length > 1) { //不进行这个判断，nums[i] == nums[i + 1] 会出现数组越界问题
            for (int i = 0; i < count; i++) {
                number = 0;
                if (nums[i] == nums[i + 1]) {
                    //下面的for循环算出有几个重复的数字（number个）
                    for (int j = i; j < count + 1; j++) {
                        if (nums[i] == nums[j]) {
                            number++;
                        }
                    }
                    if (number == 3) {
                        //删除多余的数字（大于两个的）
                        for (int k = i + 1; k < count; k++) {
                            nums[k] = nums[k + 1];
                        }
                        count--;
                    } else if (number > 3) {
                        for (int k = i + 1; k < count; k++) {
                            nums[k] = nums[k + 1];
                        }
                        count--;
                        i--;
                    }
                }
            }
        }
        //打印处理后的数组
        for (int x = 0; x < count + 1; x++) {
            System.out.print(nums[x] + " ");
        }
        return count + 1;
    }


    public static void main(String[] args) {
        ProcessingArray processingArray = new ProcessingArray();
//        int[] nums = new int[]{0,0,1,1,1,2,2,3,3,4};
//        int[] nums = new int[]{1};
        int[] nums = new int[]{1,2,3};

        //无序数组测试
//        int[] nums = new int[]{2, 7, 8, 3, 3, 6, 2, 4, 2};

        System.out.println("\n" + processingArray.removeDuplicates(nums));

        //测试2
        //int[] nums2 = new int[]{1,1,1,1,1,1,1,2,2,2,2,2,3,3,3,3,3,3};
        //int[] nums2 = new int[]{1};
//        int[] nums2 = new int[]{1, 2, 3, 4, 5, 6};
//        System.out.println("\n" + processingArray.removeDuplicatesVariant(nums2));


    }


}
