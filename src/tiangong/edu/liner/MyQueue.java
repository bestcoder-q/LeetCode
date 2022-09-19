package tiangong.edu.liner;

import java.util.Stack;

/**
 * Created by Lwq on 2021/11/14 11:51
 * https://leetcode-cn.com/problems/implement-queue-using-stacks/
 * 232.用栈实现队列
 */
public class MyQueue {
    Stack<Integer> stack1;  //存放队列元素
    Stack<Integer> stack2;  //取元素时的辅助栈
    
    public MyQueue() {
        stack1 = new Stack<Integer>();
        stack2 = new Stack<Integer>();
    }

    public void push(int x) {
        stack1.push(x);
    }

    public int pop() {
        while (!stack1.empty()) {
            stack2.push(stack1.pop());
        }
        Integer pop = stack2.pop();
        //取完元素再将剩下的元素放回栈1，方便之后存储元素
        while (!stack2.empty()) {
            stack1.push(stack2.pop());
        }
        return pop;
    }

    public int peek() {
        while (!stack1.empty()) {
            stack2.push(stack1.pop());
        }
        Integer peek = stack2.peek();
        while (!stack2.empty()) {
            stack1.push(stack2.pop());
        }
        return peek;
    }

    public boolean empty() {
        return stack1.empty();
    }
    
    
    //测试
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.push(1);
        myQueue.push(2);
        myQueue.push(3);
        myQueue.push(4);

        System.out.println(myQueue.peek());
        System.out.println(myQueue.pop());
        System.out.println(myQueue.peek());
        System.out.println(myQueue.empty());
    }
    
}
