package tiangong.edu.manipulatelist;

/**
 * Created by Lwq on 2021/11/5 15:58
 * https://leetcode-cn.com/problems/reverse-linked-list/
 * 206.反转链表
 */
public class ReverseList {
    /*
    方法1：迭代
     */
//    public ListNode reverse(ListNode head) {
//        if (head == null) {
//            return null;
//        }
//        ListNode pre = head;  //pre指向的是反转后的前面的节点
//        ListNode cur = null;
//        while (pre != null) {
//            ListNode temp = pre.next;  //和交换元素的原理一样，用temp指针保存一下pre.next防止丢失
//            pre.next = cur;
//            cur = pre;
//            pre = temp;
//        }
//        return cur;
//    }
    
    /*
    方法2：递归
    
    算法步骤：
    使用递归函数，一直递归到链表的最后一个结点，该结点就是反转后的头结点，记作res
    此后，每次函数在返回的过程中，让当前结点的下一个结点的 next 指针指向当前节点。
    同时让当前结点的 next 指针指向 NULL ，从而实现从链表尾部开始的局部反转
    当递归函数全部出栈后，链表反转完成。
     */
    public ListNode reverse(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode res = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return res;
    }


    public static void main(String[] args) {
        //建立单链表1，2，3，4
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        //ListNode p = node1;
//        while (p != null) {
//            System.out.println(p.val);
//            p = p.next;
//        }
        System.out.println("-----------");
        
        //反转单链表
        ListNode head = node1;
        ReverseList reverseList = new ReverseList();
        ListNode q = reverseList.reverse(head);
        //遍历反转后的单链表
        while (q != null) {
            System.out.println(q.val);
            q = q.next;
        }
    }
    
}
