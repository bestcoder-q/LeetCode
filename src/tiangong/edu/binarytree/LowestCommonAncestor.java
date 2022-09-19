package tiangong.edu.binarytree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lwq on 2021/11/21 11:13
 * https://leetcode-cn.com/problems/lowest-common-ancestor-of-a-binary-search-tree/
 * 235.二叉搜索树的最近公共祖先
 */
public class LowestCommonAncestor {
    /*
        方法1:
     */
    public TreeNode findLowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        List<TreeNode> path_p = getPath(root, p);
        List<TreeNode> path_q = getPath(root, q);
        TreeNode ancestor = null;
        for (int i = 0; i < path_p.size() && i < path_q.size(); ++i) {
            if (path_p.get(i) == path_q.get(i)) {
                ancestor = path_p.get(i);
            } else {
                break;
            }
        }
        return ancestor;
    }
    
    /*
        找到根节点到target节点的路径
     */
    public List<TreeNode> getPath(TreeNode root, TreeNode target) {
        List<TreeNode> path = new ArrayList<TreeNode>();
        TreeNode p = root;
        while (p != target) {
            path.add(p);
            if (p.val < target.val) {
                p = p.right;
            } else {
                p = p.left;
            }
        }
        path.add(p);
        return path;
    }
    
    
    /*
        方法2：递归
     */
//    public TreeNode findLowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//        /*
//         *      二叉搜索树特性：左子树比根节点小，右子树比根节点大
//         *      三种情况
//         *          第一种：p，q均在root的右子树
//         *          第二种：p，q均在root的左子树
//         *          第三种：，最近祖先只能是root
//         */
//
////        第一种情况，p和q都在右子树，应该把视角放在右边，去右子树找第三种情况
//        if(root.val < p.val && root.val < q.val){
//            return findLowestCommonAncestor(root.right, p, q);
//        }
////        第二种情况，p和q都在左子树，应该把视角放在左边，去左子树找第三种情况
//        if(root.val > p.val && root.val > q.val){
//            return findLowestCommonAncestor(root.left, p, q);
//        }
////        第三种情况，p,q不在同一子树，只能是p，q分别在一左一右，或者，p，q其中一个是根节点，都返回root
//        return root;
//    }
    
}
