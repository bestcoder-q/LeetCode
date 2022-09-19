package tjpu.edu.binarytree;

import java.util.List;
import java.util.SortedMap;

/**
 * Created by Lwq on 2021/10/25 10:52
 * 用于测试树相关的题目
 */
public class Test {
    public static void main(String[] args) {

        //使用CreatBinaryTree创建第一棵树
        Integer[] arr = new Integer[]{1,null,2,3};
        
        CreatBinaryTree cbr = new CreatBinaryTree();
        TreeNode root = cbr.creatTree(arr);  //创建二叉树
        cbr.preOrder(root);  //前序遍历二叉树（验证创建的二叉树符合要求）
        System.out.println("------");
        cbr.inOrder(root);  //中序遍历二叉树

        System.out.println("==========");
        
        //使用CreatBinaryTree创建第二棵树
//        Integer[] arr2 = new Integer[]{1,2,null,null,3};
//        
//        CreatBinaryTree cbr2 = new CreatBinaryTree();
//        TreeNode root2 = cbr2.creatTree(arr2);  //创建二叉树
//        cbr2.preOrder(root2);  //前序遍历二叉树（验证创建的二叉树符合要求）
//        System.out.println("------");
//        cbr2.inOrder(root2);  //中序遍历二叉树
        
//        //测试 94.https://leetcode-cn.com/problems/binary-tree-inorder-traversal/
//        //中序遍历
//        InorderTraversal it = new InorderTraversal();
//        System.out.println(it.inTraversal(root));
//        
//        //测试 144. https://leetcode-cn.com/problems/binary-tree-preorder-traversal/
//        //前序遍历
//        PreorderTraversal pt = new PreorderTraversal();
//        System.out.println(pt.preTraversal(root));

        //测试 145. https://leetcode-cn.com/problems/binary-tree-postorder-traversal/
        //后序遍历
        PostorderTraversal postorderTraversal = new PostorderTraversal();
        List<Integer> list = postorderTraversal.postTraversal(root);
        for (Integer integer : list) {
            System.out.println(integer);
        }


        //测试 100.相同的树 https://leetcode-cn.com/problems/same-tree/
//        SameTree sameTree = new SameTree();
//        System.out.println(sameTree.isSameTree(root, root2));

    }
}
