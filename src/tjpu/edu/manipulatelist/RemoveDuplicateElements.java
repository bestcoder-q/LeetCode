package tjpu.edu.manipulatelist;

/**
 * Created by Lwq on 2021/10/18 11:08
 * 83. https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list/
 */
public class RemoveDuplicateElements {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode p = head;
        while (p.next != null) {
            if (p.val == p.next.val) {
                p.next = p.next.next;
            } else {
                p = p.next;
            }
        }
        return head;
    }


    public static void main(String[] args) {
        //创建链表并添加元素
        ListNode list = new ListNode();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        
        //打印链表
        list.print();
        System.out.println();
        
        //删除重复元素
        RemoveDuplicateElements rde = new RemoveDuplicateElements();
        rde.deleteDuplicates(list);
        list.print();  
        System.out.println();
    }
    
}
