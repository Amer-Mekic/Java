class Solution {
    public int findMin(int[] nums) {
        int min = Integer.MAX_VALUE;
        int l = 0;
        int r = nums.length-1;
        int med;
        while(l<=r){
            med = (l+r)/2;
            if(nums[med]<min){
                min = nums[med];
            }
            else if(nums[med]>nums[nums.length-1])
                l=med+1;
            else
                r=med-1;
        }
        return min;
    }
}