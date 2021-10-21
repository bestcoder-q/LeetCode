package tjpu.edu.manipulatelist;

/**
 * Created by Lwq on 2021/10/18 11:03
 */
public class ListNode {
    int val;
    ListNode next;
    ListNode() {
        
    }
    ListNode(int val) {
        this.val = val;
    }
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
    
    //添加新结点
    public void add(int newVal) {
        ListNode newNode = new ListNode(newVal);
        if (this.next == null) {
            this.next = newNode;
        } else {
            this.next.add(newVal);
        }
    }
    
    //打印链表
    public void print() {
        System.out.print(this.val);
        if (this.next != null) {
            System.out.print("-->");
            this.next.print();
        }
    }
    
    
}
