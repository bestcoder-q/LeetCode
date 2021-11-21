package tjpu.edu.binarytree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lwq on 2021/11/21 11:13
 * https://leetcode-cn.com/problems/lowest-common-ancestor-of-a-binary-search-tree/
 * 235.二叉搜索树的最近公共祖先
 */
public class LowestCommonAncestor {
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
    
}
