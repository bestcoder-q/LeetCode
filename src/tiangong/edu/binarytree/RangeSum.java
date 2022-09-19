package tiangong.edu.binarytree;

/**
 * Created by Lwq on 2021/4/28 20:42
 * https://leetcode-cn.com/problems/range-sum-of-bst/
 */
public class RangeSum { 
    int sum = 0;
    public int rangeSumBST(TreeNode root, int low, int high) {
        //int sum = 0;
        if (root != null) {
            if (root.val >= low && root.val <= high) {
                sum = sum + root.val;
            }
            rangeSumBST(root.left, low, high);
            rangeSumBST(root.right, low, high);
        }
        return sum;
    }


    public static void main(String[] args) {
        
    }
    
    
}
