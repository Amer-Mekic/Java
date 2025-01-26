class Solution {
    public int searchInsert(int[] nums, int target) {
        int med=0;
        int l = 0;
        int r = nums.length;
        while(l<=r){
            med = (l+r)/2;
            if(nums[med]<target){
                if(med == nums.length-1)
                    return med+1;
                else if(nums[med+1]>target)
                    return med+1;
            }
            if(nums[med]==target)
                return med;
            else if(nums[med]<target){
                l=med+1;
            }
            else{
                r = med-1;
            }
        }
        return 0;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
    }
}