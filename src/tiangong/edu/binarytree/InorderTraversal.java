package tiangong.edu.binarytree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lwq on 2021/10/25 9:44
 * 94. https://leetcode-cn.com/problems/binary-tree-inorder-traversal/
 */
public class InorderTraversal {
    
    //下面这样写是错的
//    public List<Integer> traversal(TreeNode root) {
//        //每次都新建list怎么行呢，list在递归时要作为参数
//        List<Integer> list = new ArrayList<>();  
//        if (root == null) {
//            return null;
//        } else {
//            traversal(root.left);
//            list.add(root.val);
//            traversal(root.right);
//        }
//        return list;
//    }
    
    /*
    解法1：递归
     */
    public List<Integer> inTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inOrder(root, list);
        return list;
    }
    //注意list要在递归时作为参数传入，这样可以保存更新其中的数据，不能在递归中新创建list,这样每次都会创建新的list
    public void inOrder(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        } else {
            inOrder(root.left, list);
            list.add(root.val);
            inOrder(root.right, list);
        }
    }
    
    
}
