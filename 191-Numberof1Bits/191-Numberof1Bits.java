class Solution {
    public int hammingWeight(int n) {
        int res = 0;
        int rem = 0;
        while(n != 0){
            res+=(n%2)^0;
            n=n/2;
        }
        return res;
    }
}