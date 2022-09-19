package tjpu.edu.binarytree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lwq on 2021/10/26 12:19
 * 144. https://leetcode-cn.com/problems/binary-tree-preorder-traversal/
 */
public class PreorderTraversal {
    
    /*
    解法1：递归
     */
    public List<Integer> preTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        preOrder(root, list);
        return list;
    }
    
    public void preOrder(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        } else {
            list.add(root.val);
            preOrder(root.left, list);
            preOrder(root.right, list);
        }
    }
    
}
