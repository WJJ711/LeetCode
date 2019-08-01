import com.sun.org.apache.xalan.internal.xsltc.compiler.util.StringStack;

import java.util.Stack;

class MyQueue {
    Stack<Integer> stack;
    Stack<Integer> helper;
    int top;
    /** Initialize your data structure here. */
    public MyQueue() {
        stack= new Stack<Integer>();
        helper=new Stack<>();
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        if(stack.isEmpty()){
            top=x;
        }
        stack.push(x);

    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        while (!stack.isEmpty()){
            helper.push(stack.pop());
        }

        int res=helper.pop();
        if(!helper.isEmpty()){

            top=helper.peek();
        }
        while (!helper.isEmpty()){
            stack.push(helper.pop());
        }
        return res;
    }
    
    /** Get the front element. */
    public int peek() {
        return top;
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stack.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */