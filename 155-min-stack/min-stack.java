class MinStack {
    Stack<Integer> in=new Stack<>();
    Stack<Integer> out=new Stack<>();

    public MinStack() {
        
    }
    
    public void push(int value) {
        in.push(value);
        if (out.isEmpty()) {
            out.push(value);
        } else {
            out.push(Math.min(value, out.peek()));
        }
    }
    
    public void pop() {
        in.pop();
        out.pop();
    }
    
    public int top() {
        return in.peek();
    }
    
    public int getMin() {
        return out.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */