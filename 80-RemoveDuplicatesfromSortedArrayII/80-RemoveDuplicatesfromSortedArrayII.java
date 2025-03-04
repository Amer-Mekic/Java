class Solution {
    public int removeDuplicates(int[] nums) {
        int f = 2;
        int s = 2;
        while(f<nums.length){
            if(nums[f]==nums[s-2]){
                f++;
            }
            else{
                nums[s++]=nums[f++];
            }
        }
        return s;
    }
}