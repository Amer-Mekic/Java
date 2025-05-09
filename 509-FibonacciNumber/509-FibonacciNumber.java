// Last updated: 10. 05. 2025. 00:34:56
class Solution {
    public int fib(int n) {
        
        if(n<=1) return n;
        return fib(n-1) + fib(n-2);
    }
}
    