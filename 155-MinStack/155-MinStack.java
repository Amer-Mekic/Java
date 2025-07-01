// Last updated: 01. 07. 2025. 21:22:11
class MinStack {

    private Stack<Integer> s;
    private Stack<Integer> minS;
    
    public MinStack() {
        s = new Stack<>();
        minS = new Stack<>();
    }
    
    public void push(int val) {
        s.push(val);
        if(minS.isEmpty() || s.peek()<=minS.peek())
            minS.push(val);
    }
    
    public void pop() {
        int temp =  s.pop();
        if(minS.peek()==temp)
            minS.pop();
    }
    
    public int top() {
        return s.peek();
    }
    
    public int getMin() {
        return minS.peek();
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