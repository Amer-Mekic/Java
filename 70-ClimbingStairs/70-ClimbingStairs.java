// Last updated: 06. 05. 2025. 22:24:24
class Solution {
    public int climbStairs(int n) {
        int[] l = new int[n+1];
        l[0]=1; // One way to reach 0
        l[1]=1; // One way to reach 1
        for(int i = 2; i <= n; i++){
            l[i]=l[i-1]+l[i-2];
        }
        return l[n];
    }
}