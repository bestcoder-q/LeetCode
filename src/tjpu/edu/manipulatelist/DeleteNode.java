package tjpu.edu.manipulatelist;

/**
 * Created by Lwq on 2021/11/15 21:42
 * https://leetcode-cn.com/problems/delete-node-in-a-linked-list/
 * 237.删除链表中的节点
 */
public class DeleteNode {
    /*
        思路：
        将待删除的节点和下一个节点交换（题目保证待删除的节点下一个节点不为null）
     */
    public void delete(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(0);
        ListNode node2 = new ListNode(1);
//        ListNode node3 = new ListNode(1);
//        ListNode node4 = new ListNode(9);
        node1.next = node2;
//        node2.next = node3;
//        node3.next = node4;
        
        //删除node2
        DeleteNode deleteNode = new DeleteNode();
        deleteNode.delete(node1);
        
        ListNode p = node2;
        while (p != null) {
            System.out.println(p.val);
            p = p.next;
        }
    }
    
}
