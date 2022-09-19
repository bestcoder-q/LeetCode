package tiangong.edu.binarytree;

/**
 * Created by Lwq on 2021/10/27 11:14
 * 100. https://leetcode-cn.com/problems/same-tree/
 */
/*
    方法1：先序遍历和中序遍历可以唯一确定一棵树
    1.先序遍历树p,q并将结果放入list中，注意,null也要放
    2.比较两个list是否相同，不同返回false,相同进入第三步
    3.中序遍历p,q并将结果放入list中
    4.比较是否相同，不同返回false,相同返回true
 */
//public class SameTree {
//    public boolean isSameTree(TreeNode p, TreeNode q) {
//        List<Integer> l1 = new ArrayList<Integer>();  //l1存储p的先序遍历序列
//        List<Integer> l2 = new ArrayList<Integer>();  //l2存储q的先序遍历序列
//        preOrder(p, l1);
//        preOrder(q, l2);
//        //比较p和q的先序遍历序列是否相同
//        if (!isListSame(l1, l2)) {
//            return false;
//        } else {
//            List<Integer> l3 = new ArrayList<Integer>();  //l3存储p的中序遍历序列
//            List<Integer> l4 = new ArrayList<Integer>();  //l4存储q的中序遍历序列
//            inOrder(p, l3);
//            inOrder(q, l4);
//            if (!isListSame(l3, l4)) {
//                return false;
//            }
//        }
//        return true;
//    }
//    
//    //二叉树的前序遍历
//    public void preOrder(TreeNode root, List<Integer> list) {
//        if (root == null) {
//            list.add(null);
//            return;
//        }
//        list.add(root.val);
//        preOrder(root.left, list);
//        preOrder(root.right, list);
//    }
//    
//    //二叉树的中序遍历
//    public void inOrder(TreeNode root, List<Integer> list) {
//        if (root == null) {
//            list.add(null);
//            return;
//        }
//        inOrder(root.left, list);
//        list.add(root.val);
//        inOrder(root.right, list);
//    }
//    
//    //比较两个链表是否相同
//    public boolean isListSame(List<Integer> list1, List<Integer> list2) {
//        //元素个数不相同
//        if (list1.size() != list2.size()) {
//            return false;
//        }
//        //两个list的元素个数已经相同，再比较两者的内容
//        for (int i = 0; i < list1.size(); ++i) {
//            if (!Objects.equals(list1.get(i), list2.get(i))) {
//                return false;
//            }
//        }
//        return true;
//    }
//    
//}
    
/*
    方法2：深度优先遍历
    
    终止条件与返回值：
    当两棵树的当前节点都为 null 时返回 true
    当其中一个为 null 另一个不为 null 时返回 false
    当两个都不为空但是值不相等时，返回 false
    
    执行过程：
    当满足终止条件时进行返回，不满足时分别判断左子树和右子树是否相同，其中要注意代码中的短路效应
 */
public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        if (p.val != q.val) {
            return false;
        }
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
