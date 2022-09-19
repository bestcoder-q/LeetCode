//package tjpu.edu.binarytree;
//
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * Created by Lwq on 2021/5/12 10:33
// * https://leetcode-cn.com/problems/second-minimum-node-in-a-binary-tree/
// */
//public class FindSecondMinNode {
//    
//    List<Integer> valuesList = new ArrayList<>();
//
//    public int findSecondMinimumValue(TreeNode root) {
//        findAllValue(root);
//        int min = valuesList.get(0);
//        int secondMin = valuesList.get(1);
////        for (int i = 0; i < valuesList.size(); ++i) {
////            
////        }
//        return 1;
//    }
//    
//    //遍历二叉树找到所有节点放入HashSet
//    public void findAllValue(TreeNode root) {
//        valuesList.add(root.val);
//        findAllValue(root.left);
//        findAllValue(root.right);
//    }
//
//    public static void main(String[] args) {
//        
//        TreeNode treeNode = new TreeNode();
//        
//        
//        FindSecondMinNode fcm = new FindSecondMinNode();
//        fcm.findSecondMinimumValue()
//    }
//    
//    
//}
