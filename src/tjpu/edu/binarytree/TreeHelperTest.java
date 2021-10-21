package tjpu.edu.binarytree;

/**
 * Created by Lwq on 2021/5/21 20:17
 */
public class TreeHelperTest {
    public static void main(String[] args) {
        String treeNodeValues = "1,2,#,#,3,4,#,#,5,6,#,8,#,#";
        TreeHelper treeHelper = new TreeHelper();
        treeHelper.setValues(treeNodeValues);
        TreeNode root = treeHelper.createTree();

        System.out.println("中序遍历二叉树");
        treeHelper.inOrder(root);
        
    }
}
