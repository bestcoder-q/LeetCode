package tjpu.edu.binarytree;

/**
 * Created by Lwq on 2021/5/21 19:25
 * 用于创建树的测试用例
 */
public class TreeHelper {
    static int index;
    static String[] values;
    
    public TreeHelper() {
        
    }
    
    //根据形如"1, 2, #, 4, 5, #, 7, #"的字符串建立二叉树，其中#代表该结点为空
    public void setValues(String treeValues) {
        values = treeValues.split(",");
        index = 0;
    }
    
    //递归建立二叉树
    public TreeNode createTree() {
        TreeNode node = null;
        if (index < values.length) {
            if (values[index].equals("#")) {
                index++;
                return null;
            }
            node = new TreeNode(Integer.parseInt(values[index]));
            index++;
            node.left = createTree();
            node.right = createTree();
        }
        return node;
    }
    
    //前序遍历二叉树
    public void preOrder(TreeNode root) {
        if (root == null) {
            return;
        } else {
            System.out.println(root.val + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }
    
    //中序遍历二叉树
    public void inOrder(TreeNode root) {
        if (root == null) {
            return;
        } else {
            inOrder(root.left);
            System.out.println(root.val + " ");
            inOrder(root.right);
        }
    }
    
    
}
