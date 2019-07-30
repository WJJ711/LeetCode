import java.util.LinkedList;
import java.util.Stack;
import java.util.TreeSet;

/**
 * 法一：使用同步辅助栈，保存最小的
 */

/*class MinStack {

    private Stack<Integer> stack;
    private Stack<Integer> helper;

    *//**
     * initialize your data structure here.
     *//*
    public MinStack() {
        stack=new Stack<>();
        helper=new Stack<>();
    }

    public void push(int x) {
        stack.push(x);
        if(helper.size()==0||helper.peek()>=x){
            helper.push(x);
        }else{

            helper.push(helper.peek());
        }
    }

    public void pop() {
        if(stack.size()>0){
            stack.pop();
            helper.pop();
        }

    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return helper.peek();
    }
}*/

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */

/**
 * 法二,使用不同步最小栈，pop时需要判断
 */
class MinStack {

    private Stack<Integer> stack;
    private Stack<Integer> helper;

    /**
     * initialize your data structure here.
     */
    public MinStack() {
        stack=new Stack<>();
        helper=new Stack<>();
    }

    public void push(int x) {
        stack.push(x);
        if(helper.size()==0||helper.peek()>=x){
            helper.push(x);
        }
    }

    public void pop() {
        if(stack.size()>0){
            //这里必须要用.equals，包装类
            if(helper.peek().equals(stack.pop())){
                helper.pop();
            }
        }

    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return helper.peek();
    }
}