package tjpu.edu.binarytree;

/**
 * Created by Lwq on 2021/10/25 11:26
 */
public class CreatBinaryTree {
    
    //TreeValue
    //构建二叉树的值和值索引
    int index = 0;
    //Integer[] arr = new Integer[]{1,null,2,3};
    
    /*
    创建二叉树
     */
    public TreeNode creatTree(Integer[] arr) {
        TreeNode node = null;
        if (index < arr.length) {
            if (arr[index] == null) {
                index++;
                return null;
            }
            node = new TreeNode(arr[index]);
            index++;
            node.left = creatTree(arr);
            node.right = creatTree(arr);
        }
        return node;
    }
    
    /*
    前序遍历二叉树
     */
    public void preOrder(TreeNode root) {
        if (root == null) {
            return;
        } else {
            System.out.print(root.val + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }
    /*
    中序遍历二叉树
     */
    public void inOrder(TreeNode root) {
        if (root == null) {
            return;
        } else {
            inOrder(root.left);
            System.out.print(root.val + " ");
            inOrder(root.right);
        }
    }
    
    
}
