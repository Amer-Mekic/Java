// Last updated: 02. 07. 2025. 16:50:08
class Solution {
    public int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }
        
        int left = 2;
        int right = x / 2;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            long result = (long)mid * mid;
            
            if (result == x) {
                return mid;
            } else if (result < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return right;
    }
}