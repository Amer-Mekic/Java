class Solution {
    public int getSum(int a, int b) {
        while(b!=0){ // b is carry, when there's no carry return result (a)
            int curr = (a&b) << 1;
            a = a ^ b;
            b = curr;
        }
        return a;
    }
}