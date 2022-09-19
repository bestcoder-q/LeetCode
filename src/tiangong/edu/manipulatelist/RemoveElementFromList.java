package tiangong.edu.manipulatelist;

/**
 * Created by Lwq on 2021/11/5 22:41
 * https://leetcode-cn.com/problems/remove-linked-list-elements/
 * 203. 移除链表元素
 */
public class RemoveElementFromList {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        while (head.val == val) {
            if (head.next != null) {
                head = head.next;
            } else {
                return null;
            }
        }
        if (head.next != null) {
            ListNode pre = head;
            ListNode cur = head.next;
            while (cur.next != null) {
                if (cur.val == val) {
                    pre.next = cur.next;
                    cur = pre.next;
                }
                cur = cur.next;
                pre = pre.next;
            }
            //前面遍历链表执行删除操作并没有对最后一个元素进行判断操作，这里单独做，防止空指针
            if (cur.val == val) {
                pre.next = null;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        //建立待删除元素的链表
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(1);
//        ListNode node4 = new ListNode(3);
//        ListNode node5 = new ListNode(4);
//        ListNode node6 = new ListNode(5);
//        ListNode node7 = new ListNode(6);
        node1.next = node2;
        node2.next = node3;
//        node3.next = node4;
//        node4.next = node5;
//        node5.next = node6;
//        node6.next = node7;
        
        //测试方法删除链表中指定元素
        RemoveElementFromList ref = new RemoveElementFromList();
        ListNode head = node1;
        ListNode res = ref.removeElements(head, 2);
        while (res != null) {
            System.out.println(res.val);
            res = res.next;
        }
    }
    
}
