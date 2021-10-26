package tjpu.edu.binarytree;

/**
 * Created by Lwq on 2021/10/25 10:52
 * 用于测试树相关的题目
 */
public class Test {
    public static void main(String[] args) {
        
        CreatBinaryTree cbr = new CreatBinaryTree();
        TreeNode root = cbr.creatTree();  //创建二叉树
        cbr.preOrder(root);  //前序遍历二叉树（验证创建的二叉树符合要求）
        System.out.println("------");
        cbr.inOrder(root);  //中序遍历二叉树
        
        //测试 94.https://leetcode-cn.com/problems/binary-tree-inorder-traversal/
        //中序遍历
        InorderTraversal it = new InorderTraversal();
        System.out.println(it.inTraversal(root));
        
        //测试 144. https://leetcode-cn.com/problems/binary-tree-preorder-traversal/
        //前序遍历
        PreorderTraversal pt = new PreorderTraversal();
        System.out.println(pt.preTraversal(root));
        
    }
}
