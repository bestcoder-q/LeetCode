package tjpu.edu.liner;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Lwq on 2021/10/30 16:43
 * 141. https://leetcode-cn.com/problems/linked-list-cycle/
 */
public class CircularLinkedList {
    
    private static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    
    public boolean hasCycle(ListNode head) {
//        /*
//        方法1：哈希表
//         */
//        Set<ListNode> set = new HashSet<ListNode>();
//        while (head != null) {
//            if (set.contains(head)) {
//                return true;
//            } else {
//                set.add(head);
//            }
//            head = head.next;
//        }
//        return false;
        
        /*
        方法2：快慢指针
         */
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }


    public static void main(String[] args) {
        ListNode node1 = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(0);
        ListNode node4 = new ListNode(-4);
        ListNode node5 = new ListNode(2);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        //node4.next = node2;
        
        CircularLinkedList cll = new CircularLinkedList();
        boolean res = cll.hasCycle(node1);
        System.out.println(res);
    }
    
}
