import java.util.LinkedList;
import java.util.Queue;

class MyStack {

    /** Initialize your data structure here. */
    Queue<Integer> queue;
    private Integer top;
    public MyStack() {
        queue=new LinkedList<>();
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        queue.add(x);
        top=x;
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        for (int i=0;i<queue.size()-1;i++){
            top = queue.poll();
            queue.add(top);
        }
        return queue.poll();
    }
    
    /** Get the top element. */
    public int top() {
      return top;
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return queue.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */