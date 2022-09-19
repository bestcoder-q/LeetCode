package tiangong.edu.manipulatelist;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lwq on 2021/11/14 16:06
 * https://leetcode-cn.com/problems/palindrome-linked-list/
 * 234.回文链表
 */
/*
    思路：
    将链表反转，如果是回文链表，反转之后元素顺序相同
 */
public class PalindromeList {
    public boolean isPalindrome(ListNode head) {
        //将原链表元素顺序存在一个list中，因为反转之后链表不能复用
        List<Integer> list = new ArrayList<Integer>();
        ListNode p = head;
        while (p != null) {
            list.add(p.val);
            p = p.next;
        }
        //将链表反转
        ListNode reverseHead = reverseList(head);
        //将反转前存在list中的元素顺序与反转后的元素顺序比较
        for (Integer it : list) {
            if (reverseHead.val != it) {
                return false;
            }
            reverseHead = reverseHead.next;
        }
        return true;
    }
    
    //反转链表
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode cur = null;
        ListNode pre = head;
        while (pre != null) {
            ListNode temp = pre.next;
            pre.next = cur;
            cur = pre;
            pre = temp;
        }
        return cur;
    }


    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(2);
        ListNode node4 = new ListNode(1);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        
        //遍历链表
        ListNode p = node1;
        while (p != null) {
            System.out.println(p.val);
            p = p.next;
        }
        
        PalindromeList palindromeList = new PalindromeList();
        System.out.println(palindromeList.isPalindrome(node1));

    }
    
}
