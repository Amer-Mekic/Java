class Solution {
    public int[] sortedSquares(int[] nums) {
        // 49, 1, 0, 9, 100
        int[] res = new int[nums.length];
        int l = 0;
        int r = nums.length-1;
        int index = r;
        while(l<=r){
            if(Math.abs(nums[r])>Math.abs(nums[l])){
                res[index]=nums[r]*nums[r];
                r--;
            }
            else{
                res[index]=nums[l]*nums[l];
                l++;
            }
            index--;
        }
        return res;
    }
}