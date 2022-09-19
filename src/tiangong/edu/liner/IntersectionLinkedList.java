package tiangong.edu.liner;

import java.util.HashSet;

/**
 * Created by Lwq on 2021/10/31 12:27
 * 160. https://leetcode-cn.com/problems/intersection-of-two-linked-lists/
 */
public class IntersectionLinkedList {
    private static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    /*
    方法1：哈希表
     */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> set = new HashSet<ListNode>();
        if (headA == null) {
            return null;
        }
        while (headA != null) {
            set.add(headA);
            headA = headA.next;
        }
        if (headB == null) {
            return null;
        }
        while (headB != null) {
            if (set.contains(headB)) {
                return headB;
            }
            headB = headB.next;
        }
        return null;
    }


    public static void main(String[] args) {
        //建立单链表A
        int[] listA = new int[]{0, 9, 1, 2, 4};
        ListNode headA = new ListNode(0);
        ListNode node9 = new ListNode(9);
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node4 = new ListNode(4);
        headA.next = node9;
        node9.next = node1;
        node1.next = node2;
        node2.next = node4;

        //建立单链表B
        ListNode headB = new ListNode(3);
        headB.next = node2;

        IntersectionLinkedList ill = new IntersectionLinkedList();
        ListNode intersectionNode = ill.getIntersectionNode(headA, headB);
        System.out.println(intersectionNode.val);
    }

    
}
