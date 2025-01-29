class Solution {
    public int[] countBits(int n) {
        int[] res = new int[n+1];
        int count = 0;
        for(int i = 0; i<=n;i++){
            int curr = i;
            while(curr!=0){
                count+=curr%2;
                curr/=2;
            }
            res[i] = count;
            count=0;
        }
        return res;
    }
}