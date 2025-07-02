// Last updated: 02. 07. 2025. 16:47:29
class Solution {
    public int mySqrt(int x) {
        if (x == 0 || x == 1)
            return x;
        int l = 0;
        int r = x/2;
        while(l<=r){
            int mid = l+(r-l)/2;
            System.out.println("Current mid: "+mid+" left: "+l+" right: "+r);
            if(mid*mid == x)
                return mid;
            if((long)mid*mid>(long)x)
                r=mid-1;
            else
                l=mid+1;
        }
        return r;
    }
}