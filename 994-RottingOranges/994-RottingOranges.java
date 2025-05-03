// Last updated: 03. 05. 2025. 21:46:10
class MyQueue {

    private Stack<Integer> s1;
    private Stack<Integer> s2;
    private int first;

    public MyQueue() {
        s1=new Stack();
        s2=new Stack();
        first = Integer.MIN_VALUE;
    }
    
    public void push(int x) {
        if(s1.isEmpty() && s2.isEmpty())
            first=x;
        s1.push(x);
    }
    
    public int pop() {
        /*
            2  1
            1  2
        */
        int ft = Integer.MIN_VALUE;
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        ft=s2.peek();
        s2.pop();
        if(!s2.isEmpty()) 
            first=s2.peek();
        else 
            first = ft;
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
        return ft;
    }
    
    public int peek() {
        return first;
    }
    
    public boolean empty() {
        return s1.isEmpty() && s2.isEmpty();
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