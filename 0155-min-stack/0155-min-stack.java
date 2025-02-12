class MinStack {
    Stack<Integer> s;
    public MinStack() {
        s = new Stack<>();
    }
    
    public void push(int val) {
        s.push(val);
    }
    
    public void pop() {
        int pop = s.pop();
    }
    
    public int top() {
        return s.peek();
    }
    
    public int getMin() {
        return Collections.min(s);
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */