package tjpu.edu.manipulatelist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * Created by Lwq on 2021/11/14 16:06
 * https://leetcode-cn.com/problems/palindrome-linked-list/
 * 234.回文链表
 */
public class PalindromeList {
    public boolean isPalindrome(ListNode head) {
        return false;
    }
    
    //反转链表
    public ListNode reverseList(ListNode head) {
        Stack<ListNode> stack = new Stack<ListNode>();
        while (head != null) {
            stack.push(head);
            head = head.next;
        }
        
        List<ListNode> reverseList = new LinkedList<ListNode>();
        if (!stack.empty()) {
            
        }
        while (!stack.empty()) {
            ListNode tempNode = stack.pop();
            
        }
        return reverseList.get(0);
    }


    public static void main(String[] args) {
        List<ListNode> list = new ArrayList<>();
        list.add(new ListNode(1));
        list.add(new ListNode(2));
        list.add(new ListNode(3));
        list.add(new ListNode(4));
        ListNode head = list.get(0);
        for (ListNode listNode : list) {
            System.out.println(listNode.val);
        }
        
        PalindromeList pl = new PalindromeList();
        ListNode reverseListHead = pl.reverseList(head);
        while (reverseListHead != null) {
            System.out.println(reverseListHead.val);
            reverseListHead = reverseListHead.next;
        }
    }
    
}
