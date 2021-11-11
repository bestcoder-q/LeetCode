package tjpu.edu.binarytree;

/**
 * Created by Lwq on 2021/11/11 11:43
 * https://leetcode-cn.com/problems/invert-binary-tree/
 * 226. 翻转二叉树
 */
public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        root.left = right;
        root.right = left;
        return root;
    }


    public static void main(String[] args) {
        //创建初始二叉树
        Integer[] arr = new Integer[]{4,2,1,null,null,3,null,null,7,6,null,null,9};
        CreatBinaryTree creatBinaryTree = new CreatBinaryTree();
        TreeNode root = creatBinaryTree.creatTree(arr);
        creatBinaryTree.preOrder(root);
        System.out.println();
        creatBinaryTree.inOrder(root);
        System.out.println();
        
        //反转二叉树
        InvertBinaryTree invertBinaryTree = new InvertBinaryTree();
        TreeNode resRoot = invertBinaryTree.invertTree(root);
        creatBinaryTree.preOrder(resRoot);  //前序遍历翻转之后的二叉树
        System.out.println();
        creatBinaryTree.inOrder(resRoot);   //中序遍历翻转之后的二叉树
    }
    
}
