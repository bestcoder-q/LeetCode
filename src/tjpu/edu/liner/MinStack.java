package tjpu.edu.liner;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Created by Lwq on 2021/10/29 19:16
 * 155. https://leetcode-cn.com/problems/min-stack/
 */

///*
//    方法1：使用辅助栈
//    -定义一个“数据栈” 来支持push,pop,top操作
//    -定义一个“辅助栈” 其栈顶为当前的最小值，以支持常数时间复杂度的getMin操作
// */
//public class MinStack {
//    
//    Deque<Integer> xStack;  //数据栈
//    Deque<Integer> minStack;  //辅助栈
//    
//    public MinStack() {
//        xStack = new LinkedList<Integer>();
//        minStack = new LinkedList<Integer>();
//        //既然minStack栈顶存放最小值，那么初始化minStack时添加一个Integer.MAX_VALUE,防止第一次peek()操作产生空指针异常
//        minStack.push(Integer.MAX_VALUE);
//    }
//
//    public void push(int val) {
//        xStack.push(val);
//        minStack.push(Math.min(minStack.peek(), val));
//    }
//
//    public void pop() {
//        xStack.pop();
//        minStack.pop();
//    }
//
//    public int top() { 
//        return xStack.peek();
//    }
//
//    public int getMin() {
//        return minStack.peek();
//    }
//
//
//    public static void main(String[] args) {
//        MinStack minStack = new MinStack();
//        minStack.push(-2);
//        minStack.push(0);
//        minStack.push(-3);
//        System.out.println(minStack.getMin());
//        minStack.pop();  //出栈
//        System.out.println(minStack.top());
//        System.out.println(minStack.getMin());
//    }
//    
//}

/*
    方法2：使用Stack<Node>
    -栈元素中除了保存当前值外，额外保存当前最小值
 */
public class MinStack {

    private static class Node {
        int val;
        int min;

        public Node(int val, int min) {
            this.val = val;
            this.min = min;
        }
    }

    private Deque<Node> stack;

    public MinStack() {
        stack = new LinkedList<Node>();
    }

    public void push(int val) {
        if (stack.isEmpty()) {
            stack.push(new Node(val, val));
        } else {
            stack.push(new Node(val, Math.min(val, stack.peek().min)));
        }
    }

    public void pop() {
        stack.pop();
    }

    public int top() {
        return stack.peek().val;
    }

    public int getMin() {
        return stack.peek().min;
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin());
        minStack.pop();  //出栈
        System.out.println(minStack.top());
        System.out.println(minStack.getMin());
    }

}
