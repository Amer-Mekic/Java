// Last updated: 29. 04. 2025. 22:53:10
class Solution {
    public void moveZeroes(int[] nums) {
        int l = 0;
        int r  =0 ;
        while(r < nums.length){
            if(nums[l]==0){
                while(r < nums.length && nums[r]==0)
                    r++;
                if(r<nums.length){
                int temp = nums[l];
                nums[l]=nums[r];
                nums[r]=temp;
                }
            }
            l++;
            r++;
        }
    }
}