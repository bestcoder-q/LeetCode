package tjpu.edu.binarytree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lwq on 2021/11/8 10:56
 * https://leetcode-cn.com/problems/binary-tree-postorder-traversal/
 * 145. 二叉树的后序遍历
 */
public class PostorderTraversal {
    List<Integer> list = new ArrayList<Integer>();
    public List<Integer> postTraversal(TreeNode root) {
        if (root == null) {
            //注：
            //这里不要返回null，当树是空树时（输入为[]），题目要求返回[]，而不是null
            return list;
        }
        postTraversal(root.left);
        postTraversal(root.right);
        list.add(root.val);
        return list;
    }
}
