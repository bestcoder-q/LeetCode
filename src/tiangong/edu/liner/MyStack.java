package tjpu.edu.liner;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Lwq on 2021/11/10 10:33
 * https://leetcode-cn.com/problems/implement-stack-using-queues/
 * 225.用队列实现栈
 */
/*
    注：
    add      增加一个元索              如果队列已满，则抛出一个IIIegaISlabEepeplian异常
    remove   移除并返回队列头部的元素    如果队列为空，则抛出一个NoSuchElementException异常
    element  返回队列头部的元素         如果队列为空，则抛出一个NoSuchElementException异常x
    offer    添加一个元素并返回true     如果队列已满，则返回false
    poll     移除并返问队列头部的元素    如果队列为空，则返回null
    peek     返回队列头部的元素         如果队列为空，则返回null
    put      添加一个元素              如果队列满，则阻塞
    take     移除并返回队列头部的元素    如果队列为空，则阻塞
 */
public class MyStack {
    Queue<Integer> q1;  //用队列1代表栈
    Queue<Integer> q2;  //辅助队列
    
    public MyStack() {
        q1 = new LinkedList<Integer>();
        q2 = new LinkedList<Integer>();
    }

    public void push(int x) {
        //q1为空时，直接入队
        if (q1.isEmpty()) {
            q1.add(x);
        } else {
            //q1不为空，先将q1中的元素暂存在q2中
            while (!q1.isEmpty()) {
                q2.add(q1.remove());
            }
            q1.add(x);
            //将q2中暂存的元素重新添加到q1
            while (!q2.isEmpty()) {
                q1.add(q2.remove());
            }
        }
    }

    public int pop() {
        return q1.remove();
    }

    public int top() { 
        return q1.peek();
    }

    public boolean empty() {
        return q1.isEmpty();
    }


    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        System.out.println(myStack.pop());
        System.out.println(myStack.top());
        System.out.println(myStack.empty());
    }
    
}
